class River {

    static String name;
    static String origin;
    static String endsAt;
    static double length;
    static boolean isPolluted;
    static boolean supportsBoating;

    public static String getName() {
        name = "Kaveri";
        return name;
    }

    public static String getOrigin() {
        origin = "Thala Kaveri";
        return origin;
    }

    public static String getEndsAt() {
        endsAt = "Bay of Bengal";
        return endsAt;
    }

    public static double getLength() {
        length = 800.0;
        return length;
    }

    public static boolean getIsPolluted() {
        isPolluted = true;
        return isPolluted;
    }

    public static boolean getSupportsBoating() {
        supportsBoating = true;
        return supportsBoating;
    }
}
