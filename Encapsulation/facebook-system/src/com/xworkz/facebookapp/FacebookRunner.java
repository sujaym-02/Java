package com.xworkz.facebookapp;

import com.xworkz.facebookapp.facebook.Facebook;
import com.xworkz.facebookapp.facebookuser.FacebookUser;

public class FacebookRunner {

    public static void main (String args[]){


        System.out.println("Main Started\n");

        Facebook facebook = new Facebook();
        facebook.setFirstName("SUJAY");
        facebook.setLastName("M");
        facebook.setMobNo("8125897456");
        facebook.setDob("12/02/2002");
        facebook.setGender("M");
        facebook.setEmailId("1234@gamil.com");
        facebook.setPassword("4587poi");
        facebook.setConfirmPwd("4587poi");


        FacebookUser facebookUser = new FacebookUser();
        if ( facebookUser.createdFacebookUser(facebook) == true) {
            facebookUser.getDetails();
        }
        else {
            System.out.println("Enter Data Again\n");
        }





        System.out.println("Main Ended\n");
    }
}
