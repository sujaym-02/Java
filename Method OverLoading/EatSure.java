class EatSure {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Shawarma") {
            price = 150;
	    return price;
        } else if (foodItem == "Mandi") {
            price = 280;
	    return price;
        } else if (foodItem == "Kebsa") {
            price = 270;
	    return price;
        } else if (foodItem == "Hummus") {
            price = 100;
	    return price;
        } else if (foodItem == "Falafel") {
            price = 120;
	    return price;
        } else if (foodItem == "Tabbouleh") {
            price = 130;
	    return price;
        } else if (foodItem == "Fattoush") {
            price = 110;
	    return price;
        } else if (foodItem == "Mutabbal") {
            price = 90;
	    return price;
        } else if (foodItem == "Baba Ghanoush") {
            price = 95;
	    return price;
        } else if (foodItem == "Stuffed Grape Leaves") {
            price = 150;
	    return price;
        } else if (foodItem == "Lamb Kofta") {
            price = 220;
	    return price;
        } else if (foodItem == "Beef Kofta") {
            price = 210;
	    return price;
        } else if (foodItem == "Chicken Kofta") {
            price = 200;
	    return price;
        } else if (foodItem == "Grilled Hammour") {
            price = 300;
	    return price;
        } else if (foodItem == "Khubz ") {
            price = 30;
	    return price;
        } else if (foodItem == "Machboos") {
            price = 260;
	    return price;
        } else if (foodItem == "Majboos") {
            price = 250;
	    return price;
        } else if (foodItem == "Kibbeh") {
            price = 160;
	    return price;
        } else if (foodItem == "Samboosa") {
            price = 80;
	    return price;
        } else if (foodItem == "Arabic Mixed Grill") {
            price = 320;
	    return price;
        } else if (foodItem == "Laban Drink") {
            price = 60;
	    return price;
        } else if (foodItem == "Rose Milk") {
            price = 70;
	    return price;
        } else if (foodItem == "Kunafa") {
            price = 140;
	    return price;
        } else if (foodItem == "Baklava") {
            price = 130;
	    return price;
        } else if (foodItem == "Basbousa") {
            price = 100;
	    return price;
        } else if (foodItem == "Umm Ali") {
            price = 120;
	    return price;
        } else if (foodItem == "Date Cake") {
            price = 110;
	    return price;
        } else if (foodItem == "Qatayef") {
            price = 115;
	    return price;
        } else if (foodItem == "Halwa") {
            price = 90;
	    return price;
        } else if (foodItem == "Camel Meat Curry") {
            price = 350;
	    return price;
        }else {
            System.out.println("Invalid Food Item in EatSure");
	    System.out.println(foodItem+ "is Inavlid");
        }

        return price;
    }
    public static int getPrice(String foodItem,int quantity) {
        int price = 0;

        if (foodItem == "Shawarma") {
            price = 150*quantity;
	    return price;
        } else if (foodItem == "Mandi") {
            price = 280*quantity;
	    return price;
        } else if (foodItem == "Kebsa") {
            price = 270*quantity;
	    return price;
        } else if (foodItem == "Hummus") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Falafel") {
            price = 120*quantity;
	    return price;
        } else if (foodItem == "Tabbouleh") {
            price = 130*quantity;
	    return price;
        } else if (foodItem == "Fattoush") {
            price = 110*quantity;
	    return price;
        } else if (foodItem == "Mutabbal") {
            price = 90*quantity;
	    return price;
        } else if (foodItem == "Baba Ghanoush") {
            price = 95*quantity;
	    return price;
        } else if (foodItem == "Stuffed Grape Leaves") {
            price = 150*quantity;
	    return price;
        } else if (foodItem == "Lamb Kofta") {
            price = 220*quantity;
	    return price;
        } else if (foodItem == "Beef Kofta") {
            price = 210*quantity;
	    return price;
        } else if (foodItem == "Chicken Kofta") {
            price = 200*quantity;
	    return price;
        } else if (foodItem == "Grilled Hammour") {
            price = 300*quantity;
	    return price;
        } else if (foodItem == "Khubz ") {
            price = 30*quantity;
	    return price;
        } else if (foodItem == "Machboos") {
            price = 260*quantity;
	    return price;
        } else if (foodItem == "Majboos") {
            price = 250*quantity;
	    return price;
        } else if (foodItem == "Kibbeh") {
            price = 160*quantity;
	    return price;
        } else if (foodItem == "Samboosa") {
            price = 80*quantity;
	    return price;
        } else if (foodItem == "Arabic Mixed Grill") {
            price = 320*quantity;
	    return price;
        } else if (foodItem == "Laban Drink") {
            price = 60*quantity;
	    return price;
        } else if (foodItem == "Rose Milk") {
            price = 70*quantity;
	    return price;
        } else if (foodItem == "Kunafa") {
            price = 140*quantity;
	    return price;
        } else if (foodItem == "Baklava") {
            price = 130*quantity;
	    return price;
        } else if (foodItem == "Basbousa") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Umm Ali") {
            price = 120*quantity;
	    return price;
        } else if (foodItem == "Date Cake") {
            price = 110*quantity;
	    return price;
        } else if (foodItem == "Qatayef") {
            price = 115*quantity;
	    return price;
        } else if (foodItem == "Halwa") {
            price = 90*quantity;
	    return price;
        } else if (foodItem == "Camel Meat Curry") {
            price = 350*quantity;
	    return price;
        }else {
            System.out.println("Invalid Food Item in EatSure");
	    System.out.println(foodItem+ "is Inavlid");
        }

        return price;
    }

}
