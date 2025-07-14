class Clothes {

    static String type;
    static String color;
    static String size;
    static String fabric;
    static boolean isWashed;
    static boolean isIroned;
    static double price;

    public static String getType() {
        type = "T-Shirt";
        return type;
    }

    public static String getColor() {
        color = "Black";
        return color;
    }

    public static String getSize() {
        size = "Medium";
        return size;
    }

    public static String getFabric() {
        fabric = "Cotton";
        return fabric;
    }

    public static boolean getIsWashed() {
        isWashed = true;
        return isWashed;
    }

    public static boolean getIsIroned() {
        isIroned = false;
        return isIroned;
    }

    public static double getPrice() {
        price = 799.0;
        return price;
    }
}
