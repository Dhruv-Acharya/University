package com.onboarding.University.services;

import com.onboarding.University.entity.Department;

public interface DepartmentServices {

     Department add(Department department);

    Department select(String id);

    Department update(Department department);

    void delete(String id);
}
