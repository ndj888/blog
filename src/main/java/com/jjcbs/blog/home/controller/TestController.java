package com.jjcbs.blog.home.controller;

import com.jjcbs.blog.dao.impl.ArticleDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/6/21 0021.
 *
 * @author jjc
 */

@Controller
public class TestController {
    @Autowired
    private ArticleDaoImpl articleDao;

    @GetMapping("/getList")
    public @ResponseBody
    List getList(){
        return articleDao.getTopList(10);
    }
}
