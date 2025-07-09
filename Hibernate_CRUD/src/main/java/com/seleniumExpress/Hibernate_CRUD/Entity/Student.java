package com.seleniumExpress.Hibernate_CRUD.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="students")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	@Column(name="student_Name")
	private String studentname;
	@Column(name="student_City")
	private String studentCity;
	@Column(name="student_Marrital_status")
	private Boolean married;
	@Column(name="student_Salary")
	private Long studentSalary;

}
