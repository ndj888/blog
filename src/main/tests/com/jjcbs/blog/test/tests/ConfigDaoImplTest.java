package com.jjcbs.blog.test.tests;

import com.jjcbs.blog.dao.entity.BlogConfig;
import com.jjcbs.blog.dao.impl.ConfigDaoImpl;
import com.jjcbs.blog.test.lib.BaseUnit;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/27 0027.
 *
 * @author jjc
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConfigDaoImplTest extends BaseUnit{
    @Autowired
    private ConfigDaoImpl configDao;
    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void aput(){
        configDao.put("kel" , "dssddssdfsdf");
        BlogConfig blogConfig = configDao.get("kel");
        Assert.assertNotEquals(blogConfig , null);
        Assert.assertNotEquals(blogConfig.getCreateTime() , null);
    }



    @Test
    public void bupdate(){
        String upStr = "testHellowWordyoyo";
        configDao.put("kel" , upStr);
        BlogConfig blogConfig = configDao.get("kel");
        Assert.assertEquals(blogConfig.getConfigVal() , upStr);
    }


    @Test
    public void cGetAllConfig(){
        Map<String , BlogConfig> res = configDao.getAll(null);
        Assert.assertFalse(res.isEmpty());
        Assert.assertFalse(res.get("kel") == null);
    }

    @Test
    public void ddel(){
        try{
            configDao.del("kel");
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
        BlogConfig blogConfig = configDao.get("kel");
        Assert.assertEquals(blogConfig , null);
    }

    @Test
    public void initTestData(){
        configDao.put("nickName" , "梦幻流苏");
        configDao.put("signature" , "梦幻流苏的个人博客啊，没事儿常来看看呗");
        configDao.put("mood_ch" , "一个人的道路总是那么漫长！");
        configDao.put("mood_en" , "A person's road is always so long");
        configDao.put("headImg" , "http://cdnq.duitang.com/uploads/item/201504/15/20150415H0546_YGatC.thumb.224_0.jpeg");
        configDao.put("subTitle1" ,"我爱你");
        configDao.put("subTitle2" , "jjcbs");
        configDao.put("nickNameFull" , "梦幻流苏 | LongBob");
        configDao.put("job" , "PHP高级工程师");
        configDao.put("address" , "四川省-达州市");
        configDao.put("mobile" , "15823978441");
        configDao.put("email" , "710190609@qq.com");
        configDao.put("friendLink" , "{\"测试\": \"http://www.baidu.com\" , \"测试2\" : \"http://www.qq.com\"}");
        configDao.put("putNo" , "蜀ICP备11002373号-1");
        configDao.put("copyright" , "jjcbs版权所有");
    }

    @Test
    @Ignore
    public void delTestData(){

    }

    @Test
    public void getFriendLinks(){

    }

    @Test
    public void setFriendLinks(){

    }
}
