class FacebookRunner {
    public static void main(String[] fb) {
        boolean user = Facebook.registrationUser("juve", "jash", "19-05-2003", "Male", 8088403508L,"pass123", "pass123");
        System.out.println("The user is registered: " + user);
        Facebook.getDetails();
    }
}