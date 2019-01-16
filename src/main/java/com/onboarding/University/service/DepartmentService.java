package com.onboarding.University.service;

import com.onboarding.University.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> findAll();
    Department save(Department department);
    Department findOne(String id);
    Department update(Department department);
    void delete(String id);
}
