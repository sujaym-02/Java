class GamingPcRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String processor = GamingPc.getProcessor();
        System.out.println("Processor: " +processor+"\n");

        String gpu = GamingPc.getGpu();
        System.out.println("GPU: " +gpu +"\n");

        int ramSize = GamingPc.getRamSize();
        System.out.println("RAM Size: " +ramSize +" GB\n");

        int storageSize = GamingPc.getStorageSize();
        System.out.println("Storage Size: " +storageSize+ " TB\n");

        boolean hasRGB = GamingPc.getHasRGB();
        System.out.println("RGB Lighting: "+ hasRGB+"\n");

        double price = GamingPc.getPrice();
        System.out.println("Price: "+ price+"rs\n");

        System.out.println("MAIN ENDED");
    }
}
