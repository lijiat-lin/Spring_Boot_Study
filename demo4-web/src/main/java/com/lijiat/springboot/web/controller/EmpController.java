package com.lijiat.springboot.web.controller;

import com.lijiat.springboot.web.dao.EmployeeDao;
import com.lijiat.springboot.web.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @program: demo4-web
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-29 16:00
 */
@Controller
public class EmpController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
}
