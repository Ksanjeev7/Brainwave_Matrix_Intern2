package com.hms.mainsystem;

import java.util.Date;

import com.hms.appointments.Appointment;
import com.hms.billing.Billing;
import com.hms.inventory.Inventory;
import com.hms.patients.Patient;
import com.hms.staffs.Doctor;
import com.hms.staffs.Staff;

public class MainApplication {


	public static void main(String[] args) {
		
		HealthManagementSystem hms = new HealthManagementSystem();

        Patient patient = new Patient(1, "John Doe", "1236547890", "123 Main St", new Date());
        hms.registerPatient(patient);

        hms.createEHR(patient);
        hms.updateEHR(1, "Hypertension", "Aspirin", "BP: 140/90");

        Doctor doctor = new Doctor(1, "Dr. Smith", "Cardiology", "9876543210", "9 AM - 5 PM");
        Appointment appointment = new Appointment(1, patient, doctor, new Date(), "Scheduled");
        hms.scheduleAppointment(appointment);

        Billing bill = new Billing(1, patient, 500.0);
        hms.generateBill(bill);

        Inventory item = new Inventory(1, "Bandages", 100, 5.0, "Med Supplies");
        hms.addInventoryItem(item);
        hms.updateInventory(1, 90);

        Staff nurse = new Staff(1, "Nurse Jane", "Nurse", "7561234567", "Emergency");
        hms.addStaff(nurse);

	}
	
}
