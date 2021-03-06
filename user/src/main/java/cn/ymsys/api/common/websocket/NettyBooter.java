package cn.ymsys.api.common.websocket;

import cn.ymsys.api.common.websocket.config.NettyProperties;
import cn.ymsys.api.common.websocket.server.TcpChatServer;
import cn.ymsys.api.common.websocket.server.WebSocketChatServer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * NettyServer启动器
 *
 * @author mjy
 * @date 2019-04-22
 */
@Component
public class NettyBooter implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * Netty属性配置
     */
    private final NettyProperties nettyProperties;

    /**
     * WebSocket服务端启动器
     */
    private final WebSocketChatServer webSocketChatServer;

    /**
     * Tcp服务端启动器
     */
    private final TcpChatServer tcpChatServer;

    public NettyBooter(WebSocketChatServer webSocketChatServer, TcpChatServer tcpChatServer, NettyProperties nettyProperties) {
        this.webSocketChatServer = webSocketChatServer;
        this.tcpChatServer = tcpChatServer;
        this.nettyProperties = nettyProperties;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getParent() == null) {
            // 根据netty配置协议，运行不同的启动器
            if ("websocket".equals(nettyProperties.getProtocol().toLowerCase())) {
                webSocketChatServer.start();
            } else {
                tcpChatServer.start();
            }
        }
    }
}
