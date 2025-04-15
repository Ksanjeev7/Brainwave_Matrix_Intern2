package com.hms.billing;

import java.time.LocalDateTime;

import com.hms.patients.Patient;

public class Billing {

	private int billId;
    private Patient patient;
    private double amount;
    private LocalDateTime billDate;
    private String status;
    
    public Billing(int billId, Patient patient, double amount) {
        this.billId = billId;
        this.patient = patient;
        this.amount = amount;
        this.billDate = LocalDateTime.now();
        this.status = "pending";
    }

	public int getBillId() {
		return this.billId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public double getAmount() {
		return this.amount;
	}

	public String getStatus() {
		return this.status;
	}
	
	public LocalDateTime getBillDate() {
		return this.billDate;
	}
    
}
