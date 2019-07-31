package cn.ymsys.api.common.websocket.config;

import cn.ymsys.api.common.util.CollectionUtil;
import cn.ymsys.api.orm.model.Group;
import cn.ymsys.api.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.TreeMap;

@Component
public class CreateGroupConfig {
    @Autowired
    private GroupService groupService;

    private TreeMap<String, Group> groups = new TreeMap<String, Group>();

    @PostConstruct
    public void initData() {
        for (Group group : groupService.queryGroups(null)) {
            this.putGroup(group);
        }
        
        System.out.println("group init....");
    }


    public void putGroup(Group group) {
        CollectionUtil.put(groups, group.getId(), group);
    }

    public List<Group> getGroups() {
        return CollectionUtil.toList(groups);
    }

    public int countGroups() {
        return groups.size();
    }
}
