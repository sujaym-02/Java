package com.xworkz.policestation;

import com.xworkz.policestation.app.Police;
import com.xworkz.policestation.management.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        System.out.println("Police Station system started...");

        Police police = new Police();
        police.setPoliceId("PS101");
        police.setName("Sujay Kumar");
        police.setAge(35);
        police.setRank("Inspector");
        police.setStationName("Bangalore Central");
        police.setJoinedOn("15/03/2010");
        police.setContactNumber("9876543210");
        police.setDutyArea("MG Road");

        PoliceStation policeStation = new PoliceStation();
        boolean added = policeStation.addPolice(police);
        System.out.println("Police officer added: " + added);

        if (added) {
            policeStation.getPoliceInfo();
        }
    }
}