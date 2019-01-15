package com.onboarding.University.services.impl;

import com.onboarding.University.entity.Department;
import com.onboarding.University.repository.DepartmentRepository;
import com.onboarding.University.services.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)

public class DepartmentServicesImpl implements DepartmentServices {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    @Transactional(readOnly = false)
    public Department add(Department department) {


        return departmentRepository.save(department);
    }

    @Override
    public Department select(String id) {
        return departmentRepository.findOne(id);
    }

    @Override
    public void delete(String id) {
        departmentRepository.delete(id);

    }

    @Override
    public Department update(Department department) {

        return departmentRepository.save(department);
    }


}
