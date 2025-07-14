class Market {

    static String name;
    static String location;
    static int numberOfShops;
    static boolean isOpen;
    static boolean hasParking;
    static String specialtyItem;

    public static String getName() {
        name = "Central Market";
        return name;
    }

    public static String getLocation() {
        location = "MG Road";
        return location;
    }

    public static int getNumberOfShops() {
        numberOfShops = 120;
        return numberOfShops;
    }

    public static boolean getIsOpen() {
        isOpen = true;
        return isOpen;
    }

    public static boolean getHasParking() {
        hasParking = false;
        return hasParking;
    }

    public static String getSpecialtyItem() {
        specialtyItem = "Organic Fruits";
        return specialtyItem;
    }
}
