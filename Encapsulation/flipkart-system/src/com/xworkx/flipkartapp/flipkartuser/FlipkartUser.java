package com.xworkx.flipkartapp.flipkartuser;

import com.xworkx.flipkartapp.flipkart.Flipkart;

public class FlipkartUser {

    public Flipkart flipkart;

    public boolean createdFlipkartUser(Flipkart flipkart) {
        boolean createdUser = false;

        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean mobNoValid = false;
        boolean emailIdValid = false;
        boolean passwordValid = false;
        boolean confirmPwdValid = false;


        if (flipkart.getFirstName() != null) {
            firstNameValid = true;
        } else {
            System.out.println("Give VAlid name");
        }


        if (flipkart.getLastName() != null) {
            lastNameValid = true;
        } else {
            System.out.println("Give VAlid last name");
        }

        if (flipkart.getMobNo() != null) {
            mobNoValid = true;
        } else {
            System.out.println("Give VAlid number");
        }

        if (flipkart.getEmailId() != null) {
            emailIdValid = true;
        } else {
            System.out.println("Give VAlid Email");
        }


        if (flipkart.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("Give VAlid password");
        }


        if (flipkart.getConfirmPwd() != null) {
            confirmPwdValid = true;
        } else {
            System.out.println("Give VAlid confirm password");
        }

        if (firstNameValid && lastNameValid && mobNoValid && emailIdValid && passwordValid && confirmPwdValid == true) {
            createdUser = true;
            this.flipkart = flipkart;
            System.out.println("Account Created Successfully\n");
            //amazon.getDetails();;
        } else {
            System.out.println("Account is Not created\n");
            System.out.println("Please Provide Valid Data");
        }


        return createdUser;
    }


    public void getDetails(){
        System.out.println("The First Name : "+flipkart.getFirstName());
        System.out.println("The LAst Name : "+flipkart.getLastName());
        System.out.println("The MOBILE no : "+flipkart.getMobNo());
        System.out.println("The given Email ID  : "+flipkart.getEmailId());
        System.out.println("The Givrn password is : "+flipkart.getPassword());
        System.out.println("The Confirmed Passwordd is : "+flipkart.getConfirmPwd());
    }


}
