package com.xworkz.loksabha.politician;

public class Politician {
    private String politicianId;
    private String name;
    private String party;
    private String constituency;
    private int age;
    private String position; // e.g., MP, Minister, Speaker

    public String getPoliticianId() {
        return politicianId;
    }
    public void setPoliticianId(String politicianId) {
        this.politicianId = politicianId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }
    public void setParty(String party) {
        this.party = party;
    }

    public String getConstituency() {
        return constituency;
    }
    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
