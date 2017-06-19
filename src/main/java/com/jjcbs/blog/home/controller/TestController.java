package com.jjcbs.blog.home.controller;

import com.jjcbs.blog.home.dao.entity.ShopncMemberCommonEntity;
import com.jjcbs.blog.lib.BaseController;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/6/17 0017.
 */

@Controller
public class TestController extends BaseController{

    private static final Logger LOGGER = Logger.getLogger("TestController");

    @GetMapping("/test")
    public @ResponseBody
    String test() {
        return "hellow world";
    }

    @GetMapping("/hellow")
    public String hellow() {
        LOGGER.info("我在开始显示模板");
        return "index";
    }

    @GetMapping("/testhb")
    public @ResponseBody
    ShopncMemberCommonEntity testhb() {
        String hql = "from ShopncMemberCommonEntity where member_id = 29096";
        return (ShopncMemberCommonEntity) this.sessionFactory.getCurrentSession().createQuery(hql).list().get(0);
    }


}
