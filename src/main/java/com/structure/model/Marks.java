package com.structure.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long marksId;
	
	@OneToOne
	private Student student;
	
	private Long mark1;
	private Long mark2;
	private Long mark3;
	private Long total;
	
	public Marks() {
		super();
	}

	public Marks(Long marksId, Student student, Long mark1, Long mark2, Long mark3, Long total) {
		super();
		this.marksId = marksId;
		this.student = student;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Marks [marksId=" + marksId + ", student=" + student + ", mark1=" + mark1 + ", mark2=" + mark2
				+ ", mark3=" + mark3 + ", total=" + total + "]";
	}

	public Long getMarksId() {
		return marksId;
	}

	public void setMarksId(Long marksId) {
		this.marksId = marksId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Long getMark1() {
		return mark1;
	}

	public void setMark1(Long mark1) {
		this.mark1 = mark1;
	}

	public Long getMark2() {
		return mark2;
	}

	public void setMark2(Long mark2) {
		this.mark2 = mark2;
	}

	public Long getMark3() {
		return mark3;
	}

	public void setMark3(Long mark3) {
		this.mark3 = mark3;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	
}
