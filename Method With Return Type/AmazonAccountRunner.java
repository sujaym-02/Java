class AmazonAccountRunner {

    public static void main(String args[]) {

        boolean isCreated = AmazonAccount.registerUser("Ravi", "ravi@gmail.com", "9876543210", "Ravi@123", "Ravi@123");

        if (isCreated) {
            System.out.println("Amazon account created successfully!\n");
            AmazonAccount.getUserInfo();
        } else {
            System.out.println("Amazon account creation failed.");
        }
    }
}
