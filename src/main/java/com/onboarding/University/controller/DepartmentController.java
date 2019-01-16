package com.onboarding.University.controller;
import com.onboarding.University.dto.DepartmentDTO;
import com.onboarding.University.entity.Department;
import com.onboarding.University.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Department>> getDepartments() {
        return new ResponseEntity<List<Department>>(departmentService.findAll(),HttpStatus.OK);
    }

    @RequestMapping(value = "/{department_id}", method = RequestMethod.GET)
    public ResponseEntity<Department> getDepartment(@PathVariable String department_id){
        return new ResponseEntity<Department>(departmentService.findOne(department_id),HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{department_id}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> removeDepartment(@PathVariable String department_id) {
        departmentService.delete(department_id);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<String> addDepartment(@RequestBody DepartmentDTO departmentDTO) {

        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO, department);
        Department departmentCreated = departmentService.save(department);
        return new ResponseEntity<String>(departmentCreated.getDepartmentId(),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<String> updateDepartment(@RequestBody DepartmentDTO departmentDTO) {

        Department department = new Department();
        BeanUtils.copyProperties(departmentDTO, department);
        Department departmentCreated = departmentService.save(department);
        return new ResponseEntity<String>(departmentCreated.getDepartmentId(),HttpStatus.CREATED);
    }
}
