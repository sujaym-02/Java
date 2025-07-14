class InstagramAccountRunner {

    public static void main(String args[]) {

        boolean registered = InstagramAccount.registerUser(
            "photo_guru", "guru@insta.com", "9988776655", "Guru@321", "Guru@321");

        if (registered) {
            System.out.println("Instagram account created successfully!\n");
            InstagramAccount.getUserInfo();
        } else {
            System.out.println("Instagram account creation failed.");
        }
    }
}
