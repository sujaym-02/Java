class FlipkartAccount {

    static String fullName;
    static String email;
    static String mobileNumber;
    static String password;
    static String confirmPassword;

    public static boolean registerUser(String name, String mail, String mobile, String pwd, String cPwd) {
        boolean isValid = true;

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid Full Name");
            isValid = false;
        } else {
            fullName = name;
        }

        if (mail == null || !mail.contains("@")) {
            System.out.println("Invalid Email Address");
            isValid = false;
        } else {
            email = mail;
        }

        if (mobile == null || mobile.length() != 10) {
            System.out.println("Invalid Mobile Number");
            isValid = false;
        } else {
            mobileNumber = mobile;
        }

        if (pwd == null || pwd.length() < 6) {
            System.out.println("Invalid Password");
            isValid = false;
        } else {
            password = pwd;
        }

        if (!pwd.equals(cPwd)) {
            System.out.println("Passwords do not match");
            isValid = false;
        } else {
            confirmPassword = cPwd;
        }

        return isValid;
    }

    public static void getUserInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Password: " + password);
    }
}
