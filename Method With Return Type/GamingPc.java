class GamingPc {

    static String processor;
    static String gpu;
    static int ramSize;
    static int storageSize;
    static boolean hasRGB;
    static double price;

    public static String getProcessor() {
        processor = "Intel i9 13th Gen";
        return processor;
    }

    public static String getGpu() {
        gpu = "NVIDIA RTX 4090";
        return gpu;
    }

    public static int getRamSize() {
        ramSize = 32;
        return ramSize;
    }

    public static int getStorageSize() {
        storageSize = 2;
        return storageSize;
    }

    public static boolean getHasRGB() {
        hasRGB = true;
        return hasRGB;
    }

    public static double getPrice() {
        price = 285000.00;
        return price;
    }
}
