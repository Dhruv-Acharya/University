package com.onboarding.University.service.impl;

import com.onboarding.University.entity.Professor;
import com.onboarding.University.repository.ProfessorRepository;
import com.onboarding.University.repository.SubjectRepository;
import com.onboarding.University.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)

public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    @Transactional(readOnly = false)
    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    @Override
    public Professor findOne(String professorId) {
        return professorRepository.findOne(professorId);
    }

    /*@Override
    public List<Employee> findByFistName(String firstName) {
        return professorRepository.findByFirstName(firstName);
    }

    @Override
    public boolean exists(String professorId) {
        return false;
    }*/

    @Override
    public List<Professor> findAll() {
        List<Professor> professorList = new ArrayList<>();
        Iterable<Professor> professorIterable = professorRepository.findAll();
        Iterator professorIterator = professorIterable.iterator();
        while (professorIterator.hasNext()) {
            professorList.add((Professor) professorIterator.next());
        }
        return professorList;
    }

   /* @Override
    public long count() {
        return 0;
    }*/

    @Override
    @Transactional(readOnly = false)
    public void delete(String professorId) {
        professorRepository.delete(professorId);
    }


}





