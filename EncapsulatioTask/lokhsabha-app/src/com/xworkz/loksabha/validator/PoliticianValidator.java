package com.xworkz.loksabha.validator;

import com.xworkz.loksabha.politician.Politician;

public class PoliticianValidator {

    public boolean politicianValid(Politician politician) {
        boolean isValid = false;
        boolean idValid = false;
        boolean nameValid = false;
        boolean partyValid = false;
        boolean constituencyValid = false;
        boolean ageValid = false;
        boolean positionValid = false;

        if (politician.getPoliticianId() != null && !politician.getPoliticianId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("POLITICIAN ID NOT VALID");
        }

        if (politician.getName() != null && !politician.getName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("NAME NOT VALID");
        }

        if (politician.getParty() != null && !politician.getParty().isEmpty()) {
            partyValid = true;
        } else {
            System.out.println("PARTY NOT VALID");
        }

        if (politician.getConstituency() != null && !politician.getConstituency().isEmpty()) {
            constituencyValid = true;
        } else {
            System.out.println("CONSTITUENCY NOT VALID");
        }

        if (politician.getAge() > 25) {
            ageValid = true;
        } else {
            System.out.println("AGE NOT VALID (must be > 25)");
        }

        if (politician.getPosition() != null && !politician.getPosition().isEmpty()) {
            positionValid = true;
        } else {
            System.out.println("POSITION NOT VALID");
        }

        if (idValid && nameValid && partyValid && constituencyValid && ageValid && positionValid) {
            isValid = true;
        }

        return isValid;
    }
}
