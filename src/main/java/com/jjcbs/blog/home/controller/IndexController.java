package com.jjcbs.blog.home.controller;

import com.jjcbs.blog.lib.BaseController;
import com.jjcbs.blog.service.impl.ArticleServiceImpl;
import com.jjcbs.blog.service.impl.ConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by Administrator on 2017/6/26 0026.
 *
 * @author jjc
 */

@Controller
public class IndexController extends BaseController{

    @Autowired
    private ArticleServiceImpl articleService;
    @Autowired
    private ConfigServiceImpl configService;


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("articleList" , articleService.articleDao.getHotTopList("hotOrder desc , createTime des" , 5));
        model.addAllAttributes(configService.configDao.getAll(null));
        return "home/index";
    }
}
