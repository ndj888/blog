package com.jjcbs.blog.test.tests;

import com.jjcbs.blog.dao.entity.BlogConfig;
import com.jjcbs.blog.dao.impl.ConfigDaoImpl;
import com.jjcbs.blog.test.lib.BaseUnit;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/6/27 0027.
 *
 * @author jjc
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConfigDaoImplTest extends BaseUnit{
    @Autowired
    private ConfigDaoImpl configDao;
    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void aput(){
        configDao.put("kel" , "dssddssdfsdf");
        BlogConfig blogConfig = configDao.get("kel");
        Assert.assertNotEquals(blogConfig , null);
        Assert.assertNotEquals(blogConfig.getCreateTime() , null);
    }



    @Test
    public void bupdate(){
        String upStr = "testHellowWordyoyo";
        configDao.put("kel" , upStr);
        BlogConfig blogConfig = configDao.get("kel");
        Assert.assertEquals(blogConfig.getConfigVal() , upStr);
    }

    @Test
    public void cdel(){
        try{
            configDao.del("kel");
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
        BlogConfig blogConfig = configDao.get("kel");
        Assert.assertEquals(blogConfig , null);
    }
}
