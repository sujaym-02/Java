class InstagramAccount {

    static String username;
    static String email;
    static String phoneNumber;
    static String password;
    static String confirmPassword;

    public static boolean registerUser(String uname, String mail, String phone, String pwd, String cPwd) {
        boolean isValid = true;

        if (uname == null || uname.isEmpty()) {
            System.out.println("Invalid Username");
            isValid = false;
        } else {
            username = uname;
        }

        if (mail == null || !mail.contains("@")) {
            System.out.println("Invalid Email");
            isValid = false;
        } else {
            email = mail;
        }

        if (phone == null || phone.length() != 10) {
            System.out.println("Invalid Phone Number");
            isValid = false;
        } else {
            phoneNumber = phone;
        }

        if (pwd == null || pwd.length() < 6) {
            System.out.println("Invalid Password");
            isValid = false;
        } else {
            password = pwd;
        }

        if (!pwd.equals(cPwd)) {
            System.out.println("Passwords Do Not Match");
            isValid = false;
        } else {
            confirmPassword = cPwd;
        }

        return isValid;
    }

    public static void getUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Password: " + password);
    }
}
