package com.structure.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.structure.dao.StudentDao;
import com.structure.model.Student;
import com.structure.service.StudentService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public String addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	
}
