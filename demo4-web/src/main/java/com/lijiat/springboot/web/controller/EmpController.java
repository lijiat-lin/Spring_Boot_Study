package com.lijiat.springboot.web.controller;

import com.lijiat.springboot.web.dao.DepartmentDao;
import com.lijiat.springboot.web.dao.EmployeeDao;
import com.lijiat.springboot.web.entities.Department;
import com.lijiat.springboot.web.entities.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @program: demo4-web
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-29 16:00
 */
@Controller
public class EmpController {

    private static final Logger LOG = LoggerFactory.getLogger(EmpController.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model){
        //来到添加页面需要查询出所有的部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }


    /**
     * SpringMVC自动将请求参数和入参对象
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String addEmp(Employee employee){

        System.out.println(employee);
        employeeDao.save(employee);
        //redirect : 表示重定向到一个地址
        //forward ： 表示转发到一个地址
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        LOG.info("toEditPage id:{}",id);
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        //来到添加页面需要查询出所有的部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);

        //添加编辑页面二合一
        return "emp/add";

    }

    @PutMapping("/emp")
    public String updateEmp(Employee employee){

        System.out.println(employee);
        //redirect : 表示重定向到一个地址
        //forward ： 表示转发到一个地址
        return "redirect:/emps";
    }

    @PostMapping("/delete/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        LOG.info("deleteEmp id:{}",id);
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
