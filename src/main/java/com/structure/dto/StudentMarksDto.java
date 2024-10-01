package com.structure.dto;

public class StudentMarksDto {

	private long studentId;
	private String studentName;
	private String rollno;
	private Long total;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

}
