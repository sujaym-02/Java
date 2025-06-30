class Bank {

    		static String name;
    		static String branchCode ;
    		static String ifscCode ;
    		static String address ;
    		static String city ;
    		static String state;
    		static String country;
   	 	static String contactNumber;
    		static String email ;
    		static String website ;
    		static int totalEmployees ;
    		static double totalAssets;
    		static double netWorth;
    		static boolean isGovernmentOwned ;
    		static int establishedYear ;
    		static int atmCount;
    		static int accountHolders;
    		static String managerName ;
    		static boolean hasOnlineBanking;
    		static boolean providesLoanServices;

	public static void main (String banks[]){

		System.out.println("Bank Name: " + name);
        	System.out.println("Branch Code: " + branchCode);
        	System.out.println("IFSC Code: " + ifscCode);
       	 	System.out.println("Address: " + address);
        	System.out.println("City: " + city);
        	System.out.println("State: " + state);
        	System.out.println("Country: " + country);
        	System.out.println("Contact Number: " + contactNumber);
        	System.out.println("Email: " + email);
        	System.out.println("Website: " + website);
        	System.out.println("Total Employees: " + totalEmployees);
        	System.out.println("Total Assets: " + totalAssets);
        	System.out.println("Net Worth: " + netWorth);
        	System.out.println("Government Owned: " + isGovernmentOwned);
        	System.out.println("Established Year: " + establishedYear);
        	System.out.println("ATM Count: " + atmCount);
        	System.out.println("Account Holders: " + accountHolders);
        	System.out.println("Manager Name: " + managerName);
        	System.out.println("Online Banking: " + hasOnlineBanking);
        	System.out.println("Provides Loan Services: " + providesLoanServices);
		System.out.println("-------------------------------------------------\n");


    		
    		name = "State Bank of India";
    		branchCode = "SBI123";
    		ifscCode = "SBIN0000123";
    		address = "MG Road, Bangalore";
    		city = "Bangalore";
    		state = "Karnataka";
    		country = "India";
   	 	contactNumber = "08012345678";
    		email = "sbi@example.com";
    		website = "www.onlinesbi.com";
    		totalEmployees = 100;
    		totalAssets = 500000000.0;
    		double netWorth = 120000000.0;
    		isGovernmentOwned = true;
    		establishedYear = 1955;
    		atmCount = 2000;
    		accountHolders = 150000;
    		managerName = "Mr. Ramesh";
    		hasOnlineBanking = true;
    		providesLoanServices = true;



        	System.out.println("Bank Name: " + name);
        	System.out.println("Branch Code: " + branchCode);
        	System.out.println("IFSC Code: " + ifscCode);
       	 	System.out.println("Address: " + address);
        	System.out.println("City: " + city);
        	System.out.println("State: " + state);
        	System.out.println("Country: " + country);
        	System.out.println("Contact Number: " + contactNumber);
        	System.out.println("Email: " + email);
        	System.out.println("Website: " + website);
        	System.out.println("Total Employees: " + totalEmployees);
        	System.out.println("Total Assets: " + totalAssets);
        	System.out.println("Net Worth: " + netWorth);
        	System.out.println("Government Owned: " + isGovernmentOwned);
        	System.out.println("Established Year: " + establishedYear);
        	System.out.println("ATM Count: " + atmCount);
        	System.out.println("Account Holders: " + accountHolders);
        	System.out.println("Manager Name: " + managerName);
        	System.out.println("Online Banking: " + hasOnlineBanking);
        	System.out.println("Provides Loan Services: " + providesLoanServices);
    }
}
