package wukong.controller;

import wukong.aop.LogTrace;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenxinyue on 2016/3/16.
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    @LogTrace
    public String index() {
        return "Hello world";
    }
}
