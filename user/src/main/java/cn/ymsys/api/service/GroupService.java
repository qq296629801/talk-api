package cn.ymsys.api.service;

import cn.hutool.core.util.IdUtil;
import cn.ymsys.api.common.enums.StatusEnum;
import cn.ymsys.api.common.request.GroupRequest;
import cn.ymsys.api.common.response.UserResponse;
import cn.ymsys.api.common.util.DataUtil;
import cn.ymsys.api.common.util.PagerUtil;
import cn.ymsys.api.orm.extend.ExtGroup;
import cn.ymsys.api.orm.extend.ExtGroupMapper;
import cn.ymsys.api.orm.extend.ExtUserMapper;
import cn.ymsys.api.orm.mapper.GroupMapper;
import cn.ymsys.api.orm.mapper.GroupUserMapper;
import cn.ymsys.api.orm.model.Group;
import cn.ymsys.api.orm.model.GroupExample;
import cn.ymsys.api.orm.model.GroupUser;
import cn.ymsys.api.orm.model.GroupUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupMapper groupMapper;

    @Autowired
    private GroupUserMapper groupUserMapper;

    @Autowired
    private ExtUserMapper extUserMgr;

    @Autowired
    private ExtGroupMapper extGroupMapper;

    public List<ExtGroup> getGroupList(GroupRequest vo) {
        String condition = DataUtil.isEmpty(vo.getCondition()) ? "" : vo.getCondition();
        List<ExtGroup> extGroups = new ArrayList<>();
        try {
            PagerUtil.startPage(vo);
            extGroups = extGroupMapper.getGroupList(vo.getUserId(), "%" + condition + "%");
        } catch (Exception e) {
            PagerUtil.clearPage(vo);
        }
        return extGroups;
    }

    public Group queryByKey(String id) {
        return groupMapper.selectByPrimaryKey(id);
    }

    public GroupUser addGroupUsers(GroupRequest vo) {
        GroupUser groupUser = new GroupUser();
        groupUser.setGroupId(vo.getGroupId());
        groupUser.setUserId(vo.getUserId());
        groupUser.setLastOperTime(new Date());
        groupUser.setOperTime(new Date());
        groupUserMapper.insertSelective(groupUser);
        return groupUser;
    }


    public List<GroupUser> queryGroupsByUserId(String userId) {
        GroupUserExample example = new GroupUserExample();
        GroupUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return groupUserMapper.selectByExample(example);
    }

    public UserResponse queryUsers(GroupRequest vo) {
        return new UserResponse(extUserMgr.queryUsers(vo.getGroupId()));
    }

    public Group create(GroupRequest vo) {
        Group group = new Group();
        group.setGroupName(vo.getGroupName());
        String simpleUUID = IdUtil.simpleUUID();
        group.setId(simpleUUID);
        group.setAvator(vo.getAvator());
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
