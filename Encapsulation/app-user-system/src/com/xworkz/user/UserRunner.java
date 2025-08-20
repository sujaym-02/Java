package com.xworkz.user;

import com.xworkz.user.userdata.UserData;
import com.xworkz.user.userdetails.User;
/*import com.xworkz.user.userverification.UserVerfication;*/

public class UserRunner {

    public static  void main(String args[]){

        System.out.println("Mian Started\n");


        User user = new User();
        //user.setUserId(1);
        //user.setfName("");
        user.setLName("M");
        user.setEmail("sujaymungath@gmail.com");
        user.setAge(19);
        user.setNumber(8978459645L);
        user.setPwd("kl14a");
        user.setCPwd("kl14a");
        user.setCity("RAjajiNAgar");
        user.setState("Banglore");
        user.setCountry("India");
        user.setHintQues("Favt game");
        user.setHintAns("FootBall");
        user.setCaptcha("zE3t5R");
        user.setIsLoginIdIsEmail("Yes");


        UserData userVerfication = new UserData();
        boolean install = userVerfication.userVerfication(user);
        if (install){
            System.out.println("You Can Install");
            userVerfication.getDetails();
        }else System.out.println("Cannot Install");



        System.out.println("\nMain Ended");





    }
}
