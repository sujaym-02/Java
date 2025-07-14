class MarketRunner {

    public static void main(String markets[]) {

        System.out.println("MAIN STARTED\n");

        String name = Market.getName();
        System.out.println("Market Name: " +name+"\n");

        String location = Market.getLocation();
        System.out.println("Location: " +location+"\n");

        int numberOfShops = Market.getNumberOfShops();
        System.out.println("Number of Shops: " +numberOfShops+"\n");

        boolean isOpen = Market.getIsOpen();
        System.out.println("Is Market Open?: " +isOpen+"\n");

        boolean hasParking = Market.getHasParking();
        System.out.println("Parking Available?: " +hasParking+"\n");

        String specialtyItem = Market.getSpecialtyItem();
        System.out.println("Specialty Item: " +specialtyItem+"\n");

        System.out.println("MAIN ENDED");
    }
}
