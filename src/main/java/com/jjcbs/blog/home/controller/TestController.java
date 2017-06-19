package com.jjcbs.blog.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/6/17 0017.
 */

@Controller
public class TestController {

    private static final Logger LOGGER = Logger.getLogger("TestController");
    @GetMapping("/test")
    public @ResponseBody String test(){
        return "hellow world";
    }

    @GetMapping("/hellow")
    public String hellow(){
        LOGGER.info("我在开始显示模板");
        return "index";
    }
}
