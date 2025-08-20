package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.amazonUser.AmazonUser;

public class AmazonRunner {

    public static void main(String args[]){

        System.out.println("Main Started\n");

        Amazon amazon = new Amazon();
        //amazon.setFirstName("SUJAY");
        amazon.setLastName("M");
        amazon.setMobNo("8125897456");
        amazon.setEmailId("1234@gamil.com");
        amazon.setPassword("4587poi");
        amazon.setConfirmPwd("4587poi");


        AmazonUser amazonUser = new AmazonUser();
        //amazonUser.createdAmazonUser(amazon);
        if ( amazonUser.createdAmazonUser(amazon)== true) {
            amazonUser.getDetails();
        }
        else {
            System.out.println("Enter Data Again\n");
        }





        System.out.println("Main Ended\n");
    }
}
