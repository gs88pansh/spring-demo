package controller;

import biz.TmpService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TmpController {
    @Resource
    private TmpService tmpService;

    @RequestMapping("/test/{method}")
    @ResponseBody
    public String testController(@PathVariable("method") String method) {
        return "测试方法: " + method + "\n" + tmpService.tmpMethod(method);
    }

}
