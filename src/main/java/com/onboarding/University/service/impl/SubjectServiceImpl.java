package com.onboarding.University.service.impl;

import com.onboarding.University.entity.Subject;
import com.onboarding.University.repository.DepartmentRepository;
import com.onboarding.University.repository.ProfessorRepository;
import com.onboarding.University.repository.SubjectRepository;
import com.onboarding.University.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    ProfessorRepository professorRepository;

    @Override
    @Transactional(readOnly = false)
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject findOne(String subjectId) {
        return subjectRepository.findOne(subjectId);
    }

    @Override
    public List<Subject> findAll() {
        List<Subject> subjectList = new ArrayList<>();
        Iterable<Subject> subjectIterable = subjectRepository.findAll();
        Iterator subjectIterator = subjectIterable.iterator();
        while (subjectIterator.hasNext()) {
            subjectList.add((Subject) subjectIterator.next());
        }
        return subjectList;

    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String subjectId) {
        subjectRepository.delete(subjectId);
    }
}
