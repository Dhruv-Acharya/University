package com.onboarding.University.repository;

import com.onboarding.University.entity.Department;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,String> {

    @Query(name = "updateSemesterStudent", value = "update student set semester = (select semester from student where student_id = :studentId) + 1")
    void updateSemesterStudent(String studentId);

}
