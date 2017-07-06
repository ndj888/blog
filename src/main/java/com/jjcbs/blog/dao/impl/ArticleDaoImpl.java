package com.jjcbs.blog.dao.impl;

import com.googlecode.ehcache.annotations.Cacheable;
import com.jjcbs.blog.dao.interfaces.ArticleDaoInterface;
import com.jjcbs.blog.lib.BaseDaoImpl;
import org.hibernate.jpa.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/19 0019.
 *
 * @author jjc
 */

@Repository
public class ArticleDaoImpl extends BaseDaoImpl implements ArticleDaoInterface{

    private static final int PAGE_SIZE = 10;

    @Cacheable(cacheName = "myCache")
    public List getHotTopList(String orderBy, int limit) {
        return entityManager.createQuery("from BlogArticle where isHot = 1 order by :order_by ")
                .setHint( SET_CACHE , "true")
                .setParameter("order_by" , orderBy)
                .setFirstResult(0)
                .setMaxResults(limit)
                .getResultList();
    }

    @Cacheable(cacheName = "myCache")
    public List getNewTopList(int limit) {
        return session.createQuery("from BlogArticle order by updateTime desc ")
                .setCacheable(true)
                .setFirstResult(0)
                .setMaxResults(limit)
                .list();
    }

    @Cacheable(cacheName = "myCache")
    public List getNewListImplPage(int curPage) {
        int t = curPage - 1 <= 0 ? 0 : curPage;
        return entityManager.createQuery("from BlogArticle order by createTime desc ,isHot desc ")
                .setHint(QueryHints.HINT_CACHEABLE , true)
                .setFirstResult(t)
                .setMaxResults(PAGE_SIZE)
                .getResultList();
    }
}
