package com.onboarding.University.service;

import com.onboarding.University.entity.Subject;

import java.util.List;

public interface SubjectService {
    public Subject save(Subject subject);

    public Subject findOne(String subjectId);

    //public List<Subject> findByFistName(String firstName);

    public List<Subject> findAll();

    public void delete(String subjectId);

}
