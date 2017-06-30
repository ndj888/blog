package com.jjcbs.blog.test.tests;

import com.jjcbs.blog.pojo.FriendLinks;
import com.jjcbs.blog.service.impl.ConfigServiceImpl;
import com.jjcbs.blog.test.lib.BaseUnit;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/30 0030.
 *
 * @author jjc
 */
public class ConfigServiceImplTest extends BaseUnit{

    @Autowired
    private ConfigServiceImpl configService;

    @Test
    public void setFriendLinks(){
        List<Map<String,String>> data = new ArrayList<Map<String, String>>();
        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("title" , "百度");
        map1.put("href" , "http://www.baidu.com");
        data.add(map1);
        List<FriendLinks> linksList = configService.createFriendLinks(data);
        Assert.assertTrue(configService.setFriendLinks(linksList));
    }

    @Test
    public void getFriendLinks(){
        List list = configService.getFriendLinks();
        Assert.assertNotEquals(list , null);
    }
}
