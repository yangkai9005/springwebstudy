package com.springweb.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.study.dao.TableTwoMapper;
import com.springweb.study.entity.TableTwo;

@Service
@Transactional
public class TableTwoService {
	@Autowired
	private TableTwoMapper twoDao;
	public void insert(TableTwo two){
		twoDao.insert(two);
	}
}
