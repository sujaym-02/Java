class PassportSevaRunner {

     public static void main(String seva[]){
	    
		boolean userIsRegistered =   PassportSeva.registerUser("Baba","Das","Baba@123","Baba@123");
	        System.out.println("Is USer Registered "+ userIsRegistered+"\n");
		if(userIsRegistered){
			PassportSeva.getUserInfo();
			System.out.println("Account Created Successfully\n");
			}else{
			 System.out.println("User Can't Create Account\n");	
		}
	}


}