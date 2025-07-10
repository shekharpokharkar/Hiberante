package com.seleniumExpress.CompositePrimaryKey;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student_Composite_primaryKey")
//@IdClass(StudentId.class)
public class Student {

	//@Id
	private String studentName;
	//@Id
	private String studnetCity;
	private String studentLang;
	private Integer studnetId;
	private String marks;

}
