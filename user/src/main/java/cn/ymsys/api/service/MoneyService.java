package cn.ymsys.api.service;

import cn.ymsys.api.orm.mapper.MoneyMapper;
import cn.ymsys.api.orm.model.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyService {
    @Autowired
    MoneyMapper moneyMapper;

    public Money create(String userId, String groupId) {
        Money money = new Money();
        money.setUserId(userId);
        money.setGroupId(groupId);
        money.setMoney(10);
        moneyMapper.insertSelective(money);
        return money;
    }
}
