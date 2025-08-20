package com.xworkz.passportapp.passportseva;

import com.xworkz.passportapp.passport.PassPort;

public class PassPortSeva {


    public PassPort passPort;

    public boolean createPassportUser(PassPort PassPort){
        boolean passportUserCreated = false;

        boolean cpvLocationValid = false;
        boolean addressValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean dobValid = false ;
        boolean getEmailID = false;
        boolean continueEmailIdValid = false ;
        boolean pwdValid = false;
        boolean confirmPwdValid = false;
        boolean hintQuestionValid = false;
        boolean hintAnswerValid = false;

        if (PassPort.getCpvLocation()!=null){
            cpvLocationValid = true ;
        }
        else {
            System.out.println("Cpv Location is not valid\n");
        }

        if (PassPort.getAddress()!=null){
            addressValid = true;
        }
        else {
            System.out.println("Address is not Valid\n");
        }

        if (PassPort.getGivenName()!=null){
            givenNameValid = true ;
        }
        else{
            System.out.println("Given Name is not Valid\n");
        }
        if (PassPort.getSurName()!=null){
            surNameValid = true;
        }
        else{
            System.out.println("Sur NAme is not Valid");
        }

        if (PassPort.getDob()!=null){
            dobValid = true;
        }
        else {
            System.out.println("Given DOB is not Valid\n");
        }

        if (PassPort.getGetEmailId()!=null){
            givenNameValid = true;
        }
        else{
            System.out.println("Email ID is not Valid\n");
        }

        if (PassPort.getContinueEmailID()!= false){
            continueEmailIdValid = true;
        }
        else{
            System.out.println("Continue Email ID is not Given");
        }


        if (PassPort.getPwd()!=null){
            pwdValid = true;
        }
        else{
            System.out.println("Password given is not Valid\n");
        }

        if (PassPort.getConfirmPwd()!=null){
            confirmPwdValid = true ;
        }
        else {
            System.out.println("Confirm Password is not Valid\n");
        }


        if (PassPort.getHintQuestion()!=null){
            hintQuestionValid = true;
        }
        else {
            System.out.println("Given Hint Question is not Valid\n");
        }

        if (PassPort.getHintAnswer()!=null){
            hintAnswerValid = true;
        }
        else {
            System.out.println("Given Hint Answer is not Valid");
        }

        return passportUserCreated = true;





    }
}
