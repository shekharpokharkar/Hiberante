package com.seleniumExpress.CompositePrimaryKey_Approch2;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student_Composite_primaryKey_2")
public class Student {

	@EmbeddedId
	private StudentId studentId;
	private String studentLang;
	private Integer studnetId;
	private String marks;

	public Student(StudentId studentId, String studentLang, Integer studnetId, String marks) {

		this.studentId = studentId;
		this.studentLang = studentLang;
		this.studnetId = studnetId;
		this.marks = marks;
	}

	public Student() {

	}

}
