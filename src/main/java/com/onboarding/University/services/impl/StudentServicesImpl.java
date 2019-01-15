package com.onboarding.University.services.impl;

import com.onboarding.University.entity.Student;
import com.onboarding.University.repository.DepartmentRepository;
import com.onboarding.University.repository.StudentRepository;
import com.onboarding.University.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)

public class StudentServicesImpl implements StudentServices {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    @Transactional(readOnly = false)
    public Student add(Student student) {


        return studentRepository.save(student);
    }

    @Override
    public Student select(String id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void delete(String id) {
        studentRepository.delete(id);

    }

    @Override
    public Student update(Student student) {

        return studentRepository.save(student);
    }



}
