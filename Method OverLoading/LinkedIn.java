class LinkedIn{

	public static boolean userLogin(String email,String password){
	
	boolean login = false;
	if(email !=null && password != null){
	login = true;
	System.out.println("Login is Successful Using Email");
	}else{
	System.out.println("Provide required details");
	}
	return login;
	} 


	public static boolean userLogin(long number,String password){
	
	boolean login = false;
	if(number !=0 && password != null){
	login = true;
	System.out.println("Login is Successful Using Number");
	}else{
	System.out.println("Provide required details");
	}
	return login;
	} 




}