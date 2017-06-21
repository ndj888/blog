package com.jjcbs.blog.dao.impl;

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
public class ArticleDaoImpl extends BaseDaoImpl{


    /**
     * 获取热门文章
     * @param limit
     * @return
     */
    public List getTopList(Integer limit){
        return sessionFactory.getCurrentSession().createQuery("from BlogArticle").setCacheable(true).setFirstResult(0).setMaxResults(limit).list();
    }
}
