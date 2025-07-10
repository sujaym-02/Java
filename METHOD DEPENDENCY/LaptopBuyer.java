class LaptopBuyer {
    public static void buy(String model) {
        System.out.println("Buyer requested laptop: " + model);
        ITAdmin.checkAvailability(model);
    }
}
