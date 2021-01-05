package com.lijiat.springboot.mybatis.dao;

import com.lijiat.springboot.mybatis.entity.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @program: demo6-mybatis
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-05 10:53
 */
@Mapper
@Repository
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
