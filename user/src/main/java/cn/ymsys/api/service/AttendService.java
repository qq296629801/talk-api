package cn.ymsys.api.service;

import cn.ymsys.api.common.enums.StatusEnum;
import cn.ymsys.api.common.request.AttendRequest;
import cn.ymsys.api.common.request.UserRequest;
import cn.ymsys.api.orm.mapper.AttendMapper;
import cn.ymsys.api.orm.model.Attend;
import cn.ymsys.api.orm.model.AttendExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AttendService {
    @Autowired
    private AttendMapper attendMapper;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    @Autowired
    private MoneyService moneyService;
    @Autowired
    private UserService userService;

    @Transient
    public void single(AttendRequest vo) {
        Attend attend = new Attend();
        attend.setAttendTime(sdf.format(new Date()));
        attend.setIp("");
        attend.setLastOperTime(new Date());
        attend.setStatus(0);
        attendMapper.insertSelective(attend);
        moneyService.create(vo.getUserId(), vo.getGroupId());
        UserRequest userReq = new UserRequest();
        userReq.setId(vo.getUserId());
        userReq.setMoney(10);
        userService.update(userReq);
    }

    public boolean validate(AttendRequest vo) {
        AttendExample example = new AttendExample();
        AttendExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(StatusEnum.NORMAL.getState());
        criteria.andUserIdEqualTo(vo.getUserId());
        criteria.andGroupIdEqualTo(vo.getGroupId());
        criteria.andAttendTimeEqualTo(sdf.format(new Date()));
        return attendMapper.countByExample(example) > 0 ? true : false;
    }
}
