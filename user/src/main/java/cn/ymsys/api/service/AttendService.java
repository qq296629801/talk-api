package cn.ymsys.api.service;

import cn.ymsys.api.common.enums.StatusEnum;
import cn.ymsys.api.common.request.AttendRequest;
import cn.ymsys.api.common.util.IPUtil;
import cn.ymsys.api.orm.mapper.AttendMapper;
import cn.ymsys.api.orm.model.Attend;
import cn.ymsys.api.orm.model.AttendExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class AttendService {
    @Autowired
    private AttendMapper attendMapper;

    public Attend single(AttendRequest vo, HttpServletRequest request) {
        Attend attend = new Attend();
        attend.setAttendTime(new Date());
        attend.setIp(IPUtil.getIpAddr(request));
        attend.setLastOperTime(new Date());
        attend.setStatus(0);
        attendMapper.insertSelective(attend);
        return attend;
    }

    public boolean validate(AttendRequest vo) {
        AttendExample example = new AttendExample();
        AttendExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(StatusEnum.NORMAL.getState());
        criteria.andUserIdEqualTo(vo.getUserId());
        return attendMapper.countByExample(example) > 0 ? true : false;
    }
}
