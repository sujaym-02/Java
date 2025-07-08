class Projector {
    static boolean isConnected;
    static int increaseVolume = 10;
    static int currentVolume = 8 ;
    static int decreaseVolume = 0;

    public static void onOrOff() {
        System.out.println("ON / OFF STARTED");

        if (isConnected==false) {
            isConnected = true;
            System.out.println("The Projector is  Turned On\n");
        } else {
            isConnected = false;
            System.out.println("The Projector is  Turned Off\n");
        }
    }

    public static void increaseVolume() {
        System.out.println("INCREASE VOLUME STARTED");

        if (isConnected==true) {
            if (currentVolume < increaseVolume) {
                currentVolume=currentVolume+1;
                System.out.println("The Current Volume is: " + currentVolume);
            } else {
                System.out.println("Maximum Volume of Projector is  Reached\n");
            }
        } else {
            System.out.println("Please turn On the Projector\n");
        }
    }

    public static void decreaseVolume() {
        System.out.println("\nDECREASE VOLUME STARTED");

        if (isConnected==true) {
            if (currentVolume > decreaseVolume) {
               currentVolume=currentVolume-1;
                System.out.println("The Current Volume is: " + currentVolume);
            } else {
                System.out.println("Minimum Volume of the Projector is  Reached\n");
            }
        } else {
            System.out.println("Please turn on the Projector\n");
        }
    }
}