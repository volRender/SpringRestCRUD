package com.litvishko.spring.rest_crud.controller;

import com.litvishko.spring.rest_crud.entity.Employee;
import com.litvishko.spring.rest_crud.exceptions.EmployeeGetExceptionInfo;
import com.litvishko.spring.rest_crud.exceptions.NotHaveAnEmployeeException;
import com.litvishko.spring.rest_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {

        List<Employee> emps = employeeService.showAllEmps();
        return emps;

    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        Employee employee = employeeService.showEmp(id);

        if(employee == null) {
            throw new NotHaveAnEmployeeException("Employee with id = " + id + " does not exist");
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {

        employeeService.addEmp(employee);

        return employee;

    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {

        employeeService.addEmp(employee);

        return employee;

    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        Employee employee = employeeService.showEmp(id);
        if(employee == null) {
            throw new NotHaveAnEmployeeException("There is no employee with ID = " + id);
        }

        employeeService.deleteEmp(id);

        return "Employee with id = " + id + " was deleted.";

    }
}
