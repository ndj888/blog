package com.jjcbs.blog.test.tests;

/**
 * Created by Administrator on 2017/6/28 0028.
 *
 * @author jjc
 */

import com.jjcbs.blog.dao.entity.BlogConfig;
import com.jjcbs.blog.test.lib.BaseUnit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 常用配置正确性测试用例
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GlobalConfigTest extends BaseUnit {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    @Before
    public void before() {
        session = sessionFactory.openSession();
    }

    /**
     * 测试事务是否配置OK
     */
    @Test(expected = Exception.class)
    @Transactional(rollbackFor = Exception.class)
    public void aTestTransactionalIsOk() throws Exception {
        BlogConfig blogConfig = new BlogConfig();
        blogConfig.setConfigVal("test123");
        blogConfig.setConfigVal("hellowworld");
        session.save(blogConfig);
        session.flush();
        throw new Exception("异常回滚");
    }

    @Test
    public void bCheckDataEmpty() {
        List res = session.createQuery("from BlogConfig where configKey = :k").setString("k", "test123").list();
        Assert.assertTrue(res.isEmpty());
    }

    @Test
    public void cTestOkWrite() {
        BlogConfig blogConfig = new BlogConfig();
        blogConfig.setConfigKey("test123");
        blogConfig.setConfigVal("hellowworld");
        session.save(blogConfig);
        session.flush();

        Assert.assertNotEquals(session.createQuery("from BlogConfig where configKey = :k").setString("k", "test123").list().get(0), null);
    }
}
