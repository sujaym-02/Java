class Retailer {
    public static void sell(String product, int quantity) {
        System.out.println("Retailer is selling " + quantity + " " + product);
        Wholesaler.supply(product, quantity);
    }
}
