class Dunzo {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Sushi") {
            price = 300;
        } else if (foodItem == "Ramen") {
            price = 250;
        } else if (foodItem == "Tempura") {
            price = 220;
        } else if (foodItem == "Udon Noodles") {
            price = 200;
        } else if (foodItem == "Sashimi") {
            price = 280;
        } else if (foodItem == "Takoyaki") {
            price = 180;
        } else if (foodItem == "Miso Soup") {
            price = 120;
        } else if (foodItem == "Okonomiyaki") {
            price = 230;
        } else if (foodItem == "Yakitori") {
            price = 190;
        } else if (foodItem == "Onigiri") {
            price = 100;
        } else if (foodItem == "Tonkatsu") {
            price = 240;
        } else if (foodItem == "Gyoza") {
            price = 160;
        } else if (foodItem == "Karaage") {
            price = 210;
        } else if (foodItem == "Chawanmushi") {
            price = 130;
        } else if (foodItem == "Shabu-Shabu") {
            price = 300;
        } else if (foodItem == "Natto") {
            price = 90;
        } else if (foodItem == "Donburi") {
            price = 200;
        } else if (foodItem == "Matcha Ice Cream") {
            price = 150;
        } else if (foodItem == "Mochi") {
            price = 80;
        } else if (foodItem == "Soba Noodles") {
            price = 180;
        } else if (foodItem == "Tamagoyaki") {
            price = 140;
        } else if (foodItem == "Yakisoba") {
            price = 190;
        } else if (foodItem == "Oden") {
            price = 170;
        } else if (foodItem == "Nikujaga") {
            price = 160;
        } else if (foodItem == "Zosui") {
            price = 150;
        } else if (foodItem == "Kaiseki") {
            price = 450;
        } else if (foodItem == "Taiyaki") {
            price = 100;
        } else if (foodItem == "Anmitsu") {
            price = 110;
        } else if (foodItem == "Unagi Don") {
            price = 320;
        } else if (foodItem == "Hiyayakko") {
            price = 90;
        } 
	else {
            System.out.println("Invalid Food Item in Dunzo");
	    System.out.println(foodItem +"is inavlid");
        }

        return price;
    }
}
