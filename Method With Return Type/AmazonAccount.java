class AmazonAccount {

    static String fullName;
    static String email;
    static String phone;
    static String password;
    static String confirmPassword;

    public static boolean registerUser(String name, String mail, String mobile, String pwd, String cPwd) {
        boolean valid = true;

        if (name == null || name.isEmpty()) {
            System.out.println("Invalid Name");
            valid = false;
        } else fullName = name;

        if (mail == null || !mail.contains("@")) {
            System.out.println("Invalid Email");
            valid = false;
        } else email = mail;

        if (mobile == null || mobile.length() != 10) {
            System.out.println("Invalid Phone Number");
            valid = false;
        } else phone = mobile;

        if (pwd == null || pwd.length() < 6) {
            System.out.println("Invalid Password");
            valid = false;
        } else password = pwd;

        if (!pwd.equals(cPwd)) {
            System.out.println("Passwords do not match");
            valid = false;
        } else confirmPassword = cPwd;

        return valid;
    }

    public static void getUserInfo() {
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Password: " + password);
    }
}
