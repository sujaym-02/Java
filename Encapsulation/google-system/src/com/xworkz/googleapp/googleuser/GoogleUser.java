package com.xworkz.googleapp.googleuser;

import com.xworkz.googleapp.google.Google;

public class GoogleUser {

    public Google google;

    public boolean createdGoogleUser(Google google) {
        boolean googleUSerCreated = false;

        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean dobValid = false;
        boolean genderValid = false;
        boolean passwordValid = false;
        boolean confirmPwdValid = false;



        if (google.getFirstName()!=null){
            firstNameValid = true;
        }
        else{
            System.out.println("Enter Valid FirstName\n");
        }

        if (google.getLastName()!=null){
            lastNameValid = true;
        }
        else {
            System.out.println("Enter VAlid Last Name\n");
        }

        if (google.getDob() != null){
            dobValid = true;
        }
        else {
            System.out.println("Enter VAlid DOB \n");
        }

        if (google.getGender() != null){
            genderValid = true;
        }
        else {
            System.out.println("Enter A Valid Gender\n");
        }

        if (google.getPassword() != null){
            passwordValid = true;
        }
        else {
            System.out.println("Enter Valid Password\n");
        }

        if ((google.getConfirmpwd() != null) && (google.getPassword() == google.getConfirmpwd())){
            confirmPwdValid = true;
        }
        else {
            System.out.println("Enter The Password give Above\n");
        }

        if (firstNameValid && lastNameValid && dobValid && genderValid && passwordValid && confirmPwdValid == true){
            googleUSerCreated = true;
            this.google = google;
            System.out.println("Account Created\n");
            //getDetails();
        }
        else{
//            System.out.println("Account is not Creates");
            System.out.println("Enter Proper  VAlid Data");
        }

        return googleUSerCreated ;
    }
    public void getDetails(){
        System.out.println("The Fisrt Name is  : "+google.getFirstName());
        System.out.println("The Last Name is : "+google.getLastName());
        System.out.println("The DOB is  : "+google.getDob());
        System.out.println("The Gender is  : "+google.getGender());
        System.out.println("The Password give is  : "+google.getPassword());
        System.out.println("The Confirmed Password is  : "+google.getConfirmpwd());
    }


}
