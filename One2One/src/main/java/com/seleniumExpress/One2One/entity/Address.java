package com.seleniumExpress.One2One.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "Address_One2One")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private String country;
	private String pin;

	// @ToString.Exclude
	@JsonIgnore
	@OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
	private Student student;

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", country=" + country + ", pin=" + pin + "]";
	}

}
