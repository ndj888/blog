package com.jjcbs.blog.dao.interfaces;

/**
 * Created by Administrator on 2017/6/21 0021.
 *
 * @author jjc
 */


import java.util.List;

/**
 * ArticleDao interface
 */
public interface ArticleDaoInterface {

    /**
     * 获取热门文章列表
     * @param orderBy
     * @param limit
     * @return
     */
    List getHotTopList(String orderBy , int limit);

    /**
     * 获取最新文章
     * @param limit
     * @return
     */
    List getNewTopList(int limit);


}
