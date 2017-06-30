package com.jjcbs.blog.service.interfaces;

import com.jjcbs.blog.pojo.FriendLinks;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30 0030.
 *
 * @author jjc
 */
public interface ConfigServiceInterface {
    /**
     * 获取友情链接
     * @return
     */
    List getFriendLinks();

    /**
     * 设置友情链接
     * @return
     */
    boolean setFriendLinks(List<FriendLinks> list);
}
