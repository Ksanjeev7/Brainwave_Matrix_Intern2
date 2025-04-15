package com.hms.mainsystem;

import java.util.ArrayList;
import java.util.List;

import com.hms.ElectronicHealthRecord.EHR;
import com.hms.appointments.Appointment;
import com.hms.billing.Billing;
import com.hms.inventory.Inventory;
import com.hms.patients.Patient;
import com.hms.staffs.Doctor;
import com.hms.staffs.Staff;

public class HealthManagementSystem {
	
	private List<Patient> patients;
    private List<Appointment> appointments;
    private List<Doctor> doctors;
    private List<EHR> ehrs;
    private List<Billing> billings;
    private List<Inventory> inventory;
    private List<Staff> staff;
    
    public HealthManagementSystem() {
    	
    	this.patients = new ArrayList<>();
       this. appointments = new ArrayList<>();
       this. doctors = new ArrayList<>();
        this.ehrs = new ArrayList<>();
        this.billings = new ArrayList<>();
       this. inventory = new ArrayList<>();
       this. staff = new ArrayList<>();
    }
    
   
    public void registerPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null");
        }
        // Validate if patient already exists
        if (patients.stream().anyMatch(p -> p.getPatientId() == patient.getPatientId())) {
            throw new IllegalStateException("Patient with ID " + patient.getPatientId() + " already exists");
        }
        patients.add(patient);
        System.out.println("Patient registered with ID: " + patient.getPatientId());
    }

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled with ID: " + appointment.getAppointmentId());
    }

    public void createEHR(Patient patient) {
        EHR ehr = new EHR(ehrs.size() + 1, patient);
        ehrs.add(ehr);
        System.out.println("EHR created for patient with ID: " + patient.getPatientId());
    }

    public void updateEHR(int ehrId, String medicalHistory, String prescription, String testResult) {
        for (EHR ehr : ehrs) {
            if (ehr.getEhrId() == ehrId) {
                ehr.addMedicalHistory(medicalHistory);
                ehr.addPrescription(prescription);
                ehr.addTestResult(testResult);
                System.out.println("EHR updated.");
                return;
            }
        }
        System.out.println("EHR not found.");
    }

    public void generateBill(Billing bill) {
        billings.add(bill);
        System.out.println("Bill generated Amount: Rs:" + bill.getAmount());
    }

    public void addInventoryItem(Inventory item) {
        inventory.add(item);
        System.out.println("Inventory added: " + item.getItemName());
    }

    public void updateInventory(int itemId, int newQuantity) {
        for (Inventory item : inventory) {
            if (item.getItemId() == itemId) {
                item.updateQuantity(newQuantity);
                System.out.println("Inventory updated: " + newQuantity);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
        System.out.println("Staff added: " + staffMember.getName());
    }
    
}
