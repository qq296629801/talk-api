package cn.ymsys.api.service;

import cn.ymsys.api.common.request.ChatRequest;
import cn.ymsys.api.common.util.DataUtil;
import cn.ymsys.api.common.util.PagerUtil;
import cn.ymsys.api.orm.mapper.ChatMapper;
import cn.ymsys.api.orm.model.Chat;
import cn.ymsys.api.orm.model.ChatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatMapper chatMapper;


    public List<Chat> queryChats(ChatRequest vo) {
        List<Chat> chats = new ArrayList<Chat>();
        try {
            PagerUtil.startPage(vo);
            ChatExample example = new ChatExample();
            ChatExample.Criteria criteria = example.createCriteria();
            criteria.andUserIdEqualTo(vo.getUserId());
            criteria.andStatusEqualTo(0);
            chats = chatMapper.selectByExample(example);
            example.setOrderByClause("last_open_time desc");
        } catch (Exception e) {
            PagerUtil.clearPage(vo);
        }
        return chats;
    }

    public boolean checkChat(ChatRequest vo) {
        ChatExample example = new ChatExample();
        ChatExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(vo.getUserId());
        criteria.andChatTypeEqualTo(vo.getChatType());
        criteria.andChatIdEqualTo(vo.getChatId());
        criteria.andStatusEqualTo(0);
        return chatMapper.countByExample(example) > 0 ? true : false;
    }

    public Chat queryByPara(ChatRequest vo) {
        ChatExample example = new ChatExample();
        ChatExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(vo.getUserId());
        criteria.andChatTypeEqualTo(vo.getChatType());
        criteria.andChatIdEqualTo(vo.getChatId());
        criteria.andStatusEqualTo(0);
        return chatMapper.selectByExample(example).get(0);
    }


    public Chat openChat(ChatRequest vo) {
        Chat chat = queryByPara(vo);
        if (DataUtil.isNull(chat)) {
            chat = new Chat();
            chat.setChatId(vo.getChatId());
            chat.setChatType(vo.getChatType());
            chat.setDesc(vo.getDesc());
            chat.setLastOpenTime(new Date());
            chat.setOpenTime(new Date());
            chatMapper.insertSelective(chat);
        } else {
            chat.setDesc(vo.getDesc());
            chat.setLastOpenTime(new Date());
            chatMapper.updateByPrimaryKeySelective(chat);
        }
        return chat;
    }


    public int closeChat(ChatRequest vo) {
        return chatMapper.deleteByPrimaryKey(vo.getId());
    }

}
