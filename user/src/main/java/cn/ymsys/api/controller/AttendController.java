package cn.ymsys.api.controller;

import cn.ymsys.api.common.exception.PortalException;
import cn.ymsys.api.common.request.AttendRequest;
import cn.ymsys.api.common.response.JsonResponse;
import cn.ymsys.api.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/attend")
public class AttendController {
    @Autowired
    private AttendService attendService;

    @RequestMapping("/single")
    public JsonResponse create(@RequestBody AttendRequest vo, HttpServletRequest request) {
        if (attendService.validate(vo))
            return JsonResponse.success(attendService.single(vo, request));
        else
            return JsonResponse.success(new PortalException("签到失败"));
    }

}
