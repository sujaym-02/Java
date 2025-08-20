package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.validator.PoliceValidator;

public class PoliceStation {
    private Police police;

    public boolean addPolice(Police police) {
        boolean isPoliceAdded = false;
        PoliceValidator validator = new PoliceValidator();
        boolean validPolice = validator.policeValid(police);

        if (validPolice) {
            this.police = police;
            System.out.println("POLICE ADDED TO STATION SUCCESSFULLY");
            isPoliceAdded = true;
        } else {
            System.out.println("ADDING POLICE FAILED");
        }
        return isPoliceAdded;
    }

    public void getPoliceDetails() {
        if (police == null) {
            System.out.println("NO POLICE AVAILABLE IN STATION");
            return;
        }

        System.out.println("POLICE ID     : " + police.getPoliceId());
        System.out.println("NAME          : " + police.getName());
        System.out.println("RANK          : " + police.getRank());
        System.out.println("BADGE NUMBER  : " + police.getBadgeNumber());
        System.out.println("DEPARTMENT    : " + police.getDepartment());
        System.out.println("CONTACT NO    : " + police.getContactNumber());
    }
}
