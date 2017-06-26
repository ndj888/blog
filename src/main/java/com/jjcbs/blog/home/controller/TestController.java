package com.jjcbs.blog.home.controller;

import com.jjcbs.blog.dao.entity.BlogUser;
import com.jjcbs.blog.dao.impl.ArticleDaoImpl;
import com.jjcbs.blog.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
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
    @Autowired
    private UserDaoImpl userDao;

    @GetMapping("/getList")
    public @ResponseBody
    List getList(){
        return articleDao.getTopList(10);
    }
    @GetMapping("/getUserName")
    public @ResponseBody
    String getUserName(){
        String userName = "";
        try{
            BlogUser userInfo = userDao.getUserInfoById(1);
            userName =  userInfo.getUserName();
        }catch (Exception e){

        }
        return "userName is " + userName;
    }

    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }

    @GetMapping("/hi")
    public @ResponseBody String hi(){
        return "hi world";
    }
}
