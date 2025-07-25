class Crackers {
    int crackerId;
    String type;
    String brand;
    double price;
    boolean isEcoFriendly;
    String madeIn;

    void getInformation() {
        System.out.println("Cracker ID: " + crackerId);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Eco-Friendly: " + isEcoFriendly);
        System.out.println("Made In: " + madeIn);
        System.out.println();
    }
}
