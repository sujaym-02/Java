class Tyre {

    static String brand;
    static String type;
    static int size;
    static boolean isTubeless;
    static double pressure;
    static double price;

    public static String getBrand() {
        brand = "MRF";
        return brand;
    }

    public static String getType() {
        type = "Radial";
        return type;
    }

    public static int getSize() {
        size = 16;
        return size;
    }

    public static boolean getIsTubeless() {
        isTubeless = true;
        return isTubeless;
    }

    public static double getPressure() {
        pressure = 32.0; 
        return pressure;
    }

    public static double getPrice() {
        price = 4599.50;
        return price;
    }
}
