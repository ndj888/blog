package com.jjcbs.blog.lib;


import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * Created by Administrator on 2017/6/19 0019.
 *
 * @author jjc
 */
@Component
public abstract class BaseDaoImpl implements BaseDaoInterface{

    @Autowired
    protected SessionFactory sessionFactory;
    protected static Logger logger = Logger.getLogger("DaoImpl");
    protected Session session;

    @PostConstruct
    public void init(){
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
    }
    public void create(Object entity) throws Exception {
        session.save(entity);
        session.flush();
    }

    public void delete(Object entity) throws Exception {
        session.delete(entity);
        session.flush();
    }

    public void update(Object entity) throws Exception {
        session.update(entity);
        session.flush();
    }

    public Object findById(Object entity , int id) throws Exception {
        String hql = String.format("from %s where id = %d" , entity.getClass().getName() , id);
        return session.createQuery(hql).list().get(0);
    }

    public void createOrUpdate(Object entity) throws Exception {
        session.saveOrUpdate(entity);
        session.flush();
    }
}
