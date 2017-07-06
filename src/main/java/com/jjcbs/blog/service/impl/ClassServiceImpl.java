package com.jjcbs.blog.service.impl;

import com.jjcbs.blog.dao.impl.ClassDaoImpl;
import com.jjcbs.blog.lib.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by longbob on 17-7-6.
 */
@Service
public class ClassServiceImpl extends BaseService {
    @Autowired
    public ClassDaoImpl classDao;
}
