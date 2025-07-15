class Zomato {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Chicken Biryani") {
            price = 210;
        } else if (foodItem == "Mutton Biryani") {
            price = 270;
        } else if (foodItem == "Egg Curry") {
            price = 130;
        } else if (foodItem == "Chicken Lollipop") {
            price = 160;
        } else if (foodItem == "Hakka Noodles") {
            price = 120;
        } else if (foodItem == "Fried Rice") {
            price = 100;
        } else if (foodItem == "Chicken Manchurian") {
            price = 180;
        } else if (foodItem == "Spring Rolls") {
            price = 90;
        } else if (foodItem == "Mushroom Masala") {
            price = 140;
        } else if (foodItem == "Veg Kofta") {
            price = 130;
        } else if (foodItem == "Chicken Curry") {
            price = 190;
        } else if (foodItem == "Kadhai Paneer") {
            price = 160;
        } else if (foodItem == "Bhindi Fry") {
            price = 100;
        } else if (foodItem == "Malai Kofta") {
            price = 170;
        } else if (foodItem == "Roti") {
            price = 20;
        } else if (foodItem == "Butter Naan") {
            price = 30;
        } else if (foodItem == "Chicken Shawarma") {
            price = 150;
        } else if (foodItem == "Veg Burger") {
            price = 110;
        } else if (foodItem == "Cheese Sandwich") {
            price = 90;
        } else if (foodItem == "Chicken Wrap") {
            price = 140;
        } else if (foodItem == "Chocolate Cake") {
            price = 150;
        } else if (foodItem == "Brownie") {
            price = 100;
        } else if (foodItem == "Pani Puri") {
            price = 40;
        } else if (foodItem == "Dahi Puri") {
            price = 50;
        } else if (foodItem == "Pav Bhaji") {
            price = 90;
        } else if (foodItem == "Bombay Sandwich") {
            price = 80;
        } else if (foodItem == "Rasmalai") {
            price = 60;
        } else if (foodItem == "Lassi") {
            price = 70;
        } else if (foodItem == "Tea") {
            price = 20;
        } else if (foodItem == "Coffee") {
            price = 30;
        } 
	else {
            System.out.println("Cannot Find Food Details");
            System.out.println(foodItem + " is Invalid");
        }

        return price;
    }
}
