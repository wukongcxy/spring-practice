package wukong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenxinyue on 2016/3/16.
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String index() {
        return "Hello world";
    }
}
