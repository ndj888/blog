package com.jjcbs.blog.dao.interfaces;

import com.jjcbs.blog.dao.entity.BlogConfig;
import com.jjcbs.blog.dao.entity.BlogUser;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/21 0021.
 *
 * @author jjc
 */
public interface UserDaoInterface {
    /**
     * 根据条件查询用户是否存在
     * @param where
     * @return
     */
     boolean userIsexist(Map<String , String > where);

    /**
     * 获取用户信息通过userid
     * @param id
     * @return
     */
     BlogUser getUserInfoById(int id) throws Exception;
}
