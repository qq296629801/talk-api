package cn.ymsys.api.service;

import cn.ymsys.api.common.request.NoticeRequest;
import cn.ymsys.api.orm.model.Word;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    public Word create(NoticeRequest vo) {
        return null;
    }

    public List<Word> querys(NoticeRequest vo) {
        return null;
    }

    public int update(NoticeRequest vo) {
        return 1;
    }

    public int delete(NoticeRequest vo) {
        return 1;
    }
}
