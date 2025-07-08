class Fan {
    static boolean isConnected;
    static int increaseSpeed = 4;
    static int currentSpeed =2 ;
    static int decreaseSpeed = 0;

    public static void onOrOff() {
        System.out.println("ON / OFF STARTED");

        if (isConnected==false) {
            isConnected = true;
            System.out.println("The Fan is Turned ON\n");
        } else {
            isConnected = false;
            System.out.println("The Fan is Turned OFF\n");
        }
    }

    public static void increaseSpeed() {
        System.out.println("INCREASING THE SPEED STARTED");

        if (isConnected==true) {
            if (currentSpeed < increaseSpeed) {
                currentSpeed=currentSpeed+1;
                System.out.println("The Current Speed of Fan  is: " + currentSpeed);
            } else {
                System.out.println("Maximum Speed is Reached\n");
            }
        } else {
            System.out.println("Please turn on the fan\n");
        }
    }

    public static void decreaseSpeed() {
        System.out.println("DECREASING THE SPEED STARTED");

        if (isConnected==true) {
            if (currentSpeed > decreaseSpeed) {
               currentSpeed=currentSpeed-1;
                System.out.println("The Current Speed of Fan is: " + currentSpeed);
            } else {
                System.out.println("Min Speed is Reached\n");
            }
        } else {
            System.out.println("Please turn on the Fan\n");
        }
    }
}