class FlipkartAccountRunner {

    public static void main(String args[]) {

        boolean registered = FlipkartAccount.registerUser(
            "Sneha Kumar", "sneha.kumar@gmail.com", "9876543211", "Sneha@456", "Sneha@456");

        if (registered) {
            System.out.println("Flipkart account created successfully!\n");
            FlipkartAccount.getUserInfo();
        } else {
            System.out.println("Flipkart account creation failed.");
        }
    }
}
