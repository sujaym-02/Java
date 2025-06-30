class Desktop {

    static String brand ;
    static String model;
    static String processor ;
    static int ramGB ;
    static int storageGB;
    static String storageType ;
    static String gpu ;
    static String os ;
    static String color ;
    static boolean hasWifi ;
    static boolean hasBluetooth ;
    static String ports;
    static String keyboardType ;
    static String mouseType ;
    static boolean includesMonitor ;
    static double weightKg;
    static String powerSupply ;
    static boolean hasDVDDrive ;
    static double price ;
    static int warrantyYears ;



	public static void main (String police[]){

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB " + storageType);
        System.out.println("GPU: " + gpu);
        System.out.println("Operating System: " + os);
        System.out.println("Color: " + color);
        System.out.println("WiFi: " + hasWifi);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("Ports: " + ports);
        System.out.println("Keyboard Type: " + keyboardType);
        System.out.println("Mouse Type: " + mouseType);
        System.out.println("Includes Monitor: " + includesMonitor);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Power Supply: " + powerSupply);
        System.out.println("DVD Drive: " + hasDVDDrive);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warrantyYears + " years");


    brand = "Dell";
    model = "OptiPlex 7000";
    processor = "Intel Core i7";
    ramGB = 16;
    storageGB = 512;
    storageType = "SSD";
    gpu = "Intel UHD Graphics";
    os = "Windows 11";
    color = "Black";
    hasWifi = true;
    hasBluetooth = true;
    ports = "USB, HDMI, Ethernet";
    keyboardType = "Mechanical";
    mouseType = "Optical";
    includesMonitor = true;
    weightKg = 8.5;
    powerSupply = "500W";
    hasDVDDrive = false;
    price = 65000.0;
    warrantyYears = 3;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Storage: " + storageGB + " GB " + storageType);
        System.out.println("GPU: " + gpu);
        System.out.println("Operating System: " + os);
        System.out.println("Color: " + color);
        System.out.println("WiFi: " + hasWifi);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("Ports: " + ports);
        System.out.println("Keyboard Type: " + keyboardType);
        System.out.println("Mouse Type: " + mouseType);
        System.out.println("Includes Monitor: " + includesMonitor);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Power Supply: " + powerSupply);
        System.out.println("DVD Drive: " + hasDVDDrive);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}
