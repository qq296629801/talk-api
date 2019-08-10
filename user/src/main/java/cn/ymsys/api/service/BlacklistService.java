package cn.ymsys.api.service;

import cn.ymsys.api.orm.mapper.BlacklistMapper;
import cn.ymsys.api.orm.model.BlacklistExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlacklistService {
    @Autowired
    private BlacklistMapper blacklistMapper;

    public boolean checkBlacklist(String groupId, String userId) {
        BlacklistExample example = new BlacklistExample();
        BlacklistExample.Criteria criteria = example.createCriteria();
        criteria.andGroupIdEqualTo(groupId);
        criteria.andUserIdEqualTo(userId);
        criteria.andStatusEqualTo(0);
        return blacklistMapper.countByExample(example) > 0 ? true : false;
    }
}
