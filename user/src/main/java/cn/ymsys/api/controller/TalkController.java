package cn.ymsys.api.controller;

import cn.ymsys.api.common.request.TalkRequest;
import cn.ymsys.api.common.response.JsonResponse;
import cn.ymsys.api.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talk")
public class TalkController {
    @Autowired
    private TalkService talkService;

    @RequestMapping("/queryTalks")
    public JsonResponse queryTalks(@RequestBody TalkRequest vo) {
        return JsonResponse.success(talkService.queryTalks(vo));
    }
}
