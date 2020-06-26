package cn.zp.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp
 * @Description:
 * @date 2020/6/26 下午2:13
 */
@RestController("/test")
public class MyController {

    @RequestMapping("/getName")
    public String getName(){
        return "hello";
    }
}