package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.validator.TraineeValidator;

public class Institute {
    private Trainee trainee;

    public boolean addTrainee(Trainee trainee) {
        boolean isTraineeAdded = false;
        TraineeValidator validator = new TraineeValidator();
        boolean validTrainee = validator.traineeValid(trainee);

        if (validTrainee) {
            this.trainee = trainee;
            System.out.println("TRAINEE ADDED TO INSTITUTE SUCCESSFULLY");
            isTraineeAdded = true;
        } else {
            System.out.println("ADDING TRAINEE FAILED");
        }
        return isTraineeAdded;
    }

    public void getTraineeDetails() {


        System.out.println("TRAINEE ID   : " + trainee.getTraineeId());
        System.out.println("NAME         : " + trainee.getTraineeName());
        System.out.println("COURSE       : " + trainee.getCourse());
        System.out.println("BATCH        : " + trainee.getBatch());
        System.out.println("EMAIL        : " + trainee.getEmail());
        System.out.println("CONTACT NO   : " + trainee.getContactNo());
    }
}
