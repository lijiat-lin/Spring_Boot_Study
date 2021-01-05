package com.lijiat.springboot.mybatis.dao;

import com.lijiat.springboot.mybatis.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface EmployeeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}