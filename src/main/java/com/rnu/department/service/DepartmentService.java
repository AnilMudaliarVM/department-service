package com.rnu.department.service;

import com.rnu.department.entity.Department;
import com.rnu.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {
@Autowired
private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
      log.info("Inside saveDepartment method of department service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
       log.info("Inside getDepartmentById method of department service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
