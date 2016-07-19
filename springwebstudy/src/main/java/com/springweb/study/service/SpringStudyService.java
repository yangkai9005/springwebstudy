package com.springweb.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.study.entity.TableOne;
import com.springweb.study.entity.TableTwo;

@Service
public class SpringStudyService {
	@Autowired
	private TableOneService oneService;
	@Autowired
	private TableTwoService twoService;
	public void insert(){
		TableOne one = new TableOne();
		one.setName("one");
		one.setValue("1");
		oneService.insert(one);
		
		TableTwo two = new TableTwo();
		two.setName("two");
		two.setValue(null);
		twoService.insert(two);
	}
}
