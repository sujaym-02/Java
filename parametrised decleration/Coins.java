class Coins {

    Coins() {
        System.out.println("Coins Default Constructor is invoked");
    }


    Coins(int coinId, String year, String metal, double value, String country, boolean isRare) {
        System.out.println("Coins Parameterized Constructor is invoked");
        this.coinId = coinId;
        this.year = year;
        this.metal = metal;
        this.value = value;
        this.country = country;
        this.isRare = isRare;
    }

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
