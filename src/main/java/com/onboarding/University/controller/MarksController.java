package com.onboarding.University.controller;
import com.onboarding.University.dto.MarksDTO;
import com.onboarding.University.entity.Marks;
import com.onboarding.University.entity.MarksIdentity;
import com.onboarding.University.service.MarksService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarksController {

    @Autowired
    MarksService marksService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Marks>> getMarkss() {
        return new ResponseEntity<List<Marks>>(marksService.findAll(),HttpStatus.OK);
    }

    @RequestMapping(value = "/{marks_is}", method = RequestMethod.GET)
    public ResponseEntity<String> getMarks(@PathVariable String marks_id){
        Marks marks = new Marks();
//        MarksIdentity marksIdentity= new MarksIdentity();
//        marksIdentity.setStudentId(student_id);
//        marksIdentity.setSubjectId(subject_id);
        marks = marksService.findOne(marks_id);
        return new ResponseEntity<String>(marks.getMarksId(),HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{marks_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> removeMarks(@PathVariable String marks_id) {
//        MarksIdentity marksIdentity= new MarksIdentity();
//        marksIdentity.setStudentId(student_id);
//        marksIdentity.setSubjectId(subject_id);
        marksService.delete(marks_id);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Marks> addMarks(@RequestBody MarksDTO marksDTO) {
//        MarksIdentity marksIdentity = new MarksIdentity(marksDTO.getStudentId(),marksDTO.getSubjectId());
        Marks marks = new Marks();
        BeanUtils.copyProperties(marksDTO, marks);
//        marks.setMarksIdentity(marksIdentity);
        Marks marksCreated = marksService.save(marks);
        return new ResponseEntity<Marks>(marksCreated,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Marks> updateMarks(@RequestBody MarksDTO marksDTO) {
//        MarksIdentity marksIdentity = new MarksIdentity(marksDTO.getStudentId(),marksDTO.getSubjectId());
        Marks marks = new Marks();
        BeanUtils.copyProperties(marksDTO, marks);
//        marks.setMarksIdentity(marksIdentity);
        Marks marksCreated = marksService.save(marks);
        return new ResponseEntity<Marks>(marksCreated,HttpStatus.CREATED);
    }


    @RequestMapping(value = "/getPercentageBySemester", method = RequestMethod.GET)
    public ResponseEntity<Double> getPercentageBySemester(@PathVariable String studentId,@PathVariable int semester){
        return new ResponseEntity<Double>(marksService.getPercentageBySemester(studentId, semester),HttpStatus.OK);
    }

    @RequestMapping(value = "/getPercentageTotal", method = RequestMethod.GET)
    public ResponseEntity<Double> getPercentageTotal(@PathVariable String studentId){
        return new ResponseEntity<Double>(marksService.getPercentageTotal(studentId),HttpStatus.OK);
    }
}
