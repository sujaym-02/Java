class PassportSeva {

     	static String givenName ;
	static String surName ; 
	static String password;
	static String confirmPassword; 
      

      public static boolean  registerUser(String gName , String sName,String pwd,String cPwd){
                boolean isUserRegistered = false;
               	boolean givenNameValid = false;
		boolean surNameValid  = false;
		boolean passwordValid = false;
		boolean confirmPasswordValid = false;
		 
		if( gName != null){
			  givenName     =   gName  ; 
			  givenNameValid        = true ; 
			       
		}else{
		  	System.out.println("Give Valid UserName \n");

			}
				
		if(sName != null){
				surName       = sName;
				surNameValid = true ; 
		}else{
 				System.out.println("Give Valid Sur Name\n");
			}
		

		if(pwd !=null){
		  password = pwd;
		  passwordValid = true;
		}else{
		System.out.println("Give a Valid Password\n");
		}	

		if(cPwd !=null && pwd == cPwd){
			confirmPassword = cPwd;
			confirmPasswordValid = true ;
		}else{
			System.out.println("Enter the Coreect password\n");
		}

		if(givenNameValid  && surNameValid && passwordValid && confirmPasswordValid){
				isUserRegistered  = true;
		}
					
	        return  isUserRegistered; 
					
	  }
	  
	  
		public static void getUserInfo(){
		System.out.println("The given Name is "+ givenName);
		System.out.println ("The Sur Name is "+ surName);
		System.out.println("The Passwor is : "+ password);
		System.out.println("The Confirmed Password is : "+ confirmPassword);
		
	   }




}