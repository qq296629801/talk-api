package cn.ymsys.api.controller;

import cn.ymsys.api.common.request.NoticeRequest;
import cn.ymsys.api.common.response.JsonResponse;
import cn.ymsys.api.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/create")
    public JsonResponse create(@RequestBody NoticeRequest vo) {
        return JsonResponse.success(noticeService.create(vo));
    }

    @RequestMapping("/update")
    public JsonResponse update(@RequestBody NoticeRequest vo) {
        return JsonResponse.success(noticeService.update(vo));
    }

    @RequestMapping("/delete")
    public JsonResponse delete(@RequestBody NoticeRequest vo) {
        return JsonResponse.success(noticeService.delete(vo));
    }

    @RequestMapping("/querys")
    public JsonResponse querys(@RequestBody NoticeRequest vo) {
        return JsonResponse.success(noticeService.querys(vo));
    }
}
