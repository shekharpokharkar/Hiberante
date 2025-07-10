package com.seleniumExpress.Many_2_Many_BidirectionlMapping;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "Actor_Many2Many")
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Actor_Id")
	private Integer actorId;
	@Column(name="Actor_Name")
	private String actorName;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(
			name = "MOVIE_ACTOR", 
			joinColumns =@JoinColumn(name = "Actor_ID", referencedColumnName = "Actor_Id"), 
	 inverseJoinColumns =@JoinColumn(name = "Movie_ID", referencedColumnName = "Movie_Id"))
	private List<Movie>movieList;
}
