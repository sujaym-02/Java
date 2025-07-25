class Coins {
    int coinId;
    String year;
    String metal;
    double value;
    String country;
    boolean isRare;

    void getInformation() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Year: " + year);
        System.out.println("Metal: " + metal);
        System.out.println("Value: $" + value);
        System.out.println("Country: " + country);
        System.out.println("Is Rare: " + isRare);
        System.out.println();
    }
}
