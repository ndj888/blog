package com.jjcbs.blog.dao.impl;

import com.jjcbs.blog.dao.entity.BlogUser;
import com.jjcbs.blog.dao.interfaces.UserDaoInterface;
import com.jjcbs.blog.lib.BaseDaoImpl;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/21 0021.
 *
 * @author jjc
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDaoInterface {
    public boolean userIsexist(Map<String, String> where) {
        int id =  Integer.parseInt(where.get("id"));
        try{
            BlogUser userInfo = (BlogUser) findById(new BlogUser() ,id);
            return userInfo != null;
        }catch (Exception e){
            logger.error("找不到用户信息: id :" + id );
        }
        return false;
    }

    public BlogUser getUserInfoById(int id) throws Exception{
        try{
            return (BlogUser) findById(new BlogUser() ,id);
        }catch (Exception e){
            logger.error("找不到用户信息: id :" + id );
        }
        return null;
    }
}
