class CoinsRunner {

    public static void main(String coin[]) {

        System.out.println("MAIN STARTED\n");

        Coins coin1 = new Coins(1, "1900", "Gold", 1000.0, "USA", true);
        coin1.getInformation();

        Coins coin2 = new Coins(2, "1898", "Silver", 850.0, "UK", true);
        coin2.getInformation();

        Coins coin3 = new Coins(3, "2000", "Copper", 20.0, "India", false);
        coin3.getInformation();

        Coins coin4 = new Coins(4, "1980", "Nickel", 15.0, "Canada", false);
        coin4.getInformation();

        Coins coin5 = new Coins(5, "1920", "Bronze", 100.0, "France", true);
        coin5.getInformation();

        Coins coin6 = new Coins(6, "1850", "Gold", 1200.0, "Germany", true);
        coin6.getInformation();

        Coins coin7 = new Coins(7, "2010", "Aluminum", 5.0, "Japan", false);
        coin7.getInformation();

        Coins coin8 = new Coins(8, "1750", "Silver", 2000.0, "Spain", true);
        coin8.getInformation();

        Coins coin9 = new Coins(9, "1990", "Steel", 10.0, "Russia", false);
        coin9.getInformation();

        Coins coin10 = new Coins(10, "1965", "Copper", 30.0, "Italy", true);
        coin10.getInformation();

        Coins coin11 = new Coins(11, "1960", "Mixed", 75.0, "Country11", false);
        coin11.getInformation();

        Coins coin12 = new Coins(12, "1961", "Mixed", 77.5, "Country12", true);
        coin12.getInformation();

        Coins coin13 = new Coins(13, "1962", "Mixed", 80.0, "Country13", false);
        coin13.getInformation();

        Coins coin14 = new Coins(14, "1963", "Mixed", 82.5, "Country14", true);
        coin14.getInformation();

        Coins coin15 = new Coins(15, "1964", "Mixed", 85.0, "Country15", false);
        coin15.getInformation();

        Coins coin16 = new Coins(16, "1965", "Mixed", 87.5, "Country16", true);
        coin16.getInformation();

        Coins coin17 = new Coins(17, "1966", "Mixed", 90.0, "Country17", false);
        coin17.getInformation();

        Coins coin18 = new Coins(18, "1967", "Mixed", 92.5, "Country18", true);
        coin18.getInformation();

        Coins coin19 = new Coins(19, "1968", "Mixed", 95.0, "Country19", false);
        coin19.getInformation();

        Coins coin20 = new Coins(20, "1969", "Mixed", 97.5, "Country20", true);
        coin20.getInformation();
    }
}
