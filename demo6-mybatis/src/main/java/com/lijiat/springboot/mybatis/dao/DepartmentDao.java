package com.lijiat.springboot.mybatis.dao;

import com.lijiat.springboot.mybatis.entity.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}