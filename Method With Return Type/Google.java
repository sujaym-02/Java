class Google{

static String email;
static String password;
static String fullName;
static String username;
static long mobileNumber;

public static boolean registrationUser(String eMail , String passcode ,String fName, String userName ,long phoneNumber){
 boolean  isRegistrationUser = false;
 boolean isvalidEmail= false;
 boolean isvalidPassword= false;
 boolean isvalidFullName= false;
 boolean isvalidUserName= false;
 boolean isvalidMobileNumber= false;

 if(eMail != null){
 email = eMail;
 isvalidEmail = true;
 }else System.out.println("GIVE PROPER DATA");

 if(passcode != null){
 password = passcode;
 isvalidPassword = true;
 }else System.out.println(" GIVE PROPER DATA");
 if(fName!= null){
 fullName = fName;
 isvalidFullName = true;
 }else System.out.println(" GIVE PROPER DATA");

 if(userName!= null){
 username = userName;
 isvalidUserName = true;
 }else System.out.println(" GIVE PROPER DATA");

 if(phoneNumber != 0){
 mobileNumber = phoneNumber;
 isvalidMobileNumber = true;
 }else System.out.println("GIVE PROPER DATA");

 if(isvalidEmail  && isvalidFullName  && isvalidMobileNumber && isvalidPassword && isvalidMobileNumber ){
 isRegistrationUser = true;}
	   
	return isRegistrationUser;
   
 
 }
public static void getDetails(){
System.out.println("the email is :" +email);
System.out.println("the password is "+password);
System.out.println("the name is "+fullName);
System.out.println("the user name " + username);
System.out.println("the number is "+ mobileNumber);
}

}