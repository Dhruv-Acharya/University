package com.onboarding.University.repository;

import com.onboarding.University.entity.Professor;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor,String> {

}
