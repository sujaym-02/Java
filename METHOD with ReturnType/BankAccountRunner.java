class BankAccountRunner {

    public static void main(String[] accounts) {
        System.out.println("main started");

        boolean amountCredited=BankAccount.credit(00);
	System.out.println(amountCredited);
	amountCredited=BankAccount.credit(800);
	System.out.println(amountCredited);
        double currentBalance = BankAccount.getBalance();
        System.out.println("The Current Balance is " + currentBalance);

        boolean amountDebited=BankAccount.debit(100.00);
	System.out.println(amountDebited);
	amountDebited=BankAccount.debit(10000000);
	System.out.println(amountDebited);
        System.out.println("The Current Balance is " + BankAccount.getBalance());
        System.out.println("main ended");
    }

}