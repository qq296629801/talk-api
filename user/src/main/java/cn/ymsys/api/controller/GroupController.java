package cn.ymsys.api.controller;

import cn.ymsys.api.common.request.GroupRequest;
import cn.ymsys.api.common.response.JsonResponse;
import cn.ymsys.api.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @RequestMapping("/create")
    public JsonResponse create(@RequestBody GroupRequest vo) {
        return JsonResponse.success(groupService.insertGroup(vo));
    }
}
