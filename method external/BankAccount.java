class BankAccount{

	static double balance;

	static void credit(double amount){
	System.out.println("The credited amount is : "+amount);
	if(amount > 0.0){
	balance = balance+amount;
	System.out.println("the Total Balance is : "+balance+"\n");
	}else{
	System.out.println("The Amount Can not be Credited  \n");
	}
	

	
}

	static void debit(double amount){
	System.out.println("The Amount debited is : "+amount);
	if(balance > amount){
	balance =  balance - amount;
	System.out.println("the Total Balance is : "+balance+"\n");
	} else{
	System.out.println("Insufficient Balance\n");
	}

	


}

	static void transfer(double amount){
	System.out.println("The Amount to be transferred is : "+amount);
	if(balance > amount){
	balance =  balance - amount;
	System.out.println("the Total Balance is : "+balance+"\n");
	} else{
	System.out.println("Insufficient Balance\n");
	}

	


}





}