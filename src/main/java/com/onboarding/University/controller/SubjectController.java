package com.onboarding.University.controller;

import com.onboarding.University.dto.SubjectDTO;
import com.onboarding.University.entity.Subject;
import com.onboarding.University.service.SubjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController{

    @Autowired
    SubjectService subjectService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Subject>> getSubject() {
        return new ResponseEntity<List<Subject>>(subjectService.findAll(),HttpStatus.OK);
    }

    @RequestMapping(value = "/{subject_id}", method = RequestMethod.GET)
    public ResponseEntity<Subject> getSubject(@PathVariable String subject_id){
        return new ResponseEntity<Subject>(subjectService.findOne(subject_id),HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{subject_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> removeSubject(@PathVariable String subject_id) {
        subjectService.delete(subject_id);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> addSubject(@RequestBody SubjectDTO subjectDTO) {

        Subject subject = new Subject();
        BeanUtils.copyProperties(subjectDTO, subject);
        Subject subjectCreated = subjectService.save(subject);
        return new ResponseEntity<String>(subjectCreated.getSubjectId(),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<String> updateSubject(@RequestBody SubjectDTO subjectDTO) {

        Subject subject = new Subject();
        BeanUtils.copyProperties(subjectDTO, subject);
        Subject subjectCreated = subjectService.save(subject);
        return new ResponseEntity<String>(subjectCreated.getSubjectId(),HttpStatus.CREATED);
    }
}