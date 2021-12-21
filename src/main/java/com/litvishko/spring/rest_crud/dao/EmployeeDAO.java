package com.litvishko.spring.rest_crud.dao;

import com.litvishko.spring.rest_crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> showAllEmps();

    void addEmp(Employee employee);

    Employee showEmp(int id);

    void deleteEmp(int id);

}
