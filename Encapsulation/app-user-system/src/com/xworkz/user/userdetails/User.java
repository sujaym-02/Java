package com.xworkz.user.userdetails;

public class User {

    private int userId;
    private String fName;
    private String lName;
    private String email;
    private int age;
    private long number;
    private String pwd;
    private String cPwd;
    private String city;
    private String state;
    private String country;
    private String hintQues;
    private String hintAns ;
    private String captcha;
    private String isLoginIdIsEmail;


    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }


    public String getFName(){
        return fName;
    }
    public void setfName(String fName){
        this.fName = fName;
    }

    public String getLName(){
        return lName;
    }
    public void setLName(String lName){
        this.lName = lName;
    }


    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number){
        this.number = number;
    }

    public String getPwd(){
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCPwd(){
        return  cPwd;
    }
    public void setCPwd(String cPwd){
        this.cPwd = cPwd;
    }


    public String getCity(){
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState(){
        return  state;
    }
    public void setState(String state){
        this.state = state;
    }

    public String getCountry(){
        return country;
    }


    public void setCountry(String country){
        this.country = country;
    }

    public String getHintAns() {
        return hintAns;
    }

    public void setHintAns(String hintAns) {
        this.hintAns = hintAns;
    }

    public String getHintQues(){
        return hintQues;
    }

    public void setHintQues(String hintQues) {
        this.hintQues = hintQues;
    }

    public String getCaptcha(){
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getIsLoginIdIsEmail(){
        return isLoginIdIsEmail;
    }
    public void setIsLoginIdIsEmail(String isLoginIdIsEmail){
        this.isLoginIdIsEmail = isLoginIdIsEmail;
    }
}
