class Zomato {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Butter Chicken") {
            price = 220;
	    return price;
        } else if (foodItem == "Shahi Paneer") {
            price = 180;
	    return price;
        } else if (foodItem == "Chole Bhature") {
            price = 140;
	    return price;
        } else if (foodItem == "Paneer Tikka") {
            price = 160;
	    return price;
        } else if (foodItem == "Dal Makhani") {
            price = 130;
	    return price;
        } else if (foodItem == "Rajma Chawal") {
            price = 120;
	    return price;
        } else if (foodItem == "Aloo Paratha") {
            price = 100;
	    return price;
        } else if (foodItem == "Baingan Bharta") {
            price = 110;
	    return price;
        } else if (foodItem == "Kadhi Pakora") {
            price = 130;
	    return price;
        } else if (foodItem == "Palak Paneer") {
            price = 140;
	    return price;
        } else if (foodItem == "Chicken Curry") {
            price = 200;
	    return price;
        } else if (foodItem == "Mutton Rogan Josh") {
            price = 280;
	    return price;
        } else if (foodItem == "Bhindi Masala") {
            price = 100;
	    return price;
        } else if (foodItem == "Malai Kofta") {
            price = 160;
	    return price;
        } else if (foodItem == "Plain Roti") {
            price = 20;
	    return price;
        } else if (foodItem == "Butter Naan") {
            price = 30;
	    return price;
        } else if (foodItem == "Tandoori Chicken") {
            price = 250;
	    return price;
        } else if (foodItem == "Kachori with Aloo Sabzi") {
            price = 90;
	    return price;
        } else if (foodItem == "Pav Bhaji") {
            price = 100;
	    return price;
        } else if (foodItem == "Stuffed Capsicum") {
            price = 120;
	    return price;
        } else if (foodItem == "Gajar Ka Halwa") {
            price = 90;
	    return price;
        } else if (foodItem == "Rasmalai") {
            price = 80;
	    return price;
        } else if (foodItem == "Petha") {
            price = 50;
	    return price;
        } else if (foodItem == "Besan Ladoo") {
            price = 60;
	    return price;
        } else if (foodItem == "Moong Dal Halwa") {
            price = 100;
	    return price;
        } else if (foodItem == "Kheer") {
            price = 70;
	    return price;
        } else if (foodItem == "Lassi") {
            price = 50;
	    return price;
        } else if (foodItem == "Masala Chai") {
            price = 20;
	    return price;
        } else if (foodItem == "Jeera Rice") {
            price = 90;
	    return price;
        } else if (foodItem == "Paneer Bhurji") {
            price = 110;
	    return price;
        } else {
            System.out.println("Cannot Find Food Details");
            System.out.println(foodItem + " is Invalid");
        }

        return price;
    }

    public static int getPrice(String foodItem,int quantity) {
        int price = 0;

        if (foodItem == "Butter Chicken") {
            price = 220*quantity;
	    return price;
        } else if (foodItem == "Shahi Paneer") {
            price = 180*quantity;
	    return price;
        } else if (foodItem == "Chole Bhature") {
            price = 140*quantity;
	    return price;
        } else if (foodItem == "Paneer Tikka") {
            price = 160*quantity;
	    return price;
        } else if (foodItem == "Dal Makhani") {
            price = 130*quantity;
	    return price;
        } else if (foodItem == "Rajma Chawal") {
            price = 120*quantity;
	    return price;
        } else if (foodItem == "Aloo Paratha") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Baingan Bharta") {
            price = 110*quantity;
	    return price;
        } else if (foodItem == "Kadhi Pakora") {
            price = 130*quantity;
	    return price;
        } else if (foodItem == "Palak Paneer") {
            price = 140*quantity;
	    return price;
        } else if (foodItem == "Chicken Curry") {
            price = 200*quantity;
	    return price;
        } else if (foodItem == "Mutton Rogan Josh") {
            price = 280*quantity;
	    return price;
        } else if (foodItem == "Bhindi Masala") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Malai Kofta") {
            price = 160*quantity;
	    return price;
        } else if (foodItem == "Plain Roti") {
            price = 20*quantity;
	    return price;
        } else if (foodItem == "Butter Naan") {
            price = 30*quantity;
	    return price;
        } else if (foodItem == "Tandoori Chicken") {
            price = 250*quantity;
	    return price;
        } else if (foodItem == "Kachori with Aloo Sabzi") {
            price = 90*quantity;
	    return price;
        } else if (foodItem == "Pav Bhaji") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Stuffed Capsicum") {
            price = 120*quantity;
	    return price;
        } else if (foodItem == "Gajar Ka Halwa") {
            price = 90*quantity;
	    return price;
        } else if (foodItem == "Rasmalai") {
            price = 80*quantity;
	    return price;
        } else if (foodItem == "Petha") {
            price = 50*quantity;
	    return price;
        } else if (foodItem == "Besan Ladoo") {
            price = 60*quantity;
	    return price;
        } else if (foodItem == "Moong Dal Halwa") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Kheer") {
            price = 70*quantity;
	    return price;
        } else if (foodItem == "Lassi") {
            price = 50*quantity;
	    return price;
        } else if (foodItem == "Masala Chai") {
            price = 20*quantity;
	    return price;
        } else if (foodItem == "Jeera Rice") {
            price = 90*quantity;
	    return price;
        } else if (foodItem == "Paneer Bhurji") {
            price = 110*quantity;
	    return price;
        } else {
            System.out.println("Cannot Find Food Details");
            System.out.println(foodItem + " is Invalid");
        }

        return price;
    }
}
