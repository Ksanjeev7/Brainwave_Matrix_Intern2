package com.hms.ElectronicHealthRecord;

import java.util.ArrayList;
import java.util.List;

import com.hms.patients.Patient;

public class EHR {

	private int ehrId;
    private Patient patient;
    private List<String> medicalHistory;
    private List<String> prescriptions;
    private List<String> testResults;
    
    public EHR(int ehrId, Patient patient) {
        this.ehrId = ehrId;
        this.patient = patient;
        this.medicalHistory = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
        this.testResults = new ArrayList<>();
    }
    
    
    public void addMedicalHistory(String history) {
        medicalHistory.add(history);
    }

    public void addPrescription(String prescription) {
        prescriptions.add(prescription);
    }

    public void addTestResult(String testResult) {
        testResults.add(testResult);
    }

	public int getEhrId() {
		return this.ehrId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public List<String> getMedicalHistory() {
		return this.medicalHistory;
	}

	public List<String> getPrescriptions() {
		return this.prescriptions;
	}

	public List<String> getTestResults() {
		return this.testResults;
	}
    
}
