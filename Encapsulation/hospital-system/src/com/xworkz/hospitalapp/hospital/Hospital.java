package com.xworkz.hospitalapp.hospital;

public class Hospital {
    String name;
    String location;
    Patient patient;

    public Hospital(String name, String location, Patient patient) {
        this.name = name;
        this.location = location;
        this.patient = patient;
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital Name: " + name);
        System.out.println("Location: " + location);
        if (patient != null) {
            System.out.println("Patient Details:");
            System.out.println("ID: " + patient.getPatientId());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Disease: " + patient.getDisease());
        }
    }
}

