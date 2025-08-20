package com.xworkz.passportapp.passport;

import java.sql.SQLOutput;

public class PassPort {

    private String  cpvLocation ;
    public String getCpvLocation() {
        return cpvLocation;
    }
    public void setCpvLocation(String cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    private String address;
    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    private String givenName;
    public String getGivenName(){
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    private String surName;
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    private String dob;
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    private String getEmailId;
    public String getGetEmailId() {
        return getEmailId;
    }
    public void setGetEmailId(String getEmailId){
        this.getEmailId = getEmailId;
    }

    private boolean continueEmailId;
    public  boolean getContinueEmailID(){
        return continueEmailId;
    }
    public void setContinueEmailId(boolean continueEmailId) {
        this.continueEmailId = continueEmailId;
    }

    private String pwd;
    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }


    private String confirmPwd;
    public String getConfirmPwd(){
        return confirmPwd;
    }
    public void setConfirmPwd(String confirmPwd){
        this.confirmPwd = confirmPwd;
    }

    private String hintQuestion;
    public String getHintQuestion() {
        return hintQuestion;
    }
    public void setHintQuestion(String hintQuestion){
        this.hintQuestion = hintQuestion;
    }


    private  String hintAnswer;
    public String getHintAnswer(){
        return hintAnswer;
    }
    public void setHintAnswer(String hintAnswer){
        this.hintAnswer = hintAnswer ;
    }

    public void getDetails(){
        System.out.println("Account Created SuccessFully\n");
        System.out.println("CPV Location: " + getCpvLocation());
        System.out.println("Address: " + getAddress());
        System.out.println("Given Name: " + getGivenName());
        System.out.println("Surname: " + getSurName());
        System.out.println("Date of Birth: " + getDob());
        System.out.println("Email ID: " + getGetEmailId());
        System.out.println("Continue Email ID: " + getContinueEmailID());
        System.out.println("Password: " + getPwd());
        System.out.println("Confirm Password: " + getConfirmPwd());
        System.out.println("Hint Question: " + getHintQuestion());
        System.out.println("Hint Answer: " + getHintAnswer());
    }
}

