package com.jjcbs.blog.service.impl;

import com.googlecode.ehcache.annotations.Cacheable;
import com.jjcbs.blog.dao.entity.BlogArticle;
import com.jjcbs.blog.dao.impl.ArticleDaoImpl;
import com.jjcbs.blog.lib.BaseService;
import com.jjcbs.blog.pojo.LastAndNextInfo;
import com.jjcbs.blog.service.interfaces.ArticleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Cacheable(cacheName = "myCache")
    public Map<String , ?> readArticle(int id) {
        Map<String , Object> data = new HashMap<String, Object>();
        try{
            BlogArticle article = (BlogArticle) articleDao.findById(BlogArticle.class , id);
            data.put("article" , article);
            data.put("pageInfo" , getLastAndNextInfo(article));
        }catch (Exception e){
            logger.error("找不到文章实体" + e.getMessage());
        }
        return data;
    }

    @Cacheable(cacheName = "myCache")
    public LastAndNextInfo getLastAndNextInfo(BlogArticle article) {
        LastAndNextInfo lastAndNextInfo = new LastAndNextInfo();
        try{
            lastAndNextInfo.setLastObject(articleDao.findById(BlogArticle.class , article.getId() - 1));
        }catch (Exception e){
            logger.error(e.getMessage() + "获取上一页上失败");
        }

        try{
            lastAndNextInfo.setNextObject(articleDao.findById(BlogArticle.class , article.getId() + 1));
        }catch (Exception e){
            logger.error(e.getMessage() + "获取下一页失败");
        }
        return lastAndNextInfo;
    }

    public List getNewListImplPage(int curPage) {
        return null;
    }
}
