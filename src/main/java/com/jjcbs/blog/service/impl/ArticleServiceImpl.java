package com.jjcbs.blog.service.impl;

import com.googlecode.ehcache.annotations.Cacheable;
import com.jjcbs.blog.dao.impl.ArticleDaoImpl;
import com.jjcbs.blog.lib.BaseService;
import com.jjcbs.blog.service.interfaces.ArticleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30 0030.
 *
 * @author jjc
 */
@Service
public class ArticleServiceImpl extends BaseService implements ArticleServiceInterface {

    @Autowired
    public ArticleDaoImpl articleDao;

    public String uploadImg(MultipartFile file) {
        return null;
    }

    @Cacheable(cacheName = "myCache")
    public List getHotTopListByHotOrder(){
        return articleDao.getHotTopList("hotOrder desc , createTime desc" , 5);
    }

    @Cacheable(cacheName = "myCache")
    public List getNewTopList(){
        return articleDao.getNewTopList(5);
    }
}
