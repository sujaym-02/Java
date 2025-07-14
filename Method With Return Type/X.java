class X {
    static String surname;
    static String firstName;
    static String dateOfBirth;
    static String email;
    static long mobileNumber;

    public static boolean registrationUser(String lName,String fName,String dob,String eMail,long phone) {
        boolean isRegistrationUser = false;
        boolean isValidSurname = false;
        boolean isValidFirstName = false;
        boolean isValidDOB = false;
        boolean isValidEmail = false;
        boolean isValidMobile = false;

        if (lName != null) {
            surname = lName;
            isValidSurname = true;
        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;

        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
        if (dob != null) {
            dateOfBirth = dob;
            isValidDOB = true;
        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
        if (phone != 0) {
            mobileNumber = phone;
            isValidMobile = true;
        }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");

        if (isValidSurname && isValidFirstName && isValidDOB && isValidEmail && isValidMobile ) {

            isRegistrationUser = true;
        }

        return isRegistrationUser;
    }

    public static void getDetails() {
        System.out.println("First Name  "   + firstName);
        System.out.println("Last Name  "  + surname);
        System.out.println("Date of Birth  "+ dateOfBirth);
        System.out.println("Email "        + email);
        System.out.println("Mobile Number "+ mobileNumber);
    }
}