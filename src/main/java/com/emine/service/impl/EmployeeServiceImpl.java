package com.emine.service.impl;

import com.emine.dto.DtoDepartment;
import com.emine.dto.DtoEmployee;
import com.emine.model.Department;
import com.emine.model.Employee;
import com.emine.repository.EmployeeRepository;
import com.emine.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {

        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();
     Optional<Employee>optional= employeeRepository.findById(id);

     if(optional.isEmpty()){
         return null;
     }
     Employee employee=optional.get();
        Department department=employee.getDepartment();
BeanUtils.copyProperties(employee,dtoEmployee);
BeanUtils.copyProperties(department,dtoDepartment);

dtoEmployee.setDepartment(dtoDepartment);
        return dtoEmployee;
    }
}
