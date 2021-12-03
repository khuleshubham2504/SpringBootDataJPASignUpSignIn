package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    public boolean signIn(String empEmailId , String empPassword)
    {
        boolean flag = false;

        List<Employee> empList = employeeRepo.findAll();

        for (Employee e : empList)
        {
            if (e.getEmpEmailId().equals(empEmailId)  && e.getEmpPassword().equals(empPassword))
            {
                flag = true;
            }
        }
        return flag;
    }

    public Employee signUp(Employee employee)
    {
        return employeeRepo.save(employee);
    }
}
