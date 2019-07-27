package cn.ymsys.api.service;

import cn.ymsys.api.common.request.UserRequest;
import cn.ymsys.api.common.util.MD5Util;
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


    public User create(UserRequest vo) {
        User user = new User();
        user.setUserName(vo.getUsername());
        user.setPassword(MD5Util.encrypt(vo.getUsername(), vo.getPassword()));
        user.setMoney(0);
        user.setStatus(0);
        user.setOperTime(new Date());
        user.setLastOperTime(new Date());
        userMapper.insert(user);
        return user;
    }


    public List<User> querys(UserRequest vo) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return userMapper.selectByExample(example);
    }

    public int update(UserRequest vo) {
        return 1;
    }

    public int delete(UserRequest vo) {
        return 1;
    }
}
