package com.xworkz.loksabha;

import com.xworkz.loksabha.addpolitican.LokSabha;
import com.xworkz.loksabha.politician.Politician;

public class LokSabhaRunner {
    public static void main(String[] args) {
        Politician politician = new Politician();
        politician.setPoliticianId("P101");
        politician.setName("Politician");
        politician.setParty("National Party");
        politician.setConstituency("Kerala");
        politician.setAge(49);
        politician.setPosition("Member of Parliament");

        LokSabha sabha = new LokSabha();
        if (sabha.addPolitician(politician)) {
            sabha.getPoliticianDetails();
        } else {
            System.out.println("FAILED TO GET POLITICIAN DETAILS");
        }
    }
}
