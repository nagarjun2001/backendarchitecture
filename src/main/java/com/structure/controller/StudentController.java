package com.structure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.structure.constants.ApiConstants;
import com.structure.model.Student;
import com.structure.service.StudentService;

@RestController
@CrossOrigin(origins = ApiConstants.CROSS_ORIGIN_URL)
@RequestMapping(path = ApiConstants.STUDENT_REQUESTMAPPING_API)
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping(path = ApiConstants.STUDENT_ADD_API)
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		return ResponseEntity.ok(studentService.addStudent(student));
	}
	
}
