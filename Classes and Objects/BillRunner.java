class BillRunner{

	public static void main(String bills[]){

	System.out.println("MAIN STARTED\n");
		
	Bill firstBill = new Bill();
	firstBill.billId = 1;
	firstBill.planType = "Monthly";
	firstBill.billAmountTax = 856.01;
	firstBill.billIssueDate = "12/10/2025";
	firstBill.paymentMethod = "UPI";
	firstBill.billDueDate = "12/11/2025";
	firstBill.isTaxInclusive = true;
	firstBill.isBillPaid = false;
	firstBill.isBillOverDue = true ;

	System.out.println("The Bill ID is : "+firstBill.billId);
	System.out.println("The PAln Type is : "+firstBill.planType);
	System.out.println("The total BILL Amount is : "+firstBill.billAmountTax);
	System.out.println("The Issue Date of Bill is :  "+firstBill.billIssueDate);
	System.out.println("The Payment Method is : "+firstBill.paymentMethod);
	System.out.println("The Due Date Of Bill is : "+firstBill.billDueDate);
	System.out.println("IS the Bill Contains TAX : "+firstBill.isTaxInclusive);
	System.out.println("Is THE Bill Paid : "+firstBill.isBillPaid);
	System.out.println("Is the Bill OverDue : "+firstBill.isBillOverDue+"\n");
        System.out.println();

		
        Bill secondBill = new Bill();
        secondBill.billId = 2;
        secondBill.planType = "Yearly";
        secondBill.billAmountTax = 950.75;
        secondBill.billIssueDate = "01/11/2025";
        secondBill.paymentMethod = "Card";
        secondBill.billDueDate = "01/12/2025";
        secondBill.isTaxInclusive = false;
        secondBill.isBillPaid = true;
        secondBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + secondBill.billId);
        System.out.println("The Plan Type is: " + secondBill.planType);
        System.out.println("The Total Bill Amount is: " + secondBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + secondBill.billIssueDate);
        System.out.println("The Payment Method is: " + secondBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + secondBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + secondBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + secondBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + secondBill.isBillOverDue);
        System.out.println();


        Bill thirdBill = new Bill();
        thirdBill.billId = 3;
        thirdBill.planType = "Monthly";
        thirdBill.billAmountTax = 875.00;
        thirdBill.billIssueDate = "05/11/2025";
        thirdBill.paymentMethod = "Cash";
        thirdBill.billDueDate = "05/12/2025";
        thirdBill.isTaxInclusive = true;
        thirdBill.isBillPaid = false;
        thirdBill.isBillOverDue = true;

        System.out.println("The Bill ID is: " + thirdBill.billId);
        System.out.println("The Plan Type is: " + thirdBill.planType);
        System.out.println("The Total Bill Amount is: " + thirdBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + thirdBill.billIssueDate);
        System.out.println("The Payment Method is: " + thirdBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + thirdBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + thirdBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + thirdBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + thirdBill.isBillOverDue);
        System.out.println();

        Bill fourthBill = new Bill();
        fourthBill.billId = 4;
        fourthBill.planType = "Yearly";
        fourthBill.billAmountTax = 1020.50;
        fourthBill.billIssueDate = "10/11/2025";
        fourthBill.paymentMethod = "UPI";
        fourthBill.billDueDate = "10/12/2025";
        fourthBill.isTaxInclusive = false;
        fourthBill.isBillPaid = true;
        fourthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + fourthBill.billId);
        System.out.println("The Plan Type is: " + fourthBill.planType);
        System.out.println("The Total Bill Amount is: " + fourthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + fourthBill.billIssueDate);
        System.out.println("The Payment Method is: " + fourthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + fourthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + fourthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + fourthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + fourthBill.isBillOverDue);
        System.out.println();

        Bill fifthBill = new Bill();
        fifthBill.billId = 5;
        fifthBill.planType = "Monthly";
        fifthBill.billAmountTax = 890.25;
        fifthBill.billIssueDate = "15/11/2025";
        fifthBill.paymentMethod = "Card";
        fifthBill.billDueDate = "15/12/2025";
        fifthBill.isTaxInclusive = true;
        fifthBill.isBillPaid = false;
        fifthBill.isBillOverDue = true;

        System.out.println("The Bill ID is: " + fifthBill.billId);
        System.out.println("The Plan Type is: " + fifthBill.planType);
        System.out.println("The Total Bill Amount is: " + fifthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + fifthBill.billIssueDate);
        System.out.println("The Payment Method is: " + fifthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + fifthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + fifthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + fifthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + fifthBill.isBillOverDue);
        System.out.println();

        Bill sixthBill = new Bill();
        sixthBill.billId = 6;
        sixthBill.planType = "Monthly";
        sixthBill.billAmountTax = 940.00;
        sixthBill.billIssueDate = "20/11/2025";
        sixthBill.paymentMethod = "Cash";
        sixthBill.billDueDate = "20/12/2025";
        sixthBill.isTaxInclusive = false;
        sixthBill.isBillPaid = true;
        sixthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + sixthBill.billId);
        System.out.println("The Plan Type is: " + sixthBill.planType);
        System.out.println("The Total Bill Amount is: " + sixthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + sixthBill.billIssueDate);
        System.out.println("The Payment Method is: " + sixthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + sixthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + sixthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + sixthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + sixthBill.isBillOverDue);
        System.out.println();

        Bill seventhBill = new Bill();
        seventhBill.billId = 7;
        seventhBill.planType = "Yearly";
        seventhBill.billAmountTax = 1060.15;
        seventhBill.billIssueDate = "25/11/2025";
        seventhBill.paymentMethod = "UPI";
        seventhBill.billDueDate = "25/12/2025";
        seventhBill.isTaxInclusive = true;
        seventhBill.isBillPaid = false;
        seventhBill.isBillOverDue = true;

        System.out.println("The Bill ID is: " + seventhBill.billId);
        System.out.println("The Plan Type is: " + seventhBill.planType);
        System.out.println("The Total Bill Amount is: " + seventhBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + seventhBill.billIssueDate);
        System.out.println("The Payment Method is: " + seventhBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + seventhBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + seventhBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + seventhBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + seventhBill.isBillOverDue);
        System.out.println();

        Bill eighthBill = new Bill();
        eighthBill.billId = 8;
        eighthBill.planType = "Monthly";
        eighthBill.billAmountTax = 980.80;
        eighthBill.billIssueDate = "28/11/2025";
        eighthBill.paymentMethod = "Card";
        eighthBill.billDueDate = "28/12/2025";
        eighthBill.isTaxInclusive = true;
        eighthBill.isBillPaid = true;
        eighthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + eighthBill.billId);
        System.out.println("The Plan Type is: " + eighthBill.planType);
        System.out.println("The Total Bill Amount is: " + eighthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + eighthBill.billIssueDate);
        System.out.println("The Payment Method is: " + eighthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + eighthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + eighthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + eighthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + eighthBill.isBillOverDue);
        System.out.println();

         Bill ninthBill = new Bill();
        ninthBill.billId = 9;
        ninthBill.planType = "Monthly";
        ninthBill.billAmountTax = 755.65;
        ninthBill.billIssueDate = "01/12/2025";
        ninthBill.paymentMethod = "Cash";
        ninthBill.billDueDate = "01/01/2026";
        ninthBill.isTaxInclusive = false;
        ninthBill.isBillPaid = true;
        ninthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + ninthBill.billId);
        System.out.println("The Plan Type is: " + ninthBill.planType);
        System.out.println("The Total Bill Amount is: " + ninthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + ninthBill.billIssueDate);
        System.out.println("The Payment Method is: " + ninthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + ninthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + ninthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + ninthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + ninthBill.isBillOverDue);
        System.out.println();

        Bill tenthBill = new Bill();
        tenthBill.billId = 10;
        tenthBill.planType = "Yearly";
        tenthBill.billAmountTax = 1599.90;
        tenthBill.billIssueDate = "02/12/2025";
        tenthBill.paymentMethod = "UPI";
        tenthBill.billDueDate = "02/01/2026";
        tenthBill.isTaxInclusive = true;
        tenthBill.isBillPaid = false;
        tenthBill.isBillOverDue = true;

        System.out.println("The Bill ID is: " + tenthBill.billId);
        System.out.println("The Plan Type is: " + tenthBill.planType);
        System.out.println("The Total Bill Amount is: " + tenthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + tenthBill.billIssueDate);
        System.out.println("The Payment Method is: " + tenthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + tenthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + tenthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + tenthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + tenthBill.isBillOverDue);
        System.out.println();

        Bill eleventhBill = new Bill();
        eleventhBill.billId = 11;
        eleventhBill.planType = "Monthly";
        eleventhBill.billAmountTax = 830.00;
        eleventhBill.billIssueDate = "03/12/2025";
        eleventhBill.paymentMethod = "Card";
        eleventhBill.billDueDate = "03/01/2026";
        eleventhBill.isTaxInclusive = true;
        eleventhBill.isBillPaid = true;
        eleventhBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + eleventhBill.billId);
        System.out.println("The Plan Type is: " + eleventhBill.planType);
        System.out.println("The Total Bill Amount is: " + eleventhBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + eleventhBill.billIssueDate);
        System.out.println("The Payment Method is: " + eleventhBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + eleventhBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + eleventhBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + eleventhBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + eleventhBill.isBillOverDue);
        System.out.println();

        Bill twelfthBill = new Bill();
        twelfthBill.billId = 12;
        twelfthBill.planType = "Monthly";
        twelfthBill.billAmountTax = 905.55;
        twelfthBill.billIssueDate = "04/12/2025";
        twelfthBill.paymentMethod = "Cash";
        twelfthBill.billDueDate = "04/01/2026";
        twelfthBill.isTaxInclusive = false;
        twelfthBill.isBillPaid = false;
        twelfthBill.isBillOverDue = true;

        System.out.println("The Bill ID is: " + twelfthBill.billId);
        System.out.println("The Plan Type is: " + twelfthBill.planType);
        System.out.println("The Total Bill Amount is: " + twelfthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + twelfthBill.billIssueDate);
        System.out.println("The Payment Method is: " + twelfthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + twelfthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + twelfthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + twelfthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + twelfthBill.isBillOverDue);
        System.out.println();

        Bill thirteenthBill = new Bill();
        thirteenthBill.billId = 13;
        thirteenthBill.planType = "Yearly";
        thirteenthBill.billAmountTax = 1225.10;
        thirteenthBill.billIssueDate = "05/12/2025";
        thirteenthBill.paymentMethod = "UPI";
        thirteenthBill.billDueDate = "05/01/2026";
        thirteenthBill.isTaxInclusive = true;
        thirteenthBill.isBillPaid = true;
        thirteenthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + thirteenthBill.billId);
        System.out.println("The Plan Type is: " + thirteenthBill.planType);
        System.out.println("The Total Bill Amount is: " + thirteenthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + thirteenthBill.billIssueDate);
        System.out.println("The Payment Method is: " + thirteenthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + thirteenthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + thirteenthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + thirteenthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + thirteenthBill.isBillOverDue);
        System.out.println();


        Bill fourteenthBill = new Bill();
        fourteenthBill.billId = 14;
        fourteenthBill.planType = "Monthly";
        fourteenthBill.billAmountTax = 999.99;
        fourteenthBill.billIssueDate = "06/12/2025";
        fourteenthBill.paymentMethod = "Card";
        fourteenthBill.billDueDate = "06/01/2026";
        fourteenthBill.isTaxInclusive = false;
        fourteenthBill.isBillPaid = false;
        fourteenthBill.isBillOverDue = true;

        System.out.println("The Bill ID is: " + fourteenthBill.billId);
        System.out.println("The Plan Type is: " + fourteenthBill.planType);
        System.out.println("The Total Bill Amount is: " + fourteenthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + fourteenthBill.billIssueDate);
        System.out.println("The Payment Method is: " + fourteenthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + fourteenthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + fourteenthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + fourteenthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + fourteenthBill.isBillOverDue);
        System.out.println();

        Bill fifteenthBill = new Bill();
        fifteenthBill.billId = 15;
        fifteenthBill.planType = "Yearly";
        fifteenthBill.billAmountTax = 1888.00;
        fifteenthBill.billIssueDate = "07/12/2025";
        fifteenthBill.paymentMethod = "UPI";
        fifteenthBill.billDueDate = "07/01/2026";
        fifteenthBill.isTaxInclusive = true;
        fifteenthBill.isBillPaid = true;
        fifteenthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + fifteenthBill.billId);
        System.out.println("The Plan Type is: " + fifteenthBill.planType);
        System.out.println("The Total Bill Amount is: " + fifteenthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + fifteenthBill.billIssueDate);
        System.out.println("The Payment Method is: " + fifteenthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + fifteenthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + fifteenthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + fifteenthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + fifteenthBill.isBillOverDue);
        System.out.println();

        Bill sixteenthBill = new Bill();
        sixteenthBill.billId = 16;
        sixteenthBill.planType = "Monthly";
        sixteenthBill.billAmountTax = 865.75;
        sixteenthBill.billIssueDate = "08/12/2025";
        sixteenthBill.paymentMethod = "Cash";
        sixteenthBill.billDueDate = "08/01/2026";
        sixteenthBill.isTaxInclusive = false;
        sixteenthBill.isBillPaid = true;
        sixteenthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + sixteenthBill.billId);
        System.out.println("The Plan Type is: " + sixteenthBill.planType);
        System.out.println("The Total Bill Amount is: " + sixteenthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + sixteenthBill.billIssueDate);
        System.out.println("The Payment Method is: " + sixteenthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + sixteenthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + sixteenthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + sixteenthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + sixteenthBill.isBillOverDue);
        System.out.println();

        Bill seventeenthBill = new Bill();
        seventeenthBill.billId = 17;
        seventeenthBill.planType = "Yearly";
        seventeenthBill.billAmountTax = 1450.40;
        seventeenthBill.billIssueDate = "09/12/2025";
        seventeenthBill.paymentMethod = "Card";
        seventeenthBill.billDueDate = "09/01/2026";
        seventeenthBill.isTaxInclusive = true;
        seventeenthBill.isBillPaid = false;
        seventeenthBill.isBillOverDue = true;

        System.out.println("The Bill ID is: " + seventeenthBill.billId);
        System.out.println("The Plan Type is: " + seventeenthBill.planType);
        System.out.println("The Total Bill Amount is: " + seventeenthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + seventeenthBill.billIssueDate);
        System.out.println("The Payment Method is: " + seventeenthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + seventeenthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + seventeenthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + seventeenthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + seventeenthBill.isBillOverDue);
        System.out.println();

        Bill eighteenthBill = new Bill();
        eighteenthBill.billId = 18;
        eighteenthBill.planType = "Monthly";
        eighteenthBill.billAmountTax = 720.20;
        eighteenthBill.billIssueDate = "10/12/2025";
        eighteenthBill.paymentMethod = "UPI";
        eighteenthBill.billDueDate = "10/01/2026";
        eighteenthBill.isTaxInclusive = false;
        eighteenthBill.isBillPaid = true;
        eighteenthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + eighteenthBill.billId);
        System.out.println("The Plan Type is: " + eighteenthBill.planType);
        System.out.println("The Total Bill Amount is: " + eighteenthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + eighteenthBill.billIssueDate);
        System.out.println("The Payment Method is: " + eighteenthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + eighteenthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + eighteenthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + eighteenthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + eighteenthBill.isBillOverDue);
        System.out.println();

        Bill nineteenthBill = new Bill();
        nineteenthBill.billId = 19;
        nineteenthBill.planType = "Yearly";
        nineteenthBill.billAmountTax = 2100.00;
        nineteenthBill.billIssueDate = "11/12/2025";
        nineteenthBill.paymentMethod = "Cash";
        nineteenthBill.billDueDate = "11/01/2026";
        nineteenthBill.isTaxInclusive = true;
        nineteenthBill.isBillPaid = true;
        nineteenthBill.isBillOverDue = false;

        System.out.println("The Bill ID is: " + nineteenthBill.billId);
        System.out.println("The Plan Type is: " + nineteenthBill.planType);
        System.out.println("The Total Bill Amount is: " + nineteenthBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + nineteenthBill.billIssueDate);
        System.out.println("The Payment Method is: " + nineteenthBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + nineteenthBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + nineteenthBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + nineteenthBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + nineteenthBill.isBillOverDue);
        System.out.println();

        Bill twentiethBill = new Bill();
        twentiethBill.billId = 20;
        twentiethBill.planType = "Monthly";
        twentiethBill.billAmountTax = 888.88;
        twentiethBill.billIssueDate = "12/12/2025";
        twentiethBill.paymentMethod = "UPI";
        twentiethBill.billDueDate = "12/01/2026";
        twentiethBill.isTaxInclusive = false;
        twentiethBill.isBillPaid = false;
        twentiethBill.isBillOverDue = true;

        System.out.println("The Bill ID is: " + twentiethBill.billId);
        System.out.println("The Plan Type is: " + twentiethBill.planType);
        System.out.println("The Total Bill Amount is: " + twentiethBill.billAmountTax);
        System.out.println("The Issue Date of Bill is: " + twentiethBill.billIssueDate);
        System.out.println("The Payment Method is: " + twentiethBill.paymentMethod);
        System.out.println("The Due Date of Bill is: " + twentiethBill.billDueDate);
        System.out.println("Does the Bill Include Tax  :  " + twentiethBill.isTaxInclusive);
        System.out.println("Is the Bill Paid  :  " + twentiethBill.isBillPaid);
        System.out.println("Is the Bill OverDue : " + twentiethBill.isBillOverDue);
        System.out.println();





	}


}