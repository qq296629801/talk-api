package cn.ymsys.api.common.websocket.config;

import cn.ymsys.api.common.util.CollectionUtil;
import cn.ymsys.api.mgr.ExtUserMgr;
import cn.ymsys.api.orm.model.Group;
import cn.ymsys.api.orm.model.User;
import cn.ymsys.api.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class CreateGroupConfig {
    @Autowired
    private GroupService groupService;

    private TreeMap<String, Group> groups = new TreeMap<String, Group>();
    private Map<String, List<String>> groupUsers = new HashMap<String, List<String>>();
    @Autowired
    private ExtUserMgr extUserMgr;

    @PostConstruct
    public void initData() {
        for (Group group : groupService.queryGroups(null)) {
            this.putGroup(group);
            List<String> users = new ArrayList<>();
            for (User user : extUserMgr.queryUsers(group.getId())) {
                users.add(user.getId());
            }
            groupUsers.put(group.getId(), users);
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

    public Map<String, List<String>> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(Map<String, List<String>> groupUsers) {
        this.groupUsers = groupUsers;
    }
}
