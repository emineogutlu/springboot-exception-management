package com.emine.service;

import com.emine.dto.DtoEmployee;
import com.emine.model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
