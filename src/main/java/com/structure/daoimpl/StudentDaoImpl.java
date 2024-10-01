package com.structure.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.structure.constants.MessageConstants;
import com.structure.dao.StudentDao;
import com.structure.model.Marks;
import com.structure.model.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public String addStudent(Student student) {
		try {
			if(student == null) {
				return MessageConstants.ADD_STUDENT_FAILURE;
			}
			else {
				entityManager.persist(student);
				return MessageConstants.ADD_STUDENT_SUCCESS;
			}
		}
		catch (Exception e) {
			MessageConstants.LOGGER.info("Error: "+e);
		}
		return MessageConstants.ADD_STUDENT_FAILURE;
	}

	@Override
	public List<Marks> findAll() {
		return entityManager.createQuery("SELECT m FROM Marks m", Marks.class).getResultList(); 
	}

	
}
