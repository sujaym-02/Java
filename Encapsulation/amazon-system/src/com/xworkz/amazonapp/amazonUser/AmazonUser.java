package com.xworkz.amazonapp.amazonUser;

import com.xworkz.amazonapp.amazon.Amazon;

public class AmazonUser {

    public Amazon amazon;

    public boolean createdAmazonUser(Amazon amazon) {
        boolean createdUser = false;

        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean mobNoValid = false;
        boolean emailIdValid = false;
        boolean passwordValid = false;
        boolean confirmPwdValid = false;


        if (amazon.getFirstName() != null) {
            firstNameValid = true;
        } else {
            System.out.println("Give VAlid name");
        }


        if (amazon.getLastName() != null) {
            lastNameValid = true;
        } else {
            System.out.println("Give VAlid last name");
        }

        if (amazon.getMobNo() != null) {
            mobNoValid = true;
        } else {
            System.out.println("Give VAlid number");
        }

        if (amazon.getEmailId() != null) {
            emailIdValid = true;
        } else {
            System.out.println("Give VAlid Email");
        }


        if (amazon.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("Give VAlid password");
        }


        if (amazon.getConfirmPwd() != null) {
            confirmPwdValid = true;
        } else {
            System.out.println("Give VAlid confirm password");
        }

        if (firstNameValid && lastNameValid && mobNoValid && emailIdValid && passwordValid && confirmPwdValid == true) {
            createdUser = true;
            this.amazon = amazon;
            System.out.println("Account Created Successfully\n");
            //amazon.getDetails();;
        } else {
            System.out.println("Account is Not created\n");
            System.out.println("Please Provide Valid Data");
        }


        return createdUser;
    }


        public void getDetails(){
            System.out.println("The First Name : "+amazon.getFirstName());
            System.out.println("The LAst Name : "+amazon.getLastName());
            System.out.println("The MOBILE no : "+amazon.getMobNo());
            System.out.println("The given Email ID  : "+amazon.getEmailId());
            System.out.println("The Givrn password is : "+amazon.getPassword());
            System.out.println("The Confirmed Passwordd is : "+amazon.getConfirmPwd());
        }


}
