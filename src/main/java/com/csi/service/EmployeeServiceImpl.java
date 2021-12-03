package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public boolean signIn(String empEmailId , String empPassword)
    {
        return employeeDao.signIn(empEmailId , empPassword);
    }

    public Employee signUp(Employee employee)
    {
        return employeeDao.signUp(employee);
    }
}
