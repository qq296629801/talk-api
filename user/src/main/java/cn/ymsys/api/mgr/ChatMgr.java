package cn.ymsys.api.mgr;

import cn.ymsys.api.common.request.ChatRequest;
import cn.ymsys.api.common.util.PagerUtil;
import cn.ymsys.api.orm.extend.ExtChat;
import cn.ymsys.api.orm.extend.ExtChatMapper;
import cn.ymsys.api.orm.mapper.ChatMapper;
import cn.ymsys.api.orm.model.Chat;
import cn.ymsys.api.orm.model.ChatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ChatMgr {
    @Autowired
    private ChatMapper chatMapper;

    @Autowired
    private ExtChatMapper extChatMapper;

    public List<ExtChat> queryChats(ChatRequest vo) {
        List<ExtChat> chats = new ArrayList<>();
        try {
            PagerUtil.startPage(vo);
            chats = extChatMapper.queryChats(vo.getUserId());
        } catch (Exception e) {
            PagerUtil.clearPage(vo);
        }
        return chats;
    }


    public boolean existChat(ChatRequest vo) {
        ChatExample example = new ChatExample();
        ChatExample.Criteria criteria = example.createCriteria();
        criteria.andChatIdEqualTo(vo.getChatId());
        criteria.andChatTypeEqualTo(vo.getChatType());
        criteria.andUserIdEqualTo(vo.getUserId());
        return chatMapper.countByExample(example) > 0 ? true : false;
    }


    public int save(ChatRequest vo) {
        Chat chat = new Chat();
        chat.setChatId(vo.getChatId());
        chat.setChatType(vo.getChatType());
        chat.setContent(vo.getContent());
        chat.setUserId(vo.getUserId());
        chat.setLastOpenTime(new Date());
        chat.setOpenTime(new Date());
        chat.setUnreadStatus(vo.isUnreadStatus());
        chat.setUnreadNumber(0);
        return chatMapper.insertSelective(chat);
    }

    public int update(ChatRequest vo) {
        ChatExample example = new ChatExample();
        ChatExample.Criteria criteria = example.createCriteria();
        criteria.andChatIdEqualTo(vo.getChatId());
        criteria.andChatTypeEqualTo(vo.getChatType());

        Chat chat = new Chat();
        chat.setContent(vo.getContent());
        chat.setLastOpenTime(new Date());
        chat.setUnreadNumber(vo.getUnreadNumber());
        chat.setUnreadStatus(vo.isUnreadStatus());
        return chatMapper.updateByExampleSelective(chat, example);
    }

}
