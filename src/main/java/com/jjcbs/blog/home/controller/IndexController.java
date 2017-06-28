package com.jjcbs.blog.home.controller;

import com.jjcbs.blog.lib.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/6/26 0026.
 *
 * @author jjc
 */

@Controller
public class IndexController extends BaseController{

    @GetMapping("/index")
    public String index(){
        return "home/index";
    }
}
