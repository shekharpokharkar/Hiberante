package com.seleniumExpress.One2One.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student_One2One")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	@Column(name = "student_Name")
	private String studentname;
	@Column(name = "student_City")
	private String studentCity;
	@Column(name = "student_Marrital_status")
	private Boolean married;
	@Column(name = "student_Salary")
	private Long studentSalary;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_ID",nullable = false)
	private Address address;

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentCity=" + studentCity
				+ ", married=" + married + ", studentSalary=" + studentSalary +"]";
	}
	
	
}
