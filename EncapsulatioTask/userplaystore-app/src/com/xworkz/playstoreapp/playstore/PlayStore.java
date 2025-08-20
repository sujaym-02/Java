package com.xworkz.playstoreapp.playstore;

import com.xworkz.playstoreapp.user.User;
import com.xworkz.playstoreapp.validation.UserValidation;

public class PlayStore {
    User user;
    public boolean isAuthorized(User user){
        UserValidation userValidation =new UserValidation();
        boolean isApplicable=false;

        if (userValidation.userValid(user)){
        this.user=user;
        isApplicable=true;
            System.out.println("VERIFIED SUCCESSFULLY");
        }else System.out.println("NOt Appplicable");


        return isApplicable;
    }

    public void display() {
        System.out.println("----- User Details -----");
        System.out.println("ID: " + user.getId());
        System.out.println("First Name: " + user.getfName());
        System.out.println("Second Name: " + user.getSname());
        System.out.println("Age: " + user.getAge());
        System.out.println("Phone Number: " + user.getPhoneNumber());
        System.out.println("Email ID: " + user.getEMailId());
        System.out.println("City: " + user.getCity());
        System.out.println("State: " + user.getState());
        System.out.println("Country: " + user.getCountry());
        System.out.println("Login ID same as Email ID: " + user.getIsLoginIdSameAsEmailId());
        System.out.println("Login ID: " + user.getLoginId());
        System.out.println("Password: " + user.getPwd());
        System.out.println("Confirm Password: " + user.getcPwd());
        System.out.println("Hint Question: " + user.getHintQuestion());
        System.out.println("Hint Answer: " + user.getHintAns());
        System.out.println("-------------------------");
    }

}
