package com.jjcbs.blog.home.controller;

import com.jjcbs.blog.lib.BaseHomeController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by Administrator on 2017/6/26 0026.
 *
 * @author jjc
 */

@Controller
public class IndexController extends BaseHomeController{


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("articleList" , articleService.articleDao.getHotTopList("hotOrder desc , createTime des" , 5));
        return "home/index";
    }

    @GetMapping("/about")
    public String aboutMe(){
        return "home/about";
    }
}
