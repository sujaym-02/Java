package com.xworkx.flipkartapp;

import com.xworkx.flipkartapp.flipkart.Flipkart;
import com.xworkx.flipkartapp.flipkartuser.FlipkartUser;

public class FlipkartRunner {

    public static void main(String args[]) {


        System.out.println("Main Started\n");

        Flipkart flipkart = new Flipkart();
        //amazon.setFirstName("SUJAY");
        flipkart.setLastName("M");
        flipkart.setMobNo("8125897456");
        flipkart.setEmailId("1234@gamil.com");
        flipkart.setPassword("4587poi");
        flipkart.setConfirmPwd("4587poi");


        FlipkartUser flipkartUser = new FlipkartUser();
        if (flipkartUser.createdFlipkartUser(flipkart) == true) {
            flipkartUser.getDetails();
        } else {
            System.out.println("Enter Data Again\n");
        }
    }
}