package com.xworkz.user.userdata;

import com.xworkz.user.userdetails.User;

public class UserData {

    User user;

    public boolean userVerfication(User user){
        boolean  userValid = false;


        boolean fNameValid = false;
        boolean lNameValid = false;
        boolean idValid = false;
        boolean emailValid = false;
        boolean ageValid = false;
        boolean numberValid = false;
        boolean pwdValid = false;
        boolean cPwdValid = false;
        boolean cityValid = false;
        boolean stateValid = false;
        boolean countryValid = false;
        boolean hintQuesValid = false;
        boolean hintAnsValid = false ;
        boolean captchaValid = false;
        boolean isLoginIdIsEmailValid = false;


        if (user.getUserId()> 0){
            idValid = true;
        }
        else System.out.println("Enter VAlid USer Id");

        if (user.getFName()!= null){
            fNameValid = true;
        }else System.out.println("enter proper NAme");

        if (user.getLName()!= null){
            lNameValid = true;
        }else System.out.println("Enter proper lastNAme");

        if (user.getEmail()!= null){
            emailValid = true;
        }
        else System.out.println("Proper Email Needed");


        if (user.getAge()>18){
            ageValid = true;
        }
        else System.out.println("Give ProperAge");

        if (user.getNumber()>0){
            numberValid = true;
        }else System.out.println("Enter Proper Number");

        if (user.getPwd() != null){
            pwdValid = true;
        }else System.out.println("Give proper PWD");

        if (user.getCPwd()!= null){
            cPwdValid = true;
        }else System.out.println("Give proper CPWD");

        if (user.getCity() != null){
            cityValid = true;
        }else System.out.println("City Not VAlid");

        if (user.getState()!= null ){
            stateValid = true;
        }
        else System.out.println("Give Proper State");

        if (user.getCountry()!= null){
             countryValid = true;
        }else System.out.println("Enter proper Countrty");

        if (user.getHintQues()!= null){
            hintQuesValid = true;
        }else System.out.println("Give proper Question");

        if (user.getHintAns()!= null){
            hintAnsValid = true;
        }

        if (user.getCaptcha()!= null){
            captchaValid = true;
        }
        else System.out.println("Provide Proper CApatcha");

        if (user.getIsLoginIdIsEmail()!=null){
            isLoginIdIsEmailValid = true;
        }else System.out.println("Give PropEr Details");


        if (fNameValid && lNameValid && idValid && emailValid && ageValid && numberValid && pwdValid && cPwdValid && cityValid && stateValid && countryValid && hintQuesValid && hintAnsValid && captchaValid && isLoginIdIsEmailValid == true){
            userValid = true;
            this.user = user;
        }else System.out.println("User Details Are Wrong");

        return userValid;
    }


    public void getDetails(){
        System.out.println("id : "+user.getUserId());
        System.out.println("Fname : "+user.getFName());
        System.out.println("L NAme : "+user.getLName());
        System.out.println("Email : "+user.getEmail());
        System.out.println("Age : "+user.getAge());
        System.out.println("Num : "+user.getNumber());
        System.out.println("PWD : "+user.getPwd());
        System.out.println("CPWD : "+user.getCPwd());
        System.out.println("City : "+user.getCity());
        System.out.println("State : "+user.getState());
        System.out.println("Country : "+user.getCountry());
        System.out.println("Ques : "+user.getHintQues());
        System.out.println("Ans : "+ user.getHintAns());
        System.out.println("CAptcha : "+user.getCaptcha());
        System.out.println("IS Valid :"+user.getIsLoginIdIsEmail());
    }
}
