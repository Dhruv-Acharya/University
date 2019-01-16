package com.onboarding.University.repository;

import com.onboarding.University.entity.Marks;
import com.onboarding.University.entity.MarksIdentity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MarksRepository extends CrudRepository<Marks, String> {

    //Get current Percentage of the student by id and semester.
//    @Query (name = "select CONCAT(sum(Marks) /count(Marks), '%') as percentageScored from marks where student_id = :studentId and semester = :semester group by student_id, semester")
//    Double getStudentScoreBySem(@Param("studentId") String studentId, @Param("semester") int semester);
//
//    @Query (name = "percentageByStudentId", value = "select CONCAT(sum(Marks) / count(Marks), '%') as percentageScored from marks where student_id = :studentId group by student_id")
//    Double getStudentScoreAllSem(@Param("studentId") String studentId);
}
