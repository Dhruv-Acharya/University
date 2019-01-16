package com.onboarding.University.controller;

import com.onboarding.University.dto.DepartmentDTO;
import com.onboarding.University.dto.ProfessorDTO;
import com.onboarding.University.entity.Department;
import com.onboarding.University.entity.Professor;
import com.onboarding.University.service.DepartmentService;
import com.onboarding.University.service.ProfessorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/professor")
    public class ProfessorController {

        @Autowired
        ProfessorService professorService;

        @Autowired
        DepartmentService departmentService;

        @RequestMapping(value = "", method = RequestMethod.GET)
        public ResponseEntity<List<Professor>> getProfessors() {
            return new ResponseEntity<List<Professor>>(professorService.findAll(),HttpStatus.OK);
        }

        @RequestMapping(value = "/{professor_id}", method = RequestMethod.GET)
        public ResponseEntity<Professor> getProfessor(@PathVariable String professor_id){
            return new ResponseEntity<Professor>(professorService.findOne(professor_id),HttpStatus.OK);
        }

        @RequestMapping(value = "/delete/{professor_id}", method = RequestMethod.DELETE)
        public ResponseEntity<Boolean> removeProfessor(@PathVariable String professor_id) {
            professorService.delete(professor_id);
            return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
        }

       /* @RequestMapping(value = "/add", method = RequestMethod.POST)
        public ResponseEntity<String> addProfessor(@RequestBody ProfessorDTO professorDTO) {

            Professor professor = new Professor();
            BeanUtils.copyProperties(professorDTO, professor);
            Professor professorCreated = professorService.save(professor);
            return new ResponseEntity<String>(professorCreated.getProfessorId(),HttpStatus.CREATED);
        }*/
        @RequestMapping(value = "/add", method = RequestMethod.POST)
        public ResponseEntity<String> addProfessor(@RequestBody ProfessorDTO professorDTO) {
            Department primaryDepartment = new Department();
            primaryDepartment = departmentService.findOne(professorDTO.getPrimaryDepartment());
            Professor professor = new Professor();
            BeanUtils.copyProperties(professorDTO, professor);
            professor.setPrimaryDepartment(primaryDepartment);

            if(professorDTO.getSecondaryDepartment() != null) {
                Department secondaryDepartment = new Department();
                secondaryDepartment = departmentService.findOne(professorDTO.getPrimaryDepartment());
                BeanUtils.copyProperties(professorDTO, professor);
                professor.setSecondaryDepartment(secondaryDepartment);
            }

            Professor professorCreated = professorService.save(professor);
            return new ResponseEntity<String>(professorCreated.getProfessorId(),HttpStatus.CREATED);
        }

        @RequestMapping(value = "/update", method = RequestMethod.PUT)
        public ResponseEntity<String> updateProfessor(@RequestBody ProfessorDTO professorDTO) {

            Professor professor = new Professor();
            BeanUtils.copyProperties(professorDTO, professor);
            Professor professorCreated = professorService.save(professor);
            return new ResponseEntity<String>(professorCreated.getProfessorId(),HttpStatus.CREATED);
        }

        @RequestMapping(value = "/professorRanking", method = RequestMethod.GET)
        public ResponseEntity<Object> getProfessorRanking(){
            return new ResponseEntity<Object>(professorService.getProfessorRanking(),HttpStatus.OK);
        }
    }

