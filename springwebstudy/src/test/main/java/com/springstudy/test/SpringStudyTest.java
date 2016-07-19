package com.springstudy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springweb.study.service.SpringStudyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring.xml","classpath:spring/spring-mvc.xml","classpath:spring/spring-mybatis.xml"})
public class SpringStudyTest {
	@Autowired
	private SpringStudyService studyService;
	@Test
	public void test(){
		studyService.insert();
	}
}
