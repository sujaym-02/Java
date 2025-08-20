package com.xworkz.instituteapp;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.institute.Institute;

public class InstituteRunner {
    public static void main(String[] args) {
        Trainee trainee = new Trainee();
        trainee.setTraineeId("T101");
        trainee.setTraineeName("Prajwal P");
        trainee.setCourse("Java Full Stack");
        trainee.setBatch("Batch-2025");
        trainee.setEmail("praju@xworkz.com");
        trainee.setContactNo("9645566258");

        Institute institute = new Institute();
        if (institute.addTrainee(trainee)) {
            institute.getTraineeDetails();
        } else {
            System.out.println("FAILED TO GET TRAINEE DETAILS");
        }
    }
}
