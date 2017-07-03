package com.jjcbs.blog.lib;

import com.jjcbs.blog.service.impl.ArticleServiceImpl;
import com.jjcbs.blog.service.impl.ConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by longbob on 17-7-2.
 */

@Component
public class BaseHomeController extends BaseController{

    @Autowired
    protected ArticleServiceImpl articleService;
    @Autowired
    protected ConfigServiceImpl configService;

    @ModelAttribute
    public void comModel(Model model){
        model.addAttribute("hotArticleList" , articleService.getHotTopListByHotOrder());
        model.addAllAttributes(configService.configDao.getAll(null));
        model.addAttribute("friendLinks" ,configService.getFriendLinks());
        model.addAttribute("newsList" , articleService.getNewTopList());

    }
}
