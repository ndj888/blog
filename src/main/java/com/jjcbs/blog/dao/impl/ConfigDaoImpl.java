package com.jjcbs.blog.dao.impl;

import com.jjcbs.blog.dao.entity.BlogConfig;
import com.jjcbs.blog.dao.interfaces.ConfigDaoInterface;
import com.jjcbs.blog.lib.BaseDaoImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Administrator on 2017/6/26 0026.
 *
 * @author jjc
 */
@Transactional(rollbackFor = Exception.class)
@Repository
public class ConfigDaoImpl extends BaseDaoImpl implements ConfigDaoInterface {

    public boolean put(String key, String val) {
        BlogConfig blogConfig =  get(key);
        if ( null == blogConfig) blogConfig = new BlogConfig();
        blogConfig.setConfigKey(key);
        blogConfig.setConfigVal(val);
        try {
            createOrUpdate(blogConfig);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return false;
    }

    public BlogConfig get(String key) {
        String dql = "from BlogConfig as c where configKey = :keys";
        try{
            return (BlogConfig) (session.createQuery(dql).setString("keys" , key).list().get(0));
        }catch (Exception e){
            logger.error("通过key:" + key + " 找不到实体");
        }
        return null;
    }

    public void del(String key) throws Exception {
        delete(get(key));
    }
}
