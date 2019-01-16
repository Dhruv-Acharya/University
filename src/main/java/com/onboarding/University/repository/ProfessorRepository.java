package com.onboarding.University.repository;

import com.onboarding.University.entity.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor,String> {

    @Query(name = "professorRanking", value = "select avg(a.marks) as marks from subject a inner join marks b on a.subject_id = b.subject_id group by a.professor_id order by marks desc",nativeQuery = true)
    Object getProfessorRanking();
}
