package com.jjcbs.blog.lib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/6/19 0019.
 *
 * @author jjc
 */
public class BaseDaoImpl {
    @Autowired
    protected SessionFactory sessionFactory;
    protected Session session;

    public BaseDaoImpl() {
        this.session = sessionFactory.getCurrentSession();
    }
}
