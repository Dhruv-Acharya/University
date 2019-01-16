package com.onboarding.University.service.impl;

import com.onboarding.University.entity.Department;
import com.onboarding.University.repository.DepartmentRepository;
import com.onboarding.University.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)

public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        List<Department> departmentList = new ArrayList<>();

        Iterable<Department> departmentIterable = departmentRepository.findAll();
        Iterator departmentIterator = departmentIterable.iterator();
        while (departmentIterator.hasNext()) {
            departmentList.add((Department) departmentIterator.next());
        }
        return departmentList;
    }

    @Override
    @Transactional(readOnly = false)
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findOne(String id) {
        return departmentRepository.findOne(id);
    }

    @Override
    public void delete(String id) {
        departmentRepository.delete(id);
    }

    @Override
    @Transactional(readOnly = false)
    public Department update(Department department) {
        return departmentRepository.save(department);
    }


}
