package com.onboarding.University.service;

import com.onboarding.University.entity.Professor;

import java.util.List;

public interface ProfessorService {

        public Professor save(Professor professor);

        public Professor findOne(String professorId);

       // public List<Professor> findByFistName(String firstName);

        //public boolean exists(String professorId);

        public List<Professor> findAll();

        //public long count();

        public void delete(String professorId);

    }

