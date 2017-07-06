package com.jjcbs.blog.lib;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/19 0019.
 *
 * @author jjc
 */
@Component
public abstract class BaseDaoImpl implements BaseDaoInterface{

    @Autowired
    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    protected static Logger logger = Logger.getLogger("DaoImpl");
    protected Session session;
    protected static final String SET_CACHE = "org.hibernate.cacheable";

    @PostConstruct
    public void init(){
        entityManager = entityManagerFactory.createEntityManager();
        try{
            session = entityManager.unwrap(Session.class);
        }catch (Exception e){
            logger.error(e.getMessage() + "获取session error");
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

    public Object findById(Class className , int id) throws Exception {
        String hql = String.format("from %s where id = %d" , className.getName() , id);
        return session.createQuery(hql).setCacheable(true).list().get(0);
    }

    public void createOrUpdate(Object entity) throws Exception {
        session.saveOrUpdate(entity);
        session.flush();
    }

}
