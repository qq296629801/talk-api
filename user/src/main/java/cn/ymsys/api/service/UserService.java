package cn.ymsys.api.service;

import cn.ymsys.api.common.request.UserRequest;
import cn.ymsys.api.common.util.DataUtil;
import cn.ymsys.api.common.util.MD5Util;
import cn.ymsys.api.common.websocket.util.IDUtil;
import cn.ymsys.api.orm.mapper.UserMapper;
import cn.ymsys.api.orm.model.User;
import cn.ymsys.api.orm.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String username) {
        return null;
    }

    public int find() {
        return 1;
    }


    public User find(String username, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        criteria.andUserNameEqualTo(username);
        criteria.andPasswordEqualTo(MD5Util.encrypt(username, password));
        List<User> users = userMapper.selectByExample(example);
        return DataUtil.isNull(users) || users.isEmpty() ? null : users.get(0);
    }

    public User create(UserRequest vo) {
        User user = new User();
        String userId = IDUtil.randomId();
        user.setId(userId);
        user.setNickName(vo.getNickName());
        user.setUserName(vo.getUsername());
        user.setPassword(MD5Util.encrypt(vo.getUsername(), vo.getPassword()));
        user.setMoney(0);
        user.setStatus(0);
        user.setOperTime(new Date());
        user.setLastOperTime(new Date());
        userMapper.insertSelective(user);
        return user;
    }


    public List<User> querys(UserRequest vo) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return userMapper.selectByExample(example);
    }

    public int update(UserRequest vo) {
        User user = new User();
        user.setId(vo.getId());
        user.setUserName(vo.getUsername());
        user.setPassword(MD5Util.encrypt(vo.getUsername(), vo.getPassword()));
        user.setMoney(vo.getMoney());
        user.setLastOperTime(new Date());


        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return userMapper.updateByExampleSelective(user, example);
    }

    public int delete(UserRequest vo) {
        User user = new User();
        user.setId(vo.getId());
        user.setStatus(1);

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return userMapper.updateByExampleSelective(user, example);
    }
}
