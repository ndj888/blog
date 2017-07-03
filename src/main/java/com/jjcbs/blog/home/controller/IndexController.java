package com.jjcbs.blog.home.controller;

import com.googlecode.ehcache.annotations.Cacheable;
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
    @Cacheable(cacheName = "myCache")
    public String index(Model model){
        model.addAttribute("articleList" , articleService.getHotTopListByHotOrder());
        return "home/index";
    }

    @GetMapping("/about")
    @Cacheable(cacheName = "myCache")
    public String aboutMe(){
        return "home/about";
    }
}
