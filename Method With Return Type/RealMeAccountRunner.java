class RealMeAccountRunner {
    public static void main(String[] args) {
        boolean user = RealMeAccount.registrationUser("abcd@gmail.com","123459","123459","ram","m");
        System.out.println("The user is registered: " + user);
        RealMeAccount.getDetails();
    }
}