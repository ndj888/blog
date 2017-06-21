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
    Object findById(Object entity , int id) throws Exception;

}
