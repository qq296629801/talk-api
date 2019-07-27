package cn.ymsys.api.service;

import cn.ymsys.api.common.enums.StatusEnum;
import cn.ymsys.api.common.request.GroupRequest;
import cn.ymsys.api.orm.mapper.GroupMapper;
import cn.ymsys.api.orm.model.Group;
import cn.ymsys.api.orm.model.GroupExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupMapper groupMapper;

    public Group create(GroupRequest vo) {
        Group group = new Group();
        group.setGroupName(vo.getGroupName());
        group.setSocketPort(vo.getSocketPort());
        group.setLastOperTime(new Date());
        group.setOperTime(new Date());
        groupMapper.insertSelective(group);
        return group;
    }


    public List<Group> querys(GroupRequest vo) {
        GroupExample example = new GroupExample();
        GroupExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(StatusEnum.NORMAL.getState());
        return groupMapper.selectByExample(example);
    }

    public int update(GroupRequest vo) {
        Group group = new Group();
        group.setId(vo.getGroupId());
        group.setGroupName(vo.getGroupName());
        group.setSocketPort(vo.getSocketPort());
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
