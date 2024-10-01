package com.structure.service;

import java.util.List;

import com.structure.dto.StudentMarksDto;
import com.structure.model.Student;

public interface StudentService {

	public String addStudent(Student student);
	
	public List<StudentMarksDto> getAllStudentsMarks();
}
