package com.jjcbs.blog.dao.interfaces;

import com.jjcbs.blog.dao.entity.BlogClass;


/**
 * Created by Administrator on 2017/7/5 0005.
 *
 * @author jjc
 */
public interface ClassDaoInterface {
    BlogClass getArticleListById(int id);
}
