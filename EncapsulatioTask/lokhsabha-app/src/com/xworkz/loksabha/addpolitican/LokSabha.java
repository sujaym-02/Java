package com.xworkz.loksabha.addpolitican;

import com.xworkz.loksabha.politician.Politician;
import com.xworkz.loksabha.validator.PoliticianValidator;

public class LokSabha {
    private Politician politician;

    public boolean addPolitician(Politician politician) {
        boolean isAdded = false;
        PoliticianValidator validator = new PoliticianValidator();
        boolean valid = validator.politicianValid(politician);

        if (valid) {
            this.politician = politician;
            System.out.println("POLITICIAN ADDED SUCCESSFULLY TO LOK SABHA");
            isAdded = true;
        } else {
            System.out.println("ADDING POLITICIAN FAILED");
        }

        return isAdded;
    }

    public void getPoliticianDetails() {

        System.out.println("POLITICIAN ID   : " + politician.getPoliticianId());
        System.out.println("NAME            : " + politician.getName());
        System.out.println("PARTY           : " + politician.getParty());
        System.out.println("CONSTITUENCY    : " + politician.getConstituency());
        System.out.println("AGE             : " + politician.getAge());
        System.out.println("POSITION        : " + politician.getPosition());
    }
}
