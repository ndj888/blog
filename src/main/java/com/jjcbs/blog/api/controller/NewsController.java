package com.jjcbs.blog.api.controller;

import com.jjcbs.blog.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/29 0029.
 *
 * @author jjc
 */
@Controller
public class NewsController {

    @Autowired
    private ArticleServiceImpl articleService;

    @GetMapping("/news/getList")
    public @ResponseBody List getHotNewsList(@RequestParam Integer pageNo
            , @RequestParam Integer pageSize){
        return articleService.getHotTopListByHotOrder();
    }
}
