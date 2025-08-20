package com.xworkz.facebookapp.facebookuser;

import com.xworkz.facebookapp.facebook.Facebook;

public class FacebookUser {

    public Facebook facebook;

    public boolean createdFacebookUser(Facebook facebook){
        boolean createdUser = false;

        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean mobNoValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean emailIdValid = false;
        boolean passwordValid = false;
        boolean confirmPwdValid = false;


        if (facebook.getFirstName() != null) {
            firstNameValid = true;
        } else {
            System.out.println("Give Valid name");
        }


        if (facebook.getLastName() != null) {
            lastNameValid = true;
        } else {
            System.out.println("Give Valid last name");
        }

        if (facebook.getMobNo() != null) {
            mobNoValid = true;
        } else {
            System.out.println("Give Valid number");
        }

        if (facebook.getEmailId() != null) {
            emailIdValid = true;
        } else {
            System.out.println("Give VAlid Email");
        }


        if (facebook.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("Give VAlid password");
        }


        if (facebook.getConfirmPwd() != null) {
            confirmPwdValid = true;
        } else {
            System.out.println("Give VAlid confirm password");
        }

        if (facebook.getDob()!=null){
            dobValid = true;
        }else System.out.println("Give Valid DOB");

        if (facebook.getGender()!=null) {
            genderValid = true;
        }else System.out.println("Give Valid Gender");

        if (firstNameValid && lastNameValid && mobNoValid && emailIdValid && passwordValid && confirmPwdValid && dobValid && genderValid == true) {
            createdUser = true;
            this.facebook = facebook;
            System.out.println("Account Created Successfully\n");
        } else {
            System.out.println("Account is Not created\n");
            System.out.println("Please Provide Valid Data");
        }


        return createdUser;
    }


    public void getDetails(){
        System.out.println("The First Name : "+facebook.getFirstName());
        System.out.println("The LAst Name : "+facebook.getLastName());
        System.out.println("The MOBILE no : "+facebook.getMobNo());
        System.out.println("The given Email ID  : "+facebook.getEmailId());
        System.out.println("The Givrn password is : "+facebook.getPassword());
        System.out.println("The Confirmed Passwordd is : "+facebook.getConfirmPwd());
    }

}

