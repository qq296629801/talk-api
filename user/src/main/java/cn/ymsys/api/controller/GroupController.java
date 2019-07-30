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

    @RequestMapping("/addUsers")
    public JsonResponse addGroupUsers(@RequestBody GroupRequest vo) {
        return JsonResponse.success(groupService.addGroupUsers(vo));
    }

    @RequestMapping("/create")
    public JsonResponse create(@RequestBody GroupRequest vo) {
        return JsonResponse.success(groupService.create(vo));
    }

    @RequestMapping("/update")
    public JsonResponse update(@RequestBody GroupRequest vo) {
        return JsonResponse.success(groupService.update(vo));
    }

    @RequestMapping("/delete")
    public JsonResponse delete(@RequestBody GroupRequest vo) {
        return JsonResponse.success(groupService.delete(vo));
    }

    @RequestMapping("/querys")
    public JsonResponse querys(@RequestBody GroupRequest vo) {
        return JsonResponse.success(groupService.querys(vo));
    }
}
