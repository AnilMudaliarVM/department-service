package com.rnu.department.controller;

import com.rnu.department.entity.Department;
import com.rnu.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add")
    public Department saveDepartment(@RequestBody Department department){
      log.info("Inside saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable Long departmentId){
        log.info("Inside getDepartmentById method of department Controller");
        return departmentService.findDepartmentById(departmentId);
    }
}
