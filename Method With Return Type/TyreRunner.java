class TyreRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String brand = Tyre.getBrand();
        System.out.println("Brand: "+brand+"\n");

        String type = Tyre.getType();
        System.out.println("Type: "+type+"\n");

        int size = Tyre.getSize();
        System.out.println("Size: "+size+" inches\n");

        boolean isTubeless = Tyre.getIsTubeless();
        System.out.println("Tubeless: "+isTubeless+"\n");

        double pressure = Tyre.getPressure();
        System.out.println("Recommended Pressure: "+pressure+" PSI\n");

        double price = Tyre.getPrice();
        System.out.println("Price: " +price+"rs\n");

        System.out.println("MAIN ENDED");
    }
}
