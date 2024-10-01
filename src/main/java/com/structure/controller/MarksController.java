package com.structure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.structure.constants.ApiConstants;
import com.structure.model.Marks;
import com.structure.service.MarksService;

@RestController
@CrossOrigin(origins = ApiConstants.CROSS_ORIGIN_URL)
@RequestMapping(path = ApiConstants.MARKS_REQUESTMAPPING_API)
public class MarksController {

	@Autowired
	MarksService marksService;

	
	
	@PostMapping(path = ApiConstants.MARKS_ADD_API)
	public ResponseEntity<String> addMarks(@RequestBody Marks marks){
		return ResponseEntity.ok(marksService.addMarks(marks));
	}
}