package com.xworkz.policestation.validator;

import com.xworkz.policestation.app.Police;

public class PoliceValidator {
    public boolean validatePoliceInfo(Police police) {
        boolean validated = false;

        boolean idValid = false;
        boolean nameValid = false;
        boolean ageValid = false;
        boolean rankValid = false;
        boolean stationValid = false;
        boolean joinedOnValid = false;
        boolean contactValid = false;
        boolean dutyAreaValid = false;

        if (police.getPoliceId() != null && !police.getPoliceId().isEmpty()) {
            idValid = true;
        } else System.out.println("Invalid Police ID");

        if (police.getName() != null && !police.getName().isEmpty()) {
            nameValid = true;
        } else System.out.println("Invalid Name");

        if (police.getAge() > 20 && police.getAge() < 60) {
            ageValid = true;
        } else System.out.println("Invalid Age");

        if (police.getRank() != null && !police.getRank().isEmpty()) {
            rankValid = true;
        } else System.out.println("Invalid Rank");

        if (police.getStationName() != null && !police.getStationName().isEmpty()) {
            stationValid = true;
        } else System.out.println("Invalid Station Name");

        if (police.getJoinedOn() != null && !police.getJoinedOn().isEmpty()) {
            joinedOnValid = true;
        } else System.out.println("Invalid Joined Date");

        if (police.getContactNumber() != null && police.getContactNumber().matches("\\d{10}")) {
            contactValid = true;
        } else System.out.println("Invalid Contact Number");

        if (police.getDutyArea() != null && !police.getDutyArea().isEmpty()) {
            dutyAreaValid = true;
        } else System.out.println("Invalid Duty Area");

        if (idValid && nameValid && ageValid && rankValid && stationValid
                && joinedOnValid && contactValid && dutyAreaValid) {
            validated = true;
        }

        return validated;
    }
}