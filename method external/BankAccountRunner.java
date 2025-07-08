class BankAccountRunner{

	public static void main(String accounts[]){
	
	System.out.println("--------------MAIN STARTED-----------------------\n");

	BankAccount.credit(1000000);
	BankAccount.credit(0);
	//System.out.println("the Total Balance is : "+BankAccount.balance);

	BankAccount.debit(500000000);
	BankAccount.debit(50000);
	//System.out.println("The Total Balance is : " +BankAccount.balance); 

	BankAccount.transfer(30000);
	BankAccount.transfer(30000000);
	//System.out.println("The total balance is : " +BankAccount.balance);
	System.out.println("--------------MAIN ENDED-------------------------\n");



}

}