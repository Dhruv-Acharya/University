package com.onboarding.University.repository;

import com.onboarding.University.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student,String> {



}
