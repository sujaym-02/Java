class UberEats {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Apple Juice") {
            price = 60;
        } else if (foodItem == "Orange Juice") {
            price = 55;
        } else if (foodItem == "Grape Juice") {
            price = 65;
        } else if (foodItem == "Pineapple Juice") {
            price = 60;
        } else if (foodItem == "Watermelon Juice") {
            price = 50;
        } else if (foodItem == "Mango Juice") {
            price = 70;
        } else if (foodItem == "Pomegranate Juice") {
            price = 80;
        } else if (foodItem == "Litchi Juice") {
            price = 75;
        } else if (foodItem == "Guava Juice") {
            price = 65;
        } else if (foodItem == "Papaya Juice") {
            price = 60;
        } else if (foodItem == "Kiwi Juice") {
            price = 85;
        } else if (foodItem == "Banana Smoothie") {
            price = 70;
        } else if (foodItem == "Strawberry Juice") {
            price = 90;
        } else if (foodItem == "Chikoo Juice") {
            price = 65;
        } else if (foodItem == "Muskmelon Juice") {
            price = 60;
        } else if (foodItem == "Coconut Water") {
            price = 40;
        } else if (foodItem == "Mixed Fruit Juice") {
            price = 80;
        } else if (foodItem == "Beetroot Juice") {
            price = 50;
        } else if (foodItem == "Carrot Juice") {
            price = 50;
        } else if (foodItem == "Tomato Juice") {
            price = 45;
        } else if (foodItem == "Amla Juice") {
            price = 55;
        } else if (foodItem == "Mint Lemon Juice") {
            price = 60;
        } else if (foodItem == "Lemonade") {
            price = 40;
        } else if (foodItem == "Ginger Ale") {
            price = 55;
        } else if (foodItem == "Blueberry Juice") {
            price = 95;
        } else if (foodItem == "Blackcurrant Juice") {
            price = 90;
        } else if (foodItem == "Cranberry Juice") {
            price = 85;
        } else if (foodItem == "Pear Juice") {
            price = 75;
        } else if (foodItem == "Plum Juice") {
            price = 70;
        } else if (foodItem == "Apricot Juice") {
            price = 80;
        } 
	else {
            System.out.println("Invalid Food Item in UberEats");
            System.out.println(foodItem + " is Invalid");
        }

        return price;
    }
}
