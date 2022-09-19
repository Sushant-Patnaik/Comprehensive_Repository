package com.mindtree.patient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import javax.persistence.Transient;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String visitedDoctor;
	private String dateOfVisit;
	private String prescription;
	private int age;
	private int visitedDoctorId;
	
	public Patient( String name, String dateOfVisit) {
		super();
		this.name = name;
		this.dateOfVisit = dateOfVisit;
	}	

}
