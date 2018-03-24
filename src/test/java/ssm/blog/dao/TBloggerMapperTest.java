package ssm.blog.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.blog.entity.TBlogger;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class TBloggerMapperTest {
	@Resource(name="tBloggerMapper")
	private TBloggerMapper tBloggerMapper;

	@Test
	public void testSelectByPrimaryKey() {
		TBlogger tBlogger=tBloggerMapper.selectByPrimaryKey(2);
		System.out.println(tBlogger);
		
	}

}
