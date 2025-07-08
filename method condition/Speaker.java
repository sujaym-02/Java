class Speaker {
    static boolean isConnected;
    static int maxVolume = 10;
    static int currentVolume;
    static int minVolume = 0;

    public static void onOrOff() {
        System.out.println("ON / OFF STARTED");

        if (isConnected==false) {
            isConnected = true;
            System.out.println("Speaker Turned On\n");
        } else {
            isConnected = false;
            System.out.println("Speaker Turned Off\n");
        }
    }

    public static void increaseVolume() {
        System.out.println("INCREASE VOLUME STARTED");

        if (isConnected==true) {
            if (currentVolume < maxVolume) {
                currentVolume=currentVolume+1;
                System.out.println("The Current Volume is: " + currentVolume);
            } else {
                System.out.println("Max Volume Reached\n");
            }
        } else {
            System.out.println("Please turn on the speaker\n");
        }
    }

    public static void decreaseVolume() {
        System.out.println("DECREASE VOLUME STARTED");

        if (isConnected==true) {
            if (currentVolume > minVolume) {
               currentVolume=currentVolume-1;
                System.out.println("The Current Volume is: " + currentVolume);
            } else {
                System.out.println("Min Volume Reached\n");
            }
        } else {
            System.out.println("Please turn on the speaker\n");
        }
    }
}