package com.jjcbs.blog.dao.impl;

import com.jjcbs.blog.dao.entity.BlogArticle;
import com.jjcbs.blog.lib.BaseDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/19 0019.
 *
 * @author jjc
 */

public class ArticleDaoImpl extends BaseDaoImpl{


    /**
     * 获取热门文章
     * @param limit
     * @return
     */
    public List getTopList(Integer limit){
        return this.session.createQuery("from BlogArticle").setFirstResult(0).setMaxResults(limit).list();
    }
}
