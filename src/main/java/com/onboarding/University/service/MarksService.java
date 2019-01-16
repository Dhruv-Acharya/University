package com.onboarding.University.service;

import com.onboarding.University.entity.Marks;
import com.onboarding.University.entity.MarksIdentity;

import java.util.List;

public interface MarksService {

    List<Marks> findAll();
    Marks save(Marks marks);
    Marks findOne(MarksIdentity id);
    Marks update(Marks marks);
    void delete(MarksIdentity id);
    Double getPercentageBySemester(String studentId, int semester);
    Double getPercentageTotal(String studentId);
}
