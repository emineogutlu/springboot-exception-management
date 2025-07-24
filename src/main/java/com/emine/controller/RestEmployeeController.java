package com.emine.controller;

import com.emine.dto.DtoEmployee;
import com.emine.model.RootEntity;

public interface RestEmployeeController {
    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
