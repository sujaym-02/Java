class Distributor {
    public static void distribute(String product, int quantity) {
        System.out.println("Distributor is transporting " + quantity + " " + product);
        Manufacturer.manufacture(product, quantity);
    }
}
