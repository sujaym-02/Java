class Cooler {
    static boolean isConnected;
    static int maxSpeed = 4;
    static int currentSpeed ;
    static int minSpeed = 0;

    public static void onOrOff() {
        System.out.println("ON / OFF STARTED");

        if (isConnected==false) {
            isConnected = true;
            System.out.println("The Cooler is Turned ON\n");
        } else {
            isConnected = false;
            System.out.println("The Cooler is Turned OFF\n");
        }
    }

    public static void increaseSpeed() {
        System.out.println("INCREASING THE SPEED of Cooler is STARTED");

        if (isConnected==true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed=currentSpeed+1;
                System.out.println("The Current Speed of Cooler  is: " + currentSpeed);
            } else {
                System.out.println("Maximum Speed of Cooler is Reached\n");
            }
        } else {
            System.out.println("Please turn on the Cooler\n");
        }
    }

    public static void decreaseSpeed() {
        System.out.println("DECREASING THE SPEED STARTED");

        if (isConnected==true) {
            if (currentSpeed > minSpeed) {
               currentSpeed=currentSpeed-1;
                System.out.println("The Current Speed of Cooler is: " + currentSpeed);
            } else {
                System.out.println("Minimum Speed of Cooler is Reached\n");
            }
        } else {
            System.out.println("Please turn on the Cooler\n");
        }
    }
}