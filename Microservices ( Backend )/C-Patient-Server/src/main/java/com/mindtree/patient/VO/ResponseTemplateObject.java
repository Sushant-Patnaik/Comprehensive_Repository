package com.mindtree.patient.VO;

import com.mindtree.patient.entity.Patient;

import lombok.Data;
@Data
public class ResponseTemplateObject {
	
	private Doctor doctor;
	private Patient[] patient;
}
