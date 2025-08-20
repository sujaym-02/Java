package com.xworkz.passportapp;

import com.xworkz.passportapp.passport.PassPort;
import com.xworkz.passportapp.passportseva.PassPortSeva;

public class PassPortRunner {

     public static void main(String args[]){
        System.out.println("Main Started");

         PassPort passPort = new PassPort();
         passPort.setCpvLocation("Po");
         passPort.setAddress("Banglore");
         passPort.setGivenName("Sujay");
         passPort.setSurName("M");
         passPort.setDob("12/02/2007");
         passPort.setGetEmailId("123@gmail.com");
         passPort.setContinueEmailId(true);
         passPort.setPwd("12345789hgh");
         passPort.setConfirmPwd("123456789hgh");
         passPort.setHintQuestion("Birth Place");
         passPort.setHintAnswer("Kasaragod");


         PassPortSeva passPortSeva = new PassPortSeva();
         passPortSeva.passPort = passPort;
         passPort.getDetails();





        System.out.println("Main Ended");
    }


}
