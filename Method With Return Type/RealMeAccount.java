class RealMeAccount {
    static String firstName;
    static String lastName;
    static String email;
    static String password;
    static String confirmPassword;


    public static boolean registrationUser(String eMail,String pass,String confirmPass,String fName,String lName) {
        boolean isRegistered = false;
        boolean isValidEmail = false;
        boolean isValidPassword = false;
        boolean isValidConfirm = false;
        boolean isValidFirstName = false;
        boolean isValidLastName = false;

        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        }else System.out.println(" GIVE PROPER DETAILS");
        if (pass != null) {
            password = pass;
            isValidPassword = true;
        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
        if (confirmPass != null && confirmPass.equals(pass)) {
            confirmPassword = confirmPass;
            isValidConfirm = true;
        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
        if (lName != null) {
            lastName = lName;
            isValidLastName = true;
        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");

        if (isValidEmail && isValidPassword && isValidConfirm && isValidFirstName && isValidLastName ) {

            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getDetails() {
        System.out.println("Email Address: " + email);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
