package com.onboarding.University.services;

import com.onboarding.University.entity.Student;

public interface StudentServices {

        Student add(Student student);

        Student select(String id);

        Student update(Student student);

        void delete(String id);
}
