class Inventory {
    public static void update(String model) {
        System.out.println("Inventory updated for issued laptop: " + model);
        Vendor.supply(model);
    }
}
