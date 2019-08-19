package cn.ymsys.api.service;

import cn.ymsys.api.common.request.ChatRequest;
import cn.ymsys.api.mgr.ChatMgr;
import cn.ymsys.api.orm.extend.ExtChat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    @Autowired
    private ChatMgr chatMgr;


    public List<ExtChat> queryChats(ChatRequest vo) {
        return chatMgr.queryChats(vo);
    }


    public void openChat(ChatRequest vo) {
        if (chatMgr.existChat(vo)) {
            chatMgr.update(vo);
        } else {
            chatMgr.save(vo);
        }
    }
}
