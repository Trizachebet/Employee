package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    //save or update
    public Employee saveOrUpdateEmployee(Employee employee){
        System.out.println("::::::::::::::I am now in service and  this is the employee details  "+employee);
       return employeeRepository.save(employee);

    }
    //find by id
    public Employee findEmployeeById(Long id){

        return employeeRepository.findById(id).get();

    }
    //list all employees
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }
    //delete employee by id
    public  void deleteEmployeeById(Long id){

        employeeRepository.deleteById(id);

    }

}
