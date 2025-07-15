class EatSure {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Shawarma") {
            price = 150;
        } else if (foodItem == "Mandi") {
            price = 280;
        } else if (foodItem == "Kebsa") {
            price = 270;
        } else if (foodItem == "Hummus") {
            price = 100;
        } else if (foodItem == "Falafel") {
            price = 120;
        } else if (foodItem == "Tabbouleh") {
            price = 130;
        } else if (foodItem == "Fattoush") {
            price = 110;
        } else if (foodItem == "Mutabbal") {
            price = 90;
        } else if (foodItem == "Baba Ghanoush") {
            price = 95;
        } else if (foodItem == "Stuffed Grape Leaves") {
            price = 150;
        } else if (foodItem == "Lamb Kofta") {
            price = 220;
        } else if (foodItem == "Beef Kofta") {
            price = 210;
        } else if (foodItem == "Chicken Kofta") {
            price = 200;
        } else if (foodItem == "Grilled Hammour") {
            price = 300;
        } else if (foodItem == "Khubz (Arabic Bread)") {
            price = 30;
        } else if (foodItem == "Machboos") {
            price = 260;
        } else if (foodItem == "Majboos") {
            price = 250;
        } else if (foodItem == "Kibbeh") {
            price = 160;
        } else if (foodItem == "Samboosa") {
            price = 80;
        } else if (foodItem == "Arabic Mixed Grill") {
            price = 320;
        } else if (foodItem == "Laban Drink") {
            price = 60;
        } else if (foodItem == "Rose Milk") {
            price = 70;
        } else if (foodItem == "Kunafa") {
            price = 140;
        } else if (foodItem == "Baklava") {
            price = 130;
        } else if (foodItem == "Basbousa") {
            price = 100;
        } else if (foodItem == "Umm Ali") {
            price = 120;
        } else if (foodItem == "Date Cake") {
            price = 110;
        } else if (foodItem == "Qatayef") {
            price = 115;
        } else if (foodItem == "Halwa") {
            price = 90;
        } else if (foodItem == "Camel Meat Curry") {
            price = 350;
        } 
	else {
            System.out.println("Invalid Food Item in EatSure");
	    System.out.println(foodItem+ "is Inavlid");
        }

        return price;
    }
}
