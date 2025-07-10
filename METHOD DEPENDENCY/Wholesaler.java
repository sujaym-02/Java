class Wholesaler {
    public static void supply(String product, int quantity) {
        System.out.println("Wholesaler is supplying " + quantity + " " + product);
        Distributor.distribute(product, quantity);
    }
}
