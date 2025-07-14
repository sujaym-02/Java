class Facebook {
    static String firstName;
    static String surname;
    static String dateOfBirth;
    static String gender;
    static long mobileNumber;
    static String email;
    static String password;

    public static boolean registrationUser(String fName, String lName, String dob, String gen, long phone, String eMail, String pass) {
    boolean isRegistrationUser = false;
    boolean isValidFirstName = false;
    boolean isValidSurname = false;
    boolean isValidDOB = false;
    boolean isValidGender = false;
    boolean isValidMobile = false;
    boolean isValidEmail = false;
    boolean isValidPassword = false;
    
    if (fName != null) {
        firstName = fName;
        isValidFirstName = true;
    }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
    if (lName != null) {
        surname = lName;
        isValidSurname = true;
    }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
    if (dob != null) {
        dateOfBirth = dob;
        isValidDOB = true;
    }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
    if (gen != null) {
        gender = gen;
        isValidGender = true;
    }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
    if (phone != 0) {
        mobileNumber = phone;
        isValidMobile = true;
    }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
    if (eMail != null) {
        email = eMail;
        isValidEmail = true;
    }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
    if (pass != null) {
        password = pass;
        isValidPassword = true;
    }else System.out.println("CAN'T ACCEPT GIVE PROPER DATA");
    
        if (isValidFirstName && isValidSurname && isValidDOB && isValidGender && isValidMobile && isValidEmail && isValidPassword) {
            isRegistrationUser = true;
        }

        return isRegistrationUser;
    }

    public static void getDetails() {
        System.out.println("First Name " + firstName);
        System.out.println("Surname " + surname);
        System.out.println("Date of Birth " + dateOfBirth);
        System.out.println("Gender " + gender);
        System.out.println("Mobile Number " + mobileNumber);
        System.out.println("Email " + email);
        System.out.println("Password " + password);
    }
}
