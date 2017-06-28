package com.jjcbs.blog.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/22 0022.
 *
 * @author jjc
 */

@Controller
@RequestMapping("/admin")
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "admin/login";
    }

}
