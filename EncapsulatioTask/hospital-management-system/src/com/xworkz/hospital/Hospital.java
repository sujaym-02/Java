package com.xworkz.hospital;

import com.xworkz.hospital.patient.Patient;
import com.xworkz.hospital.validator.PatientValidator;

public class Hospital {
    private Patient patient;

    public boolean admitPatient(Patient patient) {
        boolean isAdmitted = false;
        PatientValidator validator = new PatientValidator();
        boolean validPatient = validator.patientValid(patient);

        if (validPatient) {
            this.patient = patient;
            System.out.println("PATIENT ADMITTED SUCCESSFULLY");
            isAdmitted = true;
        } else {
            System.out.println("ADMITTING PATIENT FAILED");
        }
        return isAdmitted;
    }

    public void getPatientDetails() {
        if (patient == null) {
            System.out.println("NO PATIENT ADMITTED YET");
            return;
        }

        System.out.println("PATIENT ID : " + patient.getPatientId());
        System.out.println("PATIENT NAME : " + patient.getName());
        System.out.println("PATIENT AGE : " + patient.getAge());
        System.out.println("DISEASE : " + patient.getDisease());
    }
}
