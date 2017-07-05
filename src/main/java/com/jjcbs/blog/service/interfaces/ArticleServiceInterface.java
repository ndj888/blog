package com.jjcbs.blog.service.interfaces;

import com.jjcbs.blog.dao.entity.BlogArticle;
import com.jjcbs.blog.pojo.LastAndNextInfo;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/28 0028.
 *
 * @author jjc
 */
public interface ArticleServiceInterface {

    /**
     * 返回图片保存后的路径
     * @param file
     * @return
     */
    String uploadImg(MultipartFile file);

    /**
     * 查看文章
     * @param id
     * @return Map Article pageInfo
     */
    Map readArticle(int id);

    /**
     * 获取当前实体的上一章和下一章
     * @param article
     * @return
     */
    LastAndNextInfo getLastAndNextInfo(BlogArticle article);
}
