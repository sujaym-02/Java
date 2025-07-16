class Instagram{

	public static boolean login(String userName, String password){

	boolean login = false;
	if(userName != null && password != null){
	login = true;
	System.out.println("Login is done using UserName");
	
	}else{
		System.out.println("provide proper details");
	}
	return login;
	}

	public static boolean login(long number, String password){

	boolean login = false;
	if(number != 0 && password != null){
	login = true;
	System.out.println("Login is done using Mobile Number");
	}else{
		System.out.println("provide proper details");
	}

	return login;
	}

	

}