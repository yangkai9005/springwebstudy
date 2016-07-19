package com.springweb.study.dao;

import com.springweb.study.entity.TableTwo;

public interface TableTwoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TableTwo record);

    int insertSelective(TableTwo record);

    TableTwo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TableTwo record);

    int updateByPrimaryKey(TableTwo record);
}