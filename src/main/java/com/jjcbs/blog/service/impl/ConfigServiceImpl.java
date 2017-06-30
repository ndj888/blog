package com.jjcbs.blog.service.impl;

import com.jjcbs.blog.dao.impl.ConfigDaoImpl;
import com.jjcbs.blog.service.interfaces.ConfigServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/30 0030.
 *
 * @author jjc
 */

@Service
public class ConfigServiceImpl implements ConfigServiceInterface {

    @Autowired
    private ConfigDaoImpl configDao;
}
