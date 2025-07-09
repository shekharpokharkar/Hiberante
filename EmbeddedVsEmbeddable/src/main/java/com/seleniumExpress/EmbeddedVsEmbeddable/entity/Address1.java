package com.seleniumExpress.EmbeddedVsEmbeddable.entity;



import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Embeddable
public class Address1 {
	
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;

}
