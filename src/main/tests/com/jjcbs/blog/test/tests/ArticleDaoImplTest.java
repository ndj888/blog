package com.jjcbs.blog.test.tests;

import com.jjcbs.blog.dao.impl.ArticleDaoImpl;
import com.jjcbs.blog.test.lib.BaseUnit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28 0028.
 *
 * @author jjc
 */
public class ArticleDaoImplTest extends BaseUnit{
    @Autowired
    private ArticleDaoImpl articleDao;
    private final static int MAXLEN = 20;
    private final static byte HOT = 1;
    private List<BlogArticle> blogArticleList = new ArrayList<BlogArticle>();
    @Autowired
    private SessionFactory sessionFactory;

    @Before
    public void initData(){
        Session session = sessionFactory.openSession();
        for ( int i = 0 ; i < MAXLEN; i ++ ){
            blogArticleList.add(new BlogArticle());
            blogArticleList.get(i).setTitle("测试:" + Integer.toString(i));
            blogArticleList.get(i).setContentFile("测试硬梆梆无可奈何花落去");
            blogArticleList.get(i).setUserId(1);
            if ( i % 2 == 0){
                blogArticleList.get(i).setIsHot(HOT);
            }
            try{
                session.save(blogArticleList.get(i));
                session.flush();
                session.clear();
            }catch (Exception e){
                Assert.fail("error" + e.getMessage());
            }
        }

    }
    @Test
    public void getHotTopList(){
        List res = articleDao.getHotTopList("updateTime des , hotOrder des" , 5);
        Assert.assertEquals(5 , res.size());
    }

    @Test
    public void getNewTopList(){
        List res = articleDao.getNewTopList(5);
        Assert.assertEquals(5 , res.size());
    }

//    /**
//     * 清除测试使用的资源
//     */
//    @After
//    public void free(){
//        Session session = sessionFactory.openSession();
//        session.createQuery("delete from BlogArticle ").setFirstResult(0).setMaxResults(MAXLEN).executeUpdate();
//    }
}
