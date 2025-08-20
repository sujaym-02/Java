package com.xworkz.hospital;

import com.xworkz.hospital.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setPatientId("P101");
        patient.setName("Rahul");
        patient.setAge(25);
        patient.setDisease("Fever");

        Hospital hospital = new Hospital();
        if (hospital.admitPatient(patient)) {
            hospital.getPatientDetails();
        } else {
            System.out.println("GETTING PATIENT DETAILS FAILED");
        }
    }
}
