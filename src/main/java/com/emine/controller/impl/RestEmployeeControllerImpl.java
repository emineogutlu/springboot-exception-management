package com.emine.controller.impl;

import com.emine.controller.RestEmployeeController;
import com.emine.dto.DtoEmployee;
import com.emine.model.RootEntity;
import com.emine.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

   @GetMapping("/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value="id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
