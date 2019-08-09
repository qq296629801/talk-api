package cn.ymsys.api.service;

import cn.ymsys.api.common.domain.ActiveUser;
import cn.ymsys.api.common.domain.RedisInfo;
import cn.ymsys.api.common.exception.PortalException;
import cn.ymsys.api.common.exception.RedisConnectException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface RedisService {


    List<RedisInfo> getRedisInfo() throws RedisConnectException;


    Map<String, Object> getKeysSize() throws RedisConnectException;

    Map<String, Object> getMemoryInfo() throws RedisConnectException;


    Set<String> getKeys(String pattern) throws RedisConnectException;


    String get(String key) throws RedisConnectException;


    String set(String key, String value) throws RedisConnectException;


    String set(String key, String value, Long milliscends) throws RedisConnectException;


    Long del(String... key) throws RedisConnectException;


    Boolean exists(String key) throws RedisConnectException;


    Long pttl(String key) throws RedisConnectException;

    Long pexpire(String key, Long milliscends) throws RedisConnectException;


    Long pexpireAt(String key, Long millisecondsTimestamp) throws RedisConnectException;


    Long zadd(String key, Double score, String member) throws RedisConnectException;


    Set<String> zrangeByScore(String key, String min, String max) throws RedisConnectException;


    Long zremrangeByScore(String key, String start, String end) throws RedisConnectException;


    Long zrem(String key, String... members) throws RedisConnectException;

    Set<String> zrevrangebyscore(String key, String max, String min, int offset, int count) throws RedisConnectException;


    Long sadd(String key, String... member) throws RedisConnectException;


    Set<String> smembers(String key) throws RedisConnectException;


    boolean sismember(String key, String member) throws RedisConnectException;


    Long srtem(String key, String... members) throws RedisConnectException;


    Set<String> sunion(String... key) throws RedisConnectException;


    Long pfadd(String key, String... value) throws RedisConnectException;


    Long scard(String key) throws RedisConnectException;


    Long zcard(String key) throws RedisConnectException;

    Long ttl(String key) throws RedisConnectException;


    Long incr(String key) throws RedisConnectException;


    Number execute(ImmutableList<String> keys, Long times, Long pexpire);


    void kickOut(String user, ObjectMapper mapper) throws PortalException;

    
    List<ActiveUser> onlineUser(String user, ObjectMapper mapper) throws RedisConnectException, IOException;
}
