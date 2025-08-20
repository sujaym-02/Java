package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        Police police = new Police();
        police.setPoliceId("P101");
        police.setName("Arjun Sarkar");
        police.setRank("Inspector");
        police.setBadgeNumber("B202");
        police.setDepartment("Crime Branch");
        police.setContactNumber("9645566258");

        PoliceStation station = new PoliceStation();
        if (station.addPolice(police)) {
            station.getPoliceDetails();
        } else {
            System.out.println("GETTING POLICE DETAILS FAILED");
        }
    }
}
