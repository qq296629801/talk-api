package cn.ymsys.api.service;

import cn.ymsys.api.common.request.WordRequest;
import cn.ymsys.api.orm.model.Word;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {
    public Word create(WordRequest vo) {
        return null;
    }

    public List<Word> querys(WordRequest vo) {
        return null;
    }

    public int update(WordRequest vo) {
        return 1;
    }

    public int delete(WordRequest vo) {
        return 1;
    }
}
