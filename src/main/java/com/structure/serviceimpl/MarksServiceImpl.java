package com.structure.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.structure.dao.MarksDao;
import com.structure.model.Marks;
import com.structure.service.MarksService;
import com.structure.utils.MarksUtils;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MarksServiceImpl implements MarksService{
	
	@Autowired
	private MarksDao marksDao;
	
	@Autowired
	private MarksUtils marksUtils;

	@Override
	public String addMarks(Marks marks) {
		marks.setTotal(marksUtils.totalMark(marks.getMark1(),marks.getMark2(), marks.getMark3()));
		return marksDao.addMarks(marks);
	}

	
}
