class WalkiTalki {

    static String brand;
    static int range;
    static int batteryLife;
    static boolean isRechargeable;
    static int numberOfChannels;
    static boolean isWaterResistant;

    public static String getBrand() {
        brand = "Motorola";
        return brand;
    }

    public static int getRange() {
        range = 5; // in kilometers
        return range;
    }

    public static int getBatteryLife() {
        batteryLife = 10; // in hours
        return batteryLife;
    }

    public static boolean getIsRechargeable() {
        isRechargeable = true;
        return isRechargeable;
    }

    public static int getNumberOfChannels() {
        numberOfChannels = 22;
        return numberOfChannels;
    }

    public static boolean getIsWaterResistant() {
        isWaterResistant = true;
        return isWaterResistant;
    }
}
