package com.jjcbs.blog.dao.interfaces;

/**
 * Created by Administrator on 2017/6/26 0026.
 *
 * @author jjc
 */

import com.jjcbs.blog.dao.entity.BlogConfig;

import java.util.Map;

/**
 * Config配置项接口
 */
public interface ConfigDaoInterface {
    /**
     * PUT 一个配置项
     * @param key
     * @param val
     * @return
     */
    boolean put(String key , String val);

    /**
     * 获取一个配置项
     * @param key
     * @return
     */
    BlogConfig get(String key);

    /**
     * 删除一个配置项，当key不存在时会抛出异常
     * @param key
     * @throws Exception
     */
    void del(String key) throws Exception;

    /**
     * 获取所有配置项
     * @param limit
     * @return
     */
    Map<String , BlogConfig> getAll(Integer limit);

}
