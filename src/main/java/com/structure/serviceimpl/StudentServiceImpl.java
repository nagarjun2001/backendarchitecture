package com.structure.serviceimpl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.structure.dao.StudentDao;
import com.structure.dto.StudentMarksDto;
import com.structure.model.Marks;
import com.structure.model.Student;
import com.structure.service.StudentService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
	
	
	private final StudentDao studentDao;

	@Override
	public String addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public List<StudentMarksDto> getAllStudentsMarks() {
     List<StudentMarksDto> studentMarksDtos =  studentDao.findAll()
	                .stream()
	                .map(mark -> convertEntityToDto(mark))
	                .collect(Collectors.toList());
		 
		 return studentMarksDtos;
	}
	
    public StudentMarksDto convertEntityToDto(Marks marks){
    	StudentMarksDto studentMarksDto = new StudentMarksDto();
    	studentMarksDto.setTotal(marks.getTotal());
    	if (!Objects.isNull(marks.getStudent())) {
    		studentMarksDto.setRollno(marks.getStudent().getRollno());
        	studentMarksDto.setStudentId(marks.getStudent().getStudentId());
        	studentMarksDto.setStudentName(marks.getStudent().getStudentName());
		}
    	
        return studentMarksDto;
    }



	
}
