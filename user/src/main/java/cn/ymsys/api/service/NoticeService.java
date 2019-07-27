package cn.ymsys.api.service;

import cn.ymsys.api.common.request.NoticeRequest;
import cn.ymsys.api.orm.mapper.NoticeMapper;
import cn.ymsys.api.orm.model.Notice;
import cn.ymsys.api.orm.model.NoticeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    public Notice create(NoticeRequest vo) {
        Notice notice = new Notice();
        notice.setContext(vo.getContext());
        notice.setGroupId(vo.getGroupId());
        notice.setLastOperTime(new Date());
        notice.setOperTime(new Date());
        noticeMapper.insert(notice);
        return notice;
    }

    public List<Notice> querys(NoticeRequest vo) {
        NoticeExample example = new NoticeExample();
        NoticeExample.Criteria criterion = example.createCriteria();
        criterion.andStatusEqualTo(0);
        return noticeMapper.selectByExample(example);
    }

    public int update(NoticeRequest vo) {
        Notice notice = new Notice();
        notice.setId(vo.getNoticeId());
        notice.setContext(vo.getContext());
        notice.setGroupId(vo.getGroupId());
        notice.setLastOperTime(new Date());

        NoticeExample example = new NoticeExample();
        NoticeExample.Criteria criterion = example.createCriteria();
        criterion.andStatusEqualTo(0);
        return noticeMapper.updateByExampleSelective(notice, example);
    }

    public int delete(NoticeRequest vo) {
        NoticeExample example = new NoticeExample();
        NoticeExample.Criteria criterion = example.createCriteria();
        criterion.andStatusEqualTo(0);

        Notice notice = new Notice();
        notice.setStatus(1);
        notice.setId(vo.getNoticeId());
        return noticeMapper.updateByExampleSelective(notice, example);
    }
}
