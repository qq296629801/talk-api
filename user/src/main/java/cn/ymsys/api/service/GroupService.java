package cn.ymsys.api.service;

import cn.ymsys.api.common.exception.PortalException;
import cn.ymsys.api.common.request.GroupRequest;
import cn.ymsys.api.common.util.DataUtil;
import cn.ymsys.api.orm.mapper.GroupMapper;
import cn.ymsys.api.orm.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GroupService {

    @Autowired
    private GroupMapper groupMapper;

    public Group insertGroup(GroupRequest vo) {
        if (DataUtil.isEmpty(vo.getGroupName())
                || DataUtil.isNull(vo.getSocketPort())) {
            throw new PortalException("参数有误");
        }

        Group group = new Group();
        group.setGroupName(vo.getGroupName());
        group.setSocketPort(vo.getSocketPort());
        group.setLastOperTime(new Date());
        group.setOperTime(new Date());
        group.setLastOperUser("user");
        group.setOperUser("user");
        groupMapper.insert(group);
        return group;
    }
}
