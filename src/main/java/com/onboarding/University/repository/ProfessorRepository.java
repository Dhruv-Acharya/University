package com.onboarding.University.repository;

import com.onboarding.University.entity.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfessorRepository extends CrudRepository<Professor,String> {


//    @Query(name = "professorRanking", value = "select AVG(b.marks) from subject a inner join marks b on a.subject_id = b.subject_id group by a.professor_id")
//    List<Double> getProfessorRanking();
}

