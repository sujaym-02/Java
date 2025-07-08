class AirConditioner {
    static boolean isConnected;
    static int increaseTemperature = 30;
    static int currentTemperature = 22;
    static int decreaseTemperature = 18;

    public static void onOrOff() {
        System.out.println("ON / OFF STARTED");

        if (isConnected==false) {
            isConnected = true;
            System.out.println("The AC is Turned ON\n");
        } else {
            isConnected = false;
            System.out.println("The AC is Turned OFF\n");
        }
    }

    public static void increaseTemperature() {
        System.out.println("INCREASING THE TEMPERATURE OF AC STARTED");

        if (isConnected==true) {
            if (currentTemperature < increaseTemperature) {
                currentTemperature=currentTemperature+1;
                System.out.println("The Current Temperature of AC  is: " + currentTemperature);
            } else {
                System.out.println("Maximum Temperature  of Ac is Reached\n");
            }
        } else {
            System.out.println("Please turn on the AC\n");
        }
    }

    public static void decreaseTemperature() {
        System.out.println("DECREASING THE TEMPERATURE OF AC STARTED");

        if (isConnected==true) {
            if (currentTemperature > decreaseTemperature) {
               currentTemperature=currentTemperature-1;
                System.out.println("The Current temperature of AC is: " + currentTemperature);
            } else {
                System.out.println("Minimum Temperature of Ac is Reached\n");
            }
        } else {
            System.out.println("Please turn on the AC\n");
        }
    }
}