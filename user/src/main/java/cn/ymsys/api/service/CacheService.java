package cn.ymsys.api.service;

import cn.ymsys.api.orm.model.User;
import org.apache.catalina.startup.UserConfig;

public interface CacheService {


    void testConnect() throws Exception;


    User getUser(String username) throws Exception;


    UserConfig getUserConfig(String userId) throws Exception;


    void saveUser(User user) throws Exception;


    void saveUser(String username) throws Exception;


    void saveUserConfigs(String userId) throws Exception;


    void deleteUser(String username) throws Exception;


}
