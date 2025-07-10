package com.seleniumExpress.CompositePrimaryKey_Approch2;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class StudentId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String studentName;
	private String studnetCity;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentId other = (StudentId) obj;
		return Objects.equals(studentName, other.studentName) && Objects.equals(studnetCity, other.studnetCity);
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentName, studnetCity);
	}

	public StudentId(String sname, String sCity) {
		this.studentName=sname;
		this.studnetCity=sCity;
	}

}
