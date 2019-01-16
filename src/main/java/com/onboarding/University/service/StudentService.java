package com.onboarding.University.service;

import com.onboarding.University.entity.Student;

import java.util.List;

public interface StudentService {

        List<Student> findAll();

        Student save(Student student);

        Student findOne(String id);

        Student update(Student student);

        void delete(String id);
}
