package com.xworkz.instituteapp.validator;

import com.xworkz.instituteapp.trainee.Trainee;

public class TraineeValidator {

    public boolean traineeValid(Trainee trainee) {
        boolean isTraineeValid = false;
        boolean idValid = false;
        boolean nameValid = false;
        boolean courseValid = false;
        boolean batchValid = false;
        boolean emailValid = false;
        boolean contactValid = false;

        if (trainee.getTraineeId() != null && !trainee.getTraineeId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("TRAINEE ID NOT VALID");
        }

        if (trainee.getTraineeName() != null && !trainee.getTraineeName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("TRAINEE NAME NOT VALID");
        }

        if (trainee.getCourse() != null && !trainee.getCourse().isEmpty()) {
            courseValid = true;
        } else {
            System.out.println("COURSE NOT VALID");
        }

        if (trainee.getBatch() != null && !trainee.getBatch().isEmpty()) {
            batchValid = true;
        } else {
            System.out.println("BATCH NOT VALID");
        }

        if (trainee.getEmail() != null && !trainee.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("EMAIL NOT VALID");
        }

        if (trainee.getContactNo() != null && !trainee.getContactNo().isEmpty()) {
            contactValid = true;
        } else {
            System.out.println("CONTACT NUMBER NOT VALID");
        }

        if (idValid && nameValid && courseValid && batchValid && emailValid && contactValid) {
            isTraineeValid = true;
        }

        return isTraineeValid;
    }
}
