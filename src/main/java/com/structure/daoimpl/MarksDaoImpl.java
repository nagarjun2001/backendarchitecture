package com.structure.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.structure.constants.MessageConstants;
import com.structure.dao.MarksDao;
import com.structure.model.Marks;

import jakarta.persistence.EntityManager;

@Repository
public class MarksDaoImpl implements MarksDao{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public String addMarks(Marks marks) {
		try {
			if(marks == null) {
				return MessageConstants.ADD_MARKS_FAILURE;
			}
			else {
				entityManager.persist(marks);
				return MessageConstants.ADD_MARKS_SUCCESS;
			}
		}
		catch (Exception e) {
			MessageConstants.LOGGER.info("Error: "+e);
		}
		return MessageConstants.ADD_MARKS_FAILURE;
	}
	
}
