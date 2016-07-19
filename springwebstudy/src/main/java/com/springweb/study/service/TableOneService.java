package com.springweb.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.study.dao.TableOneMapper;
import com.springweb.study.entity.TableOne;

@Service
@Transactional
public class TableOneService {
	@Autowired
	private TableOneMapper oneDao;
	@Transactional(readOnly=true)
	public void insert(TableOne one){
		oneDao.insertSelective(one);
	}
}
