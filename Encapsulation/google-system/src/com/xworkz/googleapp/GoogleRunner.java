package com.xworkz.googleapp;

import com.xworkz.googleapp.google.Google;
import com.xworkz.googleapp.googleuser.GoogleUser;

public class GoogleRunner {

public static void main (String args[]){

    System.out.println("MAin Started\n");

    Google google = new Google();
    google.setFirstName("Sujay");
    google.setLastName("M");
    google.setDob("25-07-2001");
    google.setGender("Male");
    google.setPassword("kl14a8278");
    google.setConfirmpwd("kl14a8278");

    GoogleUser googleUser = new GoogleUser();
    //googleUser.google = google;
    if(googleUser.createdGoogleUser(google)){
        googleUser.getDetails();
    } else {
        System.out.println("Enter VAlues Again");
    }


    System.out.println("MAin Ended\n");
}

}
