package com.emine.controller;

import com.emine.dto.DtoEmployee;

public interface RestEmployeeController {
    public DtoEmployee findEmployeeById(Long id);
}
