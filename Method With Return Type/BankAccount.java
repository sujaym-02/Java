class BankAccount {
    static double balance = 100;

    public static double getBalance() {
        return balance;
    }

    public static boolean credit(double amount) {
	boolean isCredited=false;
        boolean check = amount > 0.00;
        if (check) {
            balance = amount + balance;
		isCredited=true;
            System.out.println("CREDITED AN AMOUNT OF " + amount);
        } else {
            System.out.println("Amount has to be greater than zero");
        }
        return isCredited;
    }

    public static boolean debit(double amount) {
	boolean isDebited=false;
        boolean check = amount <= balance;
        if (check) {
            balance = balance - amount;
		isDebited=true;
            System.out.println("DEBITED AMOUNT IS " + amount);
        } else {
            System.out.println("Insufficient Balance");     
        }
	return isDebited;
    }
}