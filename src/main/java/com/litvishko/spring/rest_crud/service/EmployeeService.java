package com.litvishko.spring.rest_crud.service;

import com.litvishko.spring.rest_crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> showAllEmps();
    void addEmp(Employee employee);
    Employee showEmp(int id);
    void deleteEmp(int id);

}
