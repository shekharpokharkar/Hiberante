package com.seleniumExpress.One2Many_BidirectionalMapping;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Product_Many2One")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Product_ID")
	private Integer productId;
	@Column(name = "Product_Name")
	private String productName;
	@Column(name = "Product_Description")
	private String productDescription;
	@Column(name = "Product_Expired")
	private boolean isProductExpired;
	@Column(name = "Product_Expiration")
	private LocalDate productExpiration;
	@Column(name = "Product_Mfg")
	private LocalDate productMfg;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "PID")
	private Customer customer;

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", isProductExpired=" + isProductExpired + ", productExpiration="
				+ productExpiration + ", productMfg=" + productMfg + "]";
	}

}
