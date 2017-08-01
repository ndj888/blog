package com.jjcbs.blog.lib;

/**
 * Created by Administrator on 2017/6/21 0021.
 *
 * @author jjc
 */

/**
 * base DaoInterface
 */
public interface BaseDaoInterface {

    void create(Object entity) throws Exception;
    void delete(Object entity) throws Exception;
    void update(Object entity) throws Exception;
    void createOrUpdate(Object entity) throws Exception;
    Object findById(Class className , int id) throws Exception;

    /**
     * 获取总记录数
     * @return
     */
    int getCount();

}
