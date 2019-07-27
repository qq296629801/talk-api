package cn.ymsys.api.controller;

import cn.ymsys.api.common.request.UserRequest;
import cn.ymsys.api.common.response.JsonResponse;
import cn.ymsys.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/create")
    public JsonResponse create(@RequestBody UserRequest vo) {
        return JsonResponse.success(userService.createUser(vo));
    }

    @RequestMapping("/update")
    public JsonResponse update(@RequestBody UserRequest vo) {
        return JsonResponse.success(userService.updateUser(vo));
    }

    @RequestMapping("/delete")
    public JsonResponse delete(@RequestBody UserRequest vo) {
        return JsonResponse.success(userService.deleteUser(vo));
    }

    @RequestMapping("/querys")
    public JsonResponse querys(@RequestBody UserRequest vo) {
        return JsonResponse.success(userService.queryUsers(vo));
    }


}
