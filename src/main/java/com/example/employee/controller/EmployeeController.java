package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        System.out.println(":::::::::::::::::I am now in controller and  this is the employee details"+employee);
      return  employeeService.saveOrUpdateEmployee(employee);
    }
    @GetMapping("/findByID/{id}")
    public Employee findById(@PathVariable Long id){

        return  employeeService.findEmployeeById(id);

    }
    @GetMapping("/list")
    public Collection<Employee> findAll(){

        return employeeService.getAllEmployees();

    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);

    }
}
