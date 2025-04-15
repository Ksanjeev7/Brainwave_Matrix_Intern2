package com.hms.appointments;

import java.util.Date;

import com.hms.patients.Patient;
import com.hms.staffs.Doctor;

public class Appointment {
	
	private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private Date appointmentDate;
    private String status;
    
    
    public Appointment(int appointmentId, Patient patient, Doctor doctor, Date appointmentDate, String status) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

	public int getAppointmentId() {
		return this.appointmentId;
	}


	public Patient getPatient() {
		return this.patient;
	}


	public Doctor getDoctor() {
		return this.doctor;
	}


	public Date getAppointmentDate() {
		return this.appointmentDate;
	}

	public String getStatus() {
		return this.status;
	}
 
}
