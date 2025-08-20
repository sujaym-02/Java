package com.xworkz.policestation.management;

import com.xworkz.policestation.app.Police;
import com.xworkz.policestation.validator.PoliceValidator;

public class PoliceStation {
    private Police police;

    public boolean addPolice(Police police) {
        boolean added = false;

        PoliceValidator validator = new PoliceValidator();
        boolean isValid = validator.validatePoliceInfo(police);

        if (isValid) {
            this.police = police;
            added = true;
        }

        return added;
    }

    public void getPoliceInfo() {
        System.out.println("Police ID: " + police.getPoliceId());
        System.out.println("Name: " + police.getName());
        System.out.println("Age: " + police.getAge());
        System.out.println("Rank: " + police.getRank());
        System.out.println("Station Name: " + police.getStationName());
        System.out.println("Joined On: " + police.getJoinedOn());
        System.out.println("Contact Number: " + police.getContactNumber());
        System.out.println("Duty Area: " + police.getDutyArea());
    }
}