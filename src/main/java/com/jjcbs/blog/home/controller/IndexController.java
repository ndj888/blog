package com.jjcbs.blog.home.controller;

import com.googlecode.ehcache.annotations.Cacheable;
import com.jjcbs.blog.lib.BaseHomeController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Administrator on 2017/6/26 0026.
 *
 * @author jjc
 */

@Controller
public class IndexController extends BaseHomeController{


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("articleList" , articleService.getHotTopListByHotOrder());
        return "home/index";
    }

    @GetMapping("/about")
    public String aboutMe(){
        return "home/about";
    }

    @RequestMapping(value = { "/news/{id:\\d+}" }, method = { RequestMethod.GET })
    public String news(@PathVariable int id , Model model){
        model.addAllAttributes( articleService.readArticle(id));
        return "home/news";
    }
}
