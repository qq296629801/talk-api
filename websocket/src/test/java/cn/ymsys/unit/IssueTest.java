package cn.ymsys.unit;

import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.handshake.ServerHandshake;
import org.java_websocket.server.DefaultSSLWebSocketServerFactory;
import org.java_websocket.server.WebSocketServer;
import org.junit.Test;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IssueTest {


    @Test(timeout = 15000)
    public void testIssue() throws IOException, URISyntaxException, KeyStoreException, NoSuchAlgorithmException, KeyManagementException, UnrecoverableKeyException, CertificateException, InterruptedException, CertificateException {
        final CountDownLatch countClientOpenLatch = new CountDownLatch(3);
        final CountDownLatch countClientMessageLatch = new CountDownLatch(3);
        final CountDownLatch countServerDownLatch = new CountDownLatch(1);
        int port = 56600;
        final WebSocketClient webSocket = new WebSocketClient(new URI("wss://localhost:" + port)) {
            @Override
            public void onOpen(ServerHandshake handshakedata) {
                countClientOpenLatch.countDown();
            }

            @Override
            public void onMessage(String message) {
                System.err.println(message + "-----client");
            }

            @Override
            public void onClose(int code, String reason, boolean remote) {
            }

            @Override
            public void onError(Exception ex) {
            }
        };
        WebSocketServer server = new MyWebSocketServer(port, countServerDownLatch, countClientMessageLatch);

        // load up the key store
        String STORETYPE = "JKS";
        String KEYSTORE = String.format("keystore.jks", File.separator);
        String STOREPASSWORD = "storepassword";
        String KEYPASSWORD = "keypassword";

        KeyStore ks = KeyStore.getInstance(STORETYPE);
        File kf = new File(KEYSTORE);
        ks.load(new FileInputStream(kf), STOREPASSWORD.toCharArray());

        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(ks, KEYPASSWORD.toCharArray());
        TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
        tmf.init(ks);

        SSLContext sslContext = null;
        sslContext = SSLContext.getInstance("TLS");
        sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

        server.setWebSocketFactory(new DefaultSSLWebSocketServerFactory(sslContext));
        webSocket.setSocketFactory(sslContext.getSocketFactory());
        //server.start();

        ExecutorService exec = Executors.newFixedThreadPool(10);
        exec.submit(server);

        countServerDownLatch.await();
        webSocket.connectBlocking();
        webSocket.send("hi");
        Thread.sleep(10);
        webSocket.closeBlocking();


        //Disconnect manually and reconnect blocking
        webSocket.reconnectBlocking();
        webSocket.send("it's");
        Thread.sleep(10000);
        webSocket.closeBlocking();
        //Disconnect manually and reconnect
        webSocket.reconnect();
        countClientOpenLatch.await();
        webSocket.send("me");
        Thread.sleep(100);
        webSocket.closeBlocking();
        countClientMessageLatch.await();
    }


    private static class MyWebSocketServer extends WebSocketServer {
        private final CountDownLatch countServerLatch;
        private final CountDownLatch countClientMessageLatch;


        public MyWebSocketServer(int port, CountDownLatch serverDownLatch, CountDownLatch countClientMessageLatch) {
            super(new InetSocketAddress(port));
            this.countServerLatch = serverDownLatch;
            this.countClientMessageLatch = countClientMessageLatch;
        }

        @Override
        public void onOpen(WebSocket conn, ClientHandshake handshake) {
        }

        @Override
        public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        }

        @Override
        public void onMessage(WebSocket conn, String message) {
            countClientMessageLatch.countDown();
            conn.send(message);
            System.err.println(message + "---service");
        }

        @Override
        public void onError(WebSocket conn, Exception ex) {
            ex.printStackTrace();
        }

        @Override
        public void onStart() {
            countServerLatch.countDown();
        }
    }
}
