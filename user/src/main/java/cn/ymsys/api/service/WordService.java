package cn.ymsys.api.service;

import cn.ymsys.api.common.request.WordRequest;
import cn.ymsys.api.orm.mapper.WordMapper;
import cn.ymsys.api.orm.model.Word;
import cn.ymsys.api.orm.model.WordExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class WordService {
    @Autowired
    private WordMapper wordMapper;

    public static List<Word> words;

    @PostConstruct
    public void initData() {
        words = querys(null);
    }

    public Word create(WordRequest vo) {
        Word word = new Word();
        word.setContext(vo.getContext());
        word.setStatus(0);
        wordMapper.insertSelective(word);
        return word;
    }

    public List<Word> querys(WordRequest vo) {
        WordExample example = new WordExample();
        WordExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return wordMapper.selectByExample(example);
    }

    public int update(WordRequest vo) {
        Word word = new Word();
        word.setId(vo.getWordId());
        word.setContext(vo.getContext());

        WordExample example = new WordExample();
        WordExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return wordMapper.updateByExampleSelective(word, example);
    }

    public int delete(WordRequest vo) {
        Word word = new Word();
        word.setId(vo.getWordId());
        word.setStatus(1);

        WordExample example = new WordExample();
        WordExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return wordMapper.updateByExampleSelective(word, example);
    }
}
