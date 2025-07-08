class TeleVision {
    static boolean isConnected;
    static int increaseVolume = 30;
    static int currentVolume = 18 ;
    static int decreaseVolume = 0;

    public static void onOrOff() {
        System.out.println("ON / OFF STARTED");

        if (isConnected==false) {
            isConnected = true;
            System.out.println("The TV is  Turned On\n");
        } else {
            isConnected = false;
            System.out.println("The TV is  Turned Off\n");
        }
    }

    public static void increaseVolume() {
        System.out.println("INCREASING VOLUME STARTED");

        if (isConnected==true) {
            if (currentVolume < increaseVolume) {
                currentVolume=currentVolume+1;
                System.out.println("The Current Volume is: " + currentVolume);
            } else {
                System.out.println("Maximum Volume of TV is  Reached\n");
            }
        } else {
            System.out.println("Please turn On the TV\n");
        }
    }

    public static void decreaseVolume() {
        System.out.println("\nDECREASING VOLUME STARTED");

        if (isConnected==true) {
            if (currentVolume > decreaseVolume) {
               currentVolume=currentVolume-1;
                System.out.println("The Current Volume is: " + currentVolume);
            } else {
                System.out.println("Minimum Volume of the TV is  Reached\n");
            }
        } else {
            System.out.println("Please turn on the TV\n");
        }
    }
}