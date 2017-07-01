package com.jjcbs.blog.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjcbs.blog.dao.impl.ConfigDaoImpl;
import com.jjcbs.blog.lib.BaseService;
import com.jjcbs.blog.pojo.FriendLinks;
import com.jjcbs.blog.service.interfaces.ConfigServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/30 0030.
 *
 * @author jjc
 */

@Service
public class ConfigServiceImpl extends BaseService implements ConfigServiceInterface {

    private static final String FRIEND_LINKS_NAME = "friendLink";
    private static ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public ConfigDaoImpl configDao;

    public List getFriendLinks() {
        BlogConfig blogConfig = configDao.get(FRIEND_LINKS_NAME);
        try {
            return objectMapper.readValue(blogConfig.getConfigVal(),
                    objectMapper.getTypeFactory().constructParametricType(ArrayList.class, FriendLinks.class)
            );
        } catch (IOException e) {
            logger.error("json to FriendLinks error");
        }
        return null;
    }

    @Transactional(rollbackFor = JsonProcessingException.class)
    public boolean setFriendLinks(List<FriendLinks> list) {
        String val;
        try {
            val = objectMapper.writeValueAsString(list);
            configDao.put(FRIEND_LINKS_NAME, val);
            return true;
        } catch (JsonProcessingException e) {
            logger.error("obj to json error");
        }
        return false;
    }

    /**
     * 创建友情链接对象
     *
     * @return
     */
    public List<FriendLinks> createFriendLinks(List<Map<String, String>> list) {
        List<FriendLinks> linksList = new ArrayList<FriendLinks>();
        for (Map map : list) {
            FriendLinks temp = new FriendLinks();
            temp.setHref((String) map.get("href"));
            temp.setTitle((String) map.get("title"));
            linksList.add(temp);
        }
        return linksList;
    }
}
