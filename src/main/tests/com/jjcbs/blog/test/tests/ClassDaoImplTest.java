package com.jjcbs.blog.test.tests;

import com.jjcbs.blog.dao.entity.BlogClass;
import com.jjcbs.blog.dao.impl.ClassDaoImpl;
import com.jjcbs.blog.test.lib.BaseUnit;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/7/5 0005.
 *
 * @author jjc
 */
public class ClassDaoImplTest extends BaseUnit {
    @Autowired
    private ClassDaoImpl classDao;
    @Test
    public void getAricleListByClassId(){
        BlogClass blogClass = classDao.getArticleListById(1);
        Assert.assertNotEquals(blogClass.getArticles() , null);
    }
}
