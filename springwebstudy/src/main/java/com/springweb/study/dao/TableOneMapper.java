package com.springweb.study.dao;

import org.springframework.stereotype.Repository;

import com.springweb.study.entity.TableOne;
@Repository
public interface TableOneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TableOne record);

    int insertSelective(TableOne record);

    TableOne selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TableOne record);

    int updateByPrimaryKey(TableOne record);
}