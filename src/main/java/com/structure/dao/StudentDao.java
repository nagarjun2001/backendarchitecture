package com.structure.dao;

import java.util.List;

import com.structure.model.Marks;
import com.structure.model.Student;

public interface StudentDao {

	public String addStudent(Student student);
	
	public List<Marks> findAll();
}
