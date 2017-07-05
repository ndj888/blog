package com.jjcbs.blog.test.tests;

import com.jjcbs.blog.dao.entity.BlogArticle;
import com.jjcbs.blog.pojo.LastAndNextInfo;
import com.jjcbs.blog.service.impl.ArticleServiceImpl;
import com.jjcbs.blog.test.lib.BaseUnit;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/28 0028.
 *
 * @author jjc
 */
public class ArticleServiceImplTest extends BaseUnit{
    @Autowired
    private ArticleServiceImpl articleService;

    @Test
    public void testGetLastAndNext(){
        try{
            BlogArticle article = (BlogArticle) articleService.articleDao.findById(BlogArticle.class , 167);
            LastAndNextInfo lastAndNextInfo = articleService.getLastAndNextInfo(article);
            Assert.assertNotEquals(lastAndNextInfo.getLastObject() , null);
            Assert.assertNotEquals(lastAndNextInfo.getNextObject() , null);
        }catch (Exception e){
            logger.error(e.getMessage());
        }

    }

    @Test
    public void readArticle(){
        Map map = articleService.readArticle(168);
        Assert.assertNotEquals(map.get("article") , null);
        Assert.assertNotEquals(map.get("pageInfo") , null);
    }

}
