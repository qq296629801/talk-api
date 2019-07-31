package cn.ymsys.api.service;

import cn.ymsys.api.common.enums.StatusEnum;
import cn.ymsys.api.common.request.GroupRequest;
import cn.ymsys.api.common.response.UserResponse;
import cn.ymsys.api.common.websocket.util.IDUtil;
import cn.ymsys.api.mgr.ExtUserMgr;
import cn.ymsys.api.orm.mapper.GroupMapper;
import cn.ymsys.api.orm.mapper.GroupUserMapper;
import cn.ymsys.api.orm.model.Group;
import cn.ymsys.api.orm.model.GroupExample;
import cn.ymsys.api.orm.model.GroupUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupMapper groupMapper;

    @Autowired
    private GroupUserMapper groupUserMapper;

    @Autowired
    private ExtUserMgr extUserMgr;

    public GroupUser addGroupUsers(GroupRequest vo) {
        GroupUser groupUser = new GroupUser();
        groupUser.setGroupId(vo.getGroupId());
        groupUser.setUserId(vo.getUserId());
        groupUser.setLastOperTime(new Date());
        groupUser.setOperTime(new Date());
        groupUserMapper.insertSelective(groupUser);
        return groupUser;
    }


    public UserResponse queryUsers(GroupRequest vo) {
        return new UserResponse(extUserMgr.queryUsers(vo.getGroupId()));
    }

    public Group create(GroupRequest vo) {
        Group group = new Group();
        group.setGroupName(vo.getGroupName());
        String groupId = IDUtil.randomId();
        group.setId(groupId);
        group.setLastOperTime(new Date());
        group.setOperTime(new Date());
        group.setStatus(0);
        groupMapper.insertSelective(group);
        return group;
    }


    public List<Group> queryGroups(GroupRequest vo) {
        GroupExample example = new GroupExample();
        GroupExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(StatusEnum.NORMAL.getState());
        return groupMapper.selectByExample(example);
    }

    public int update(GroupRequest vo) {
        Group group = new Group();
        group.setId(vo.getGroupId());
        group.setGroupName(vo.getGroupName());
        group.setLastOperTime(new Date());
        group.setOperTime(new Date());

        GroupExample example = new GroupExample();
        GroupExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(StatusEnum.NORMAL.getState());
        return groupMapper.updateByExampleSelective(group, example);
    }

    public int delete(GroupRequest vo) {
        Group group = new Group();
        group.setId(vo.getGroupId());
        group.setStatus(StatusEnum.DELETE.getState());

        GroupExample example = new GroupExample();
        GroupExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(StatusEnum.NORMAL.getState());
        return groupMapper.updateByExampleSelective(group, example);
    }

}
