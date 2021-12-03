package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public boolean signIn(@PathVariable String empEmailId , @PathVariable String empPassword)
    {
        return employeeService.signIn(empEmailId , empPassword);
    }

    @PostMapping("/signup")
    public Employee signIn(@RequestBody Employee employee)
    {
        return employeeService.signUp(employee);
    }
}
