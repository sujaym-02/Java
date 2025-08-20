package com.xworkz.playstoreapp.user;

public class User {
        private String id;
        private String fName;
        private String sName;
        private String age;
        private String  phoneNumber;
        private String eMailId;
        private String city;
        private String state;
        private String country;
        private String isLoginIdSameAsEmailId;
        private String loginId;
        private String pwd;
        private String cPwd;
        private String hintQuestion;
        private String hintAns;

        public void setId(String id){
            this.id=id;
        }
        public String getId(){
            return id;
        }

        public void setfName(String fName) {
        this.fName = fName;
        }
        public String getfName() {
        return fName;
        }

        public void setSname(String sName){
            this.sName=sName;
        }
        public String getSname(){
            return sName;
        }

        public void setAge(String age){
            this.age=age;
        }
        public String getAge(){
            return age;
        }

        public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
        }
        public String getPhoneNumber(){
            return phoneNumber;
        }

        public void setEMailId(String eMailId) {
        this.eMailId = eMailId;
        }
        public String getEMailId() {
        return eMailId;
        }

        public void setCity(String city){
            this.city=city;
        }
        public String getCity(){
            return city;
        }

        public void setState(String state){
            this.state=state;
        }
        public String getState(){
            return state;
        }

        public void setCountry(String country){
            this.country=country;
        }
        public String getCountry(){
            return country;
        }

        public void setLoginIdSameAsEmailId(String isLoginIdSameAsEmailId){
            this.isLoginIdSameAsEmailId=isLoginIdSameAsEmailId;
        }
        public String getIsLoginIdSameAsEmailId(){
            return isLoginIdSameAsEmailId;
        }

        public void setLoginId(String loginId){
            this.loginId=loginId;
        }
        public String getLoginId(){
            return loginId;
        }

        public void setPwd(String pwd) {
        this.pwd = pwd;
        }
        public String getPwd() {
        return pwd;
        }

        public void setcPwd(String cPwd) {
        this.cPwd = cPwd;
        }
        public String getcPwd() {
        return cPwd;
        }

        public void setHintQuestion(String hintQuestion){
            this.hintQuestion=hintQuestion;
        }
        public String getHintQuestion(){
            return hintQuestion;
        }

        public void setHintAns(String hintAns){
            this.hintAns=hintAns;
        }
        public String getHintAns(){
            return hintAns;
        }



}
