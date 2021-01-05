package com.lijiat.springboot.mybatis.controller;

import com.lijiat.springboot.mybatis.dao.DepartmentMapper;
import com.lijiat.springboot.mybatis.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demo6-mybatis
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-05 10:49
 */
@RestController
@RequestMapping("/dept")
public class DeptController {


//    @Autowired
//    private DepartmentDao departmentDao;

    @Autowired
    private DepartmentMapper departmentMapper;

    @PostMapping("/insert")
    public Department insert(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/find")
    public Department find(@RequestParam("id") Integer id){
        Department department = departmentMapper.getDeptById(id);
        return department;
    }
}
