package com.hms.staffs;

public class Doctor {

	private int doctorId;
    private String name;
    private String specialization;
    private String contact;
    private String schedule;
    
   public  Doctor(int doctorId, String name, String specialization, String contact, String schedule) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.contact = contact;
        this.schedule = schedule;
    }

	public int getDoctorId() {
		return this.doctorId;
	}

	public String getName() {
		return this.name;
	}

	public String getSpecialization() {
		return this.specialization;
	}

	public String getContact() {
		return this.contact;
	}

	public String getSchedule() {
		return this.schedule;
	}
}
