package cn.ymsys.api.service;

import cn.ymsys.api.common.request.TalkRequest;
import cn.ymsys.api.orm.mapper.TalkMapper;
import cn.ymsys.api.orm.model.Talk;
import cn.ymsys.api.orm.model.TalkExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalkService {
    @Autowired
    private TalkMapper talkMapper;


    public List<Talk> queryTalks(TalkRequest vo) {
        TalkExample example = new TalkExample();
        TalkExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(vo.getUserId());
        criteria.andStatusEqualTo(0);
        return talkMapper.selectByExample(example);
    }

}
