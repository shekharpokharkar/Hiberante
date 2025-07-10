package com.seleniumExpress.CollectionTable_CompositeCollectionType;

import java.util.List;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student_CollectionType")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;

	private String studentName;
	private String studentCity;

	@CollectionTable(name = "NICKNAME_CollectionTable", joinColumns = @JoinColumn(name = "STU_ID")) // FK column pointing to Student)
	@ElementCollection
	@OrderColumn
	@Column(name="Nick")
	private List<String> nickNames;
	
	
	@CollectionTable(name = "SUBJECT_MARKS_CollectionTable", joinColumns = @JoinColumn(name = "STU_ID")) // FK column pointing to Student)
	@ElementCollection
	@MapKeyColumn(name = "SUBJECT_NAME")
	@Column(name="SUBJECT_MARK")
	private Map<String ,Integer>subjectMarks;

}
