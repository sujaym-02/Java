package com.xworkz.playstoreapp;

import com.xworkz.playstoreapp.playstore.PlayStore;
import com.xworkz.playstoreapp.user.User;

public class PlayStoreRunner {
    public static void main(String[] args) {
        User user = new User();

        user.setId("U101");
        user.setfName("Prajwal");
        user.setSname("Yadav");
        user.setAge("22");
        user.setPhoneNumber("9876543210");
        user.setEMailId("prajwal.yadav@example.com");
        user.setCity("Kasaragod");
        user.setState("Kerala");
        user.setCountry("India");
        user.setLoginId("prajwal.yadav");
        user.setPwd("12345678");
        user.setcPwd("12345678");
        user.setHintQuestion("What is your favorite color?");
        user.setHintAns("Blue");
        user.setLoginIdSameAsEmailId("false");




        PlayStore playStore = new PlayStore();

        if (playStore.isAuthorized(user)){
            playStore.display();
        }
    }
}
