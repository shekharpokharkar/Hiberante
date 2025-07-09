package com.seleniumExpress.EmbeddedVsEmbeddable.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
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

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "addressLine1", column = @Column(name = "Home_AddressLine1")),
			@AttributeOverride(name = "addressLine2", column = @Column(name = "Home_addressLine2")),
			@AttributeOverride(name = "city", column = @Column(name = "Home_city")),
			@AttributeOverride(name = "country", column = @Column(name = "Home_country")) }

	)
	private Address1 homeAddress;
	@Embedded
	@AttributeOverrides({

			@AttributeOverride(name = "addressLine1", column = @Column(name = "Hostel_AddressLine1")),
			@AttributeOverride(name = "addressLine2", column = @Column(name = "Hostel_addressLine2")),
			@AttributeOverride(name = "city", column = @Column(name = "Hostel_city")),
			@AttributeOverride(name = "country", column = @Column(name = "Hostel_country"))

	})
	private Address1 hostelAddress;
}
