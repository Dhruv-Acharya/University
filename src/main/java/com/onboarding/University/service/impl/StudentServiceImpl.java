package com.onboarding.University.service.impl;

import com.onboarding.University.entity.Student;
import com.onboarding.University.repository.StudentRepository;
import com.onboarding.University.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();

        Iterable<Student> studentIterable = studentRepository.findAll();
        Iterator studentIterator = studentIterable.iterator();
        while (studentIterator.hasNext()) {
            studentList.add((Student) studentIterator.next());
        }
        return studentList;
    }

    @Override
    @Transactional(readOnly = false)
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findOne(String id) {
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
