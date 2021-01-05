package com.lijiat.springboot.mybatis.controller;

import com.lijiat.springboot.mybatis.dao.EmployeeDao;
import com.lijiat.springboot.mybatis.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demo6-mybatis
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-05 11:16
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/find")
    public Employee find(@RequestParam("id") Integer id){
        Employee employee = employeeDao.selectByPrimaryKey(id);
        return employee;
    }

    @PostMapping("/insert")
    public Employee insert(Employee employee){
        employeeDao.insertSelective(employee);
        return employee;
    }


}
