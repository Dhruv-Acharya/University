package com.onboarding.University.controller;
import com.onboarding.University.dto.MarksDTO;
import com.onboarding.University.entity.Marks;
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

    @RequestMapping(value = "/{marks_id}", method = RequestMethod.GET)
    public ResponseEntity<Marks> getMarks(@PathVariable String marks_id){
        return new ResponseEntity<Marks>(marksService.findOne(marks_id),HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{marks_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> removeMarks(@PathVariable String marks_id) {
        marksService.delete(marks_id);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> addMarks(@RequestBody MarksDTO marksDTO) {

        Marks marks = new Marks();
        BeanUtils.copyProperties(marksDTO, marks);
        Marks marksCreated = marksService.save(marks);
        return new ResponseEntity<String>(marksCreated.getMarksId(),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<String> updateMarks(@RequestBody MarksDTO marksDTO) {

        Marks marks = new Marks();
        BeanUtils.copyProperties(marksDTO, marks);
        Marks marksCreated = marksService.save(marks);
        return new ResponseEntity<String>(marksCreated.getMarksId(),HttpStatus.CREATED);
    }
}
