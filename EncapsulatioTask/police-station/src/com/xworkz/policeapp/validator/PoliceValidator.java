package com.xworkz.policeapp.validator;

import com.xworkz.policeapp.police.Police;

public class PoliceValidator {

    public boolean policeValid(Police police) {
        boolean isPoliceValid = false;
        boolean idValid = false;
        boolean nameValid = false;
        boolean rankValid = false;
        boolean badgeValid = false;
        boolean deptValid = false;
        boolean contactValid = false;

        if (police.getPoliceId() != null && !police.getPoliceId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("POLICE ID NOT VALID");
        }

        if (police.getName() != null && !police.getName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("POLICE NAME NOT VALID");
        }

        if (police.getRank() != null && !police.getRank().isEmpty()) {
            rankValid = true;
        } else {
            System.out.println("POLICE RANK NOT VALID");
        }

        if (police.getBadgeNumber() != null && !police.getBadgeNumber().isEmpty()) {
            badgeValid = true;
        } else {
            System.out.println("BADGE NUMBER NOT VALID");
        }

        if (police.getDepartment() != null && !police.getDepartment().isEmpty()) {
            deptValid = true;
        } else {
            System.out.println("DEPARTMENT NOT VALID");
        }

        if (police.getContactNumber() != null && !police.getContactNumber().isEmpty()) {
            contactValid = true;
        } else {
            System.out.println("CONTACT NUMBER NOT VALID");
        }

        if (idValid && nameValid && rankValid && badgeValid && deptValid && contactValid) {
            isPoliceValid = true;
        }

        return isPoliceValid;
    }
}
