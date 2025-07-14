class Park {

    static String name;
    static String location;
    static int numberOfTrees;
    static boolean hasPlayArea;
    static boolean isPetFriendly;
    static double entryFee;

    public static String getName() {
        name = "Cubbon Park";
        return name;
    }

    public static String getLocation() {
        location = "JP Nagar";
        return location;
    }

    public static int getNumberOfTrees() {
        numberOfTrees = 350;
        return numberOfTrees;
    }

    public static boolean getHasPlayArea() {
        hasPlayArea = true;
        return hasPlayArea;
    }

    public static boolean getIsPetFriendly() {
        isPetFriendly = true;
        return isPetFriendly;
    }

    public static double getEntryFee() {
        entryFee = 20.0;
        return entryFee;
    }
}
