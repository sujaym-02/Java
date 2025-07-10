class Consumer {
    public static void buy(String product, int quantity) {
        System.out.println("Consumer is buying " + quantity + " " + product);
        Retailer.sell(product, quantity);
    }
}
