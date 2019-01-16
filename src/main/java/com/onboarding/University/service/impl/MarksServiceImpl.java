package com.onboarding.University.service.impl;

import com.onboarding.University.entity.Marks;
import com.onboarding.University.entity.MarksIdentity;
import com.onboarding.University.repository.MarksRepository;
import com.onboarding.University.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)

public class MarksServiceImpl implements MarksService {
    @Autowired
    MarksRepository marksRepository;

    @Override
    public List<Marks> findAll() {
        List<Marks> marksList = new ArrayList<>();

        Iterable<Marks> marksIterable = marksRepository.findAll();
        Iterator marksIterator = marksIterable.iterator();
        while (marksIterator.hasNext()) {
            marksList.add((Marks) marksIterator.next());
        }
        return marksList;
    }

    @Override
    @Transactional(readOnly = false)
    public Marks save(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public Marks findOne(MarksIdentity id) {
        return marksRepository.findOne(id);
    }

    @Override
    public void delete(MarksIdentity id) {
        marksRepository.delete(id);
    }

    @Override
    @Transactional(readOnly = false)
    public Marks update(Marks marks) {
        return marksRepository.save(marks);
    }


}
