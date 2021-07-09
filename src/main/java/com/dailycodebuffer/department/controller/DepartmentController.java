package com.dailycodebuffer.department.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    private DepartmentService departmentService;
    @Autowired
    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepartment( @RequestBody Department department){
        log.info("inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long DepartmentId ){
        log.info("inside findDepartmentById method of DepartmentController");
        return  departmentService.findDepartmentById(DepartmentId);

    }

}

