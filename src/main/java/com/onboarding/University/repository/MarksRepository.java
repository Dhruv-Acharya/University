package com.onboarding.University.repository;

import com.onboarding.University.entity.Marks;
import org.springframework.data.repository.CrudRepository;

public interface MarksRepository extends CrudRepository<Marks, String> {
}
