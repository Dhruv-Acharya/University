package com.onboarding.University.controller;
import com.onboarding.University.dto.StudentDTO;
import com.onboarding.University.entity.Department;
import com.onboarding.University.entity.Student;
import com.onboarding.University.service.DepartmentService;
import com.onboarding.University.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<List<Student>>(studentService.findAll(),HttpStatus.OK);
    }

    @RequestMapping(value = "/{student_id}", method = RequestMethod.GET)
    public ResponseEntity<Student> getStudent(@PathVariable String student_id){
        return new ResponseEntity<Student>(studentService.findOne(student_id),HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{student_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> removeStudent(@PathVariable String student_id) {
        studentService.delete(student_id);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> addStudent(@RequestBody StudentDTO studentDTO) {

        Department department = departmentService.findOne(studentDTO.getDepartmentId());

        Student student = new Student();
        student.setDepartment(department);
        BeanUtils.copyProperties(studentDTO, student);
        Student studentCreated = studentService.save(student);
        return new ResponseEntity<String>(studentCreated.getStudentId(),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<String> updateStudent(@RequestBody StudentDTO studentDTO) {

        Student student = new Student();
        BeanUtils.copyProperties(studentDTO, student);
        Student studentCreated = studentService.save(student);
        return new ResponseEntity<String>(studentCreated.getStudentId(),HttpStatus.CREATED);
    }
}
