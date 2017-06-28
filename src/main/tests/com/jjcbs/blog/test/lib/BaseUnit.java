package com.jjcbs.blog.test.lib;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/6/26 0026.
 *
 * @author jjc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test/applicationContext-test.xml")
public class BaseUnit extends AbstractJUnit4SpringContextTests{

}
