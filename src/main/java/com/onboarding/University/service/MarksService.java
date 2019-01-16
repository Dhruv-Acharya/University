package com.onboarding.University.service;

import com.onboarding.University.entity.Marks;

import java.util.List;

public interface MarksService {

    List<Marks> findAll();
    Marks save(Marks marks);
    Marks findOne(String id);
    Marks update(Marks marks);
    void delete(String id);
}
