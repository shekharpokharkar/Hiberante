package com.seleniumExpress.One2Many_BidirectionalMapping;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "Customer_One2Many")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Customer_Id")
	private Integer customerId;
	@Column(name = "Customer_Name")
	private String customerName;
	@Column(name = "Customer_City")
	private String customrCity;
	@Column(name = "Customer_DOB")
	private LocalDate customerDateOfBirth;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer", orphanRemoval = true)
	private List<Product> product;

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customrCity=" + customrCity
				+ ", customerDateOfBirth=" + customerDateOfBirth + "]";
	}

}
