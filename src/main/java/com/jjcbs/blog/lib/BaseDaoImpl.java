package com.jjcbs.blog.lib;


import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


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



    public void create(Object entity) throws Exception {
        try{
            sessionFactory.getCurrentSession().save(entity);
        }catch (Exception e){
            logger.error("DaoImpl create error");
            throw new Exception("DaoImpl create error");
        }
    }

    public void delete(Object entity) throws Exception {
        sessionFactory.getCurrentSession().delete(entity);
    }

    public void update(Object entity) throws Exception {
        sessionFactory.getCurrentSession().update(entity);
    }

    public Object findById(Object entity , int id) throws Exception {
        String hql = String.format("from %s where id = %d" , entity.getClass().getName() , id);
        return sessionFactory.getCurrentSession().createQuery(hql).list().get(0);
    }
}
