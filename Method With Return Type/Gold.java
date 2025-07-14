class Gold {

    static String purity;
    static double weight;
    static String type;
    static boolean isHallmarked;
    static double pricePerGram;
    static String origin;

    public static String getPurity() {
        purity = "22K";
        return purity;
    }

    public static double getWeight() {
        weight = 10.5;
        return weight;
    }

    public static String getType() {
        type = "Necklace";
        return type;
    }

    public static boolean getIsHallmarked() {
        isHallmarked = true;
        return isHallmarked;
    }

    public static double getPricePerGram() {
        pricePerGram = 5890.75;
        return pricePerGram;
    }

    public static String getOrigin() {
        origin = "Kalyan Jewellers";
        return origin;
    }
}
