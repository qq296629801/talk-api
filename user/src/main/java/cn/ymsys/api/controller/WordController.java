package cn.ymsys.api.controller;

import cn.ymsys.api.common.request.WordRequest;
import cn.ymsys.api.common.response.JsonResponse;
import cn.ymsys.api.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class WordController {
    @Autowired
    private WordService wordService;


    @RequestMapping("/create")
    public JsonResponse create(@RequestBody WordRequest vo) {
        return JsonResponse.success(wordService.create(vo));
    }

    @RequestMapping("/update")
    public JsonResponse update(@RequestBody WordRequest vo) {
        return JsonResponse.success(wordService.update(vo));
    }

    @RequestMapping("/delete")
    public JsonResponse delete(@RequestBody WordRequest vo) {
        return JsonResponse.success(wordService.delete(vo));
    }

    @RequestMapping("/querys")
    public JsonResponse querys(@RequestBody WordRequest vo) {
        return JsonResponse.success(wordService.querys(vo));
    }
}
