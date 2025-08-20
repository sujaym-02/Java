package com.xworkz.playstoreapp.validation;

import com.xworkz.playstoreapp.user.User;

public class UserValidation {
    User user;
    public boolean userValid(User user){
        boolean isUserValid=false;
        boolean idValid=false;
        boolean fNameValid=false;
        boolean sNameValid=false;
        boolean ageValid=false;
        boolean  phoneNumberValid=false;
        boolean eMailIdValid=false;
        boolean cityValid=false;
        boolean stateValid=false;
        boolean countryValid=false;
        boolean isLoginIdSameAsEmailIdValid=false;
        boolean loginIdValid=false;
        boolean pwdValid=false;
        boolean cPwdValid=false;
        boolean hintQuestionValid=false;
        boolean hintAnsValid=false;

        if (user.getIsLoginIdSameAsEmailId()!=null && !user.getIsLoginIdSameAsEmailId().isEmpty()){
            isLoginIdSameAsEmailIdValid=true;
        }else System.out.println("NOT VALID same");

        if (user.getAge()!=null && !user.getAge().isEmpty() ){
            ageValid=true;
        }else System.out.println("NOT VALID AGE <0");

        if (user.getCity()!=null && !user.getCity().isEmpty()){
            cityValid=true;
        }else System.out.println("NOT VALID CITY NAME");

        if (user.getCountry()!=null && !user.getCountry().isEmpty()){
            countryValid=true;
        }else System.out.println("NOT VALID COUNTRY");

        if (user.getfName()!=null && !user.getfName().isEmpty()){
            fNameValid=true;
        }else System.out.println("NAME NOT VALID fname");

        if (user.getSname()!=null && !user.getSname().isEmpty()){
            sNameValid = true;
        }else System.out.println("NOT VALID sname");

        if (user.getId()!=null && !user.getId().isEmpty()){
            idValid=true;
        }else System.out.println("NOT VALID id");
        if (user.getEMailId()!=null && !user.getEMailId().isEmpty()){
            eMailIdValid=true;
        }else System.out.println("NOT VALID mailid");

        if (user.getPhoneNumber()!=null && !user.getPhoneNumber().isEmpty()){
            phoneNumberValid=true;
        }else System.out.println("NOT VALID phonenumber");

        if (user.getLoginId()!=null&& !user.getLoginId().isEmpty()){
            loginIdValid=true;
        }else System.out.println("NOT VALID loginid");

        if (user.getPwd()!=null && !user.getPwd().isEmpty()){
            pwdValid=true;
        }else System.out.println("NOT VALID pwd");

        if (user.getcPwd()!=null && !user.getcPwd().isEmpty() &&user.getcPwd()==user.getPwd()){
            cPwdValid=true;
        }else System.out.println("CONFIRM PASSWORD NOT VALID");

        if (user.getHintQuestion()!=null && !user.getHintQuestion().isEmpty()){
            hintQuestionValid=true;
        }else System.out.println("NOT VALID hintq");

        if (user.getHintAns()!=null && !user.getHintAns().isEmpty()){
            hintAnsValid=true;
        }else System.out.println("NOT VALID hintans");

        if (ageValid&&cityValid && countryValid && cPwdValid && eMailIdValid && fNameValid && hintAnsValid && hintQuestionValid && isLoginIdSameAsEmailIdValid){
            isUserValid=true;
            System.out.println("FINAL VERIFICATION DONE");
        }else System.out.println("final verification failed");
        return isUserValid;

    }
}
