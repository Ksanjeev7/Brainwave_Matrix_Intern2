package com.hms.patients;

import java.util.Date;

public class Patient {

	private int patientId;
    private String name;
    private String contact;
    private String address;
    private Date registrationDate;
    
    
	public Patient(int patientId, String name, String contact, String address, Date registrationDate) {
		this.patientId = patientId;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.registrationDate = registrationDate;
	}
	
	public int getPatientId() {
		return this.patientId;
	}
	public String getName() {
		return this.name;
	}
	public String getContact() {
		return this.contact;
	}
	public String getAddress() {
		return this.address;
	}
	public Date getRegistrationDate() {
		return this.registrationDate;
	}
}
