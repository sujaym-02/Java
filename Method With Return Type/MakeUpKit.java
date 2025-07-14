class MakeUpKit {

    static String brand;
    static int itemCount;
    static boolean hasMirror;
    static boolean isTravelFriendly;
    static String kitType;
    static double price;

    public static String getBrand() {
        brand = "Lakme";
        return brand;
    }

    public static int getItemCount() {
        itemCount = 12;
        return itemCount;
    }

    public static boolean getHasMirror() {
        hasMirror = true;
        return hasMirror;
    }

    public static boolean getIsTravelFriendly() {
        isTravelFriendly = true;
        return isTravelFriendly;
    }

    public static String getKitType() {
        kitType = "Professional";
        return kitType;
    }

    public static double getPrice() {
        price = 2499.99;
        return price;
    }
}
