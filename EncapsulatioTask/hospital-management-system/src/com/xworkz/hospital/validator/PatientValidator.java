package com.xworkz.hospital.validator;

import com.xworkz.hospital.patient.Patient;

public class PatientValidator {

    public boolean patientValid(Patient patient) {
        boolean isPatientValid = false;
        boolean idValid = false;
        boolean nameValid = false;
        boolean ageValid = false;
        boolean diseaseValid = false;

        if (patient.getPatientId() != null && !patient.getPatientId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("PATIENT ID NOT VALID");
        }

        if (patient.getName() != null && !patient.getName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("PATIENT NAME NOT VALID");
        }

        if (patient.getAge() > 0) {
            ageValid = true;
        } else {
            System.out.println("PATIENT AGE NOT VALID");
        }

        if (patient.getDisease() != null && !patient.getDisease().isEmpty()) {
            diseaseValid = true;
        } else {
            System.out.println("PATIENT DISEASE NOT VALID");
        }

        if (idValid && nameValid && ageValid && diseaseValid) {
            isPatientValid = true;
        }

        return isPatientValid;
    }
}
