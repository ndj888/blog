package com.jjcbs.blog.service.interfaces;

import com.jjcbs.blog.dao.entity.BlogArticle;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

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


}
