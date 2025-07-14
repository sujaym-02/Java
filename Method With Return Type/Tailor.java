class Tailor {

    static String name;
    static int yearsOfExperience;
    static String specialization;
    static String shopLocation;
    static boolean offersHomeService;
    static double stitchingCharge;

    public static String getName() {
    name = "Ramesh Tailors";
    return name;
    }

    public static int getYearsOfExperience() {
    yearsOfExperience = 15;
    return yearsOfExperience;
    }

    public static String getSpecialization() {
    specialization = "Suits";
    return specialization;
    }

    public static String getShopLocation() {
    shopLocation = "Silk Institute, Bengaluru";
    return shopLocation;
    }

    public static boolean getOffersHomeService() {
    offersHomeService = false;
    return offersHomeService;
    }

    public static double getStitchingCharge() {
    stitchingCharge = 699.50;
    return stitchingCharge;
    }
}
