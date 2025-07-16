class Dunzo {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Sushi") {
            price = 300;
	    return price;
        } else if (foodItem == "Ramen") {
            price = 250;
	    return price;
        } else if (foodItem == "Tempura") {
            price = 220;
	    return price;
        } else if (foodItem == "Udon Noodles") {
            price = 200;
	    return price;
        } else if (foodItem == "Sashimi") {
            price = 280;
	    return price;
        } else if (foodItem == "Takoyaki") {
            price = 180;
	    return price;
        } else if (foodItem == "Miso Soup") {
            price = 120;
	    return price;
        } else if (foodItem == "Okonomiyaki") {
            price = 230;
	    return price;
        } else if (foodItem == "Yakitori") {
            price = 190;
	    return price;
        } else if (foodItem == "Onigiri") {
            price = 100;
	    return price;
        } else if (foodItem == "Tonkatsu") {
            price = 240;
	    return price;
        } else if (foodItem == "Gyoza") {
            price = 160;
	    return price;
        } else if (foodItem == "Karaage") {
            price = 210;
	    return price;
        } else if (foodItem == "Chawanmushi") {
            price = 130;
	    return price;
        } else if (foodItem == "Shabu-Shabu") {
            price = 300;
	    return price;
        } else if (foodItem == "Natto") {
            price = 90;
	    return price;
        } else if (foodItem == "Donburi") {
            price = 200;
	    return price;
        } else if (foodItem == "Matcha Ice Cream") {
            price = 150;
	    return price;
        } else if (foodItem == "Mochi") {
            price = 80;
	    return price;
        } else if (foodItem == "Soba Noodles") {
            price = 180;
	    return price;
        } else if (foodItem == "Tamagoyaki") {
            price = 140;
	    return price;
        } else if (foodItem == "Yakisoba") {
            price = 190;
	    return price;
        } else if (foodItem == "Oden") {
            price = 170;
	    return price;
        } else if (foodItem == "Nikujaga") {
            price = 160;
	    return price;
        } else if (foodItem == "Zosui") {
            price = 150;
	    return price;
        } else if (foodItem == "Kaiseki") {
            price = 450;
	    return price;
        } else if (foodItem == "Taiyaki") {
            price = 100;
	    return price;
        } else if (foodItem == "Anmitsu") {
            price = 110;
	    return price;
        } else if (foodItem == "Unagi Don") {
            price = 320;
	    return price;
        } else if (foodItem == "Hiyayakko") {
            price = 90;
	    return price;
        } else {
            System.out.println("Invalid Food Item in Dunzo");
	    System.out.println(foodItem +"is inavlid");
        }

        return price;
    }
    public static int getPrice(String foodItem,int quantity) {
        int price = 0;

        if (foodItem == "Sushi") {
            price = 300*quantity;
	    return price;
        } else if (foodItem == "Ramen") {
            price = 250*quantity;
	    return price;
        } else if (foodItem == "Tempura") {
            price = 220*quantity;
	    return price;
        } else if (foodItem == "Udon Noodles") {
            price = 200*quantity;
	    return price;
        } else if (foodItem == "Sashimi") {
            price = 280*quantity;
	    return price;
        } else if (foodItem == "Takoyaki") {
            price = 180*quantity;
	    return price;
        } else if (foodItem == "Miso Soup") {
            price = 120*quantity;
	    return price;
        } else if (foodItem == "Okonomiyaki") {
            price = 230*quantity;
	    return price;
        } else if (foodItem == "Yakitori") {
            price = 190*quantity;
	    return price;
        } else if (foodItem == "Onigiri") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Tonkatsu") {
            price = 240*quantity;
	    return price;
        } else if (foodItem == "Gyoza") {
            price = 160*quantity;
	    return price;
        } else if (foodItem == "Karaage") {
            price = 210*quantity;
	    return price;
        } else if (foodItem == "Chawanmushi") {
            price = 130*quantity;
	    return price;
        } else if (foodItem == "Shabu-Shabu") {
            price = 300*quantity;
	    return price;
        } else if (foodItem == "Natto") {
            price = 90*quantity;
	    return price;
        } else if (foodItem == "Donburi") {
            price = 200*quantity;
	    return price;
        } else if (foodItem == "Matcha Ice Cream") {
            price = 150*quantity;
	    return price;
        } else if (foodItem == "Mochi") {
            price = 80*quantity;
	    return price;
        } else if (foodItem == "Soba Noodles") {
            price = 180*quantity;
	    return price;
        } else if (foodItem == "Tamagoyaki") {
            price = 140*quantity;
	    return price;
        } else if (foodItem == "Yakisoba") {
            price = 190*quantity;
	    return price;
        } else if (foodItem == "Oden") {
            price = 170*quantity;
	    return price;
        } else if (foodItem == "Nikujaga") {
            price = 160*quantity;
	    return price;
        } else if (foodItem == "Zosui") {
            price = 150*quantity;
	    return price;
        } else if (foodItem == "Kaiseki") {
            price = 450*quantity;
	    return price;
        } else if (foodItem == "Taiyaki") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Anmitsu") {
            price = 110*quantity;
	    return price;
        } else if (foodItem == "Unagi Don") {
            price = 320*quantity;
	    return price;
        } else if (foodItem == "Hiyayakko") {
            price = 90*quantity;
	    return price;
        } else {
            System.out.println("Invalid Food Item in Dunzo");
	    System.out.println(foodItem +"is inavlid");
        }

        return price;
    }

}
