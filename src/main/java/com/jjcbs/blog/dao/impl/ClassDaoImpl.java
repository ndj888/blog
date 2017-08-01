package com.jjcbs.blog.dao.impl;

import com.jjcbs.blog.dao.entity.BlogClass;
import com.jjcbs.blog.dao.interfaces.ClassDaoInterface;
import com.jjcbs.blog.lib.BaseDaoImpl;
import org.springframework.stereotype.Repository;


/**
 * Created by Administrator on 2017/7/5 0005.
 *
 * @author jjc
 */
@Repository
public class ClassDaoImpl extends BaseDaoImpl implements ClassDaoInterface {

    public BlogClass getArticleListById(int id) {
        return entityManager.find(BlogClass.class , id);
    }

    public int getCount() {
        return entityManager.createQuery("select count(*) from BlogClass")
                .getFirstResult();
    }
}
