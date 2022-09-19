package com.mindtree.patient.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
	
	private int id;
	private String name;
	private String gender;
	private String specialist;
	private int numberOfPatients;
	private int age;
	
	
}
