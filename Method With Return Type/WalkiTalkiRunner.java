class WalkiTalkiRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String brand = WalkiTalki.getBrand();
        System.out.println("Brand: " + brand + "\n");

        int range = WalkiTalki.getRange();
        System.out.println("Range: " + range + " km\n");

        int batteryLife = WalkiTalki.getBatteryLife();
        System.out.println("Battery Life: " + batteryLife + " hours\n");

        boolean isRechargeable = WalkiTalki.getIsRechargeable();
        System.out.println("Rechargeable: " + isRechargeable + "\n");

        int channels = WalkiTalki.getNumberOfChannels();
        System.out.println("Number of Channels: " + channels + "\n");

        boolean isWaterResistant = WalkiTalki.getIsWaterResistant();
        System.out.println("Water Resistant: " + isWaterResistant + "\n");

        System.out.println("MAIN ENDED");
    }
}
