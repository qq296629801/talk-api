package cn.ymsys.api.service;

import cn.ymsys.api.common.request.GroupMsgRequest;
import cn.ymsys.api.common.util.PagerUtil;
import cn.ymsys.api.orm.mapper.GroupMsgMapper;
import cn.ymsys.api.orm.model.GroupMsg;
import cn.ymsys.api.orm.model.GroupMsgExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author mjy
 */
@Service
public class GroupMessageService {

    @Autowired
    private GroupMsgMapper groupMsgMapper;

    public List<GroupMsg> queryGroupMsgs(GroupMsgRequest vo) {
        List<GroupMsg> groupMsgs = new ArrayList<>();
        try {
            PagerUtil.startPage(vo);
            GroupMsgExample example = new GroupMsgExample();
            GroupMsgExample.Criteria criteria = example.createCriteria();
            criteria.andGroupIdEqualTo(vo.getGroupId());
            groupMsgs = groupMsgMapper.selectByExample(example);
        } catch (Exception e) {
            PagerUtil.clearPage(vo);
        }
        return groupMsgs;
    }

    public GroupMsg create(GroupMsgRequest vo) {
        GroupMsg gm = new GroupMsg();
        gm.setGroupId(vo.getGroupId());
        gm.setMsgContext(vo.getMessage());
        gm.setMsgType(vo.getMsgType());
        gm.setSendUid(vo.getSendUid());
        gm.setLastOperTime(new Date());
        gm.setOperTime(new Date());
        groupMsgMapper.insertSelective(gm);
        return gm;
    }

    public int update(GroupMsgRequest vo) {
        GroupMsg gm = new GroupMsg();
        gm.setId(vo.getId());
        gm.setGroupId(vo.getGroupId());
        gm.setMsgContext(vo.getMessage());
        gm.setMsgType(vo.getMsgType());
        gm.setSendUid(vo.getSendUid());
        gm.setLastOperTime(new Date());
        gm.setOperTime(new Date());

        GroupMsgExample example = new GroupMsgExample();
        GroupMsgExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return groupMsgMapper.updateByExampleSelective(gm, example);
    }
}
