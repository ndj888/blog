package com.jjcbs.blog.dao.impl;

import com.jjcbs.blog.dao.entity.BlogArticle;
import com.jjcbs.blog.dao.interfaces.ArticleDaoInterface;
import com.jjcbs.blog.lib.BaseDaoImpl;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/19 0019.
 *
 * @author jjc
 */

@Repository
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class ArticleDaoImpl extends BaseDaoImpl implements ArticleDaoInterface{

    public List getHotTopList(String orderBy, int limit) {
        return session.createQuery("from BlogArticle where isHot = 1 order by :order_by ")
                .setString("order_by" , orderBy)
                .setFirstResult(0)
                .setMaxResults(limit)
                .list();
    }

    public List getNewTopList(int limit) {
        return session.createQuery("from BlogArticle order by updateTime desc ")
                .setFirstResult(0)
                .setMaxResults(limit)
                .list();
    }
}
