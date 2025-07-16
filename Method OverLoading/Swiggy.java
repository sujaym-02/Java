class Swiggy {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Kerala Sadya") {
            price = 200;
	    return price;
        } else if (foodItem == "Appam with Stew") {
            price = 120;
	    return price;
        } else if (foodItem == "Puttu and Kadala Curry") {
            price = 100;
	    return price;
        } else if (foodItem == "Idiyappam and Egg Curry") {
            price = 110;
	    return price;
        } else if (foodItem == "Malabar Parotta and Beef Fry") {
            price = 180;
	    return price;
        } else if (foodItem == "Fish Molee") {
            price = 200;
	    return price;
        } else if (foodItem == "Karimeen Pollichathu") {
            price = 250;
	    return price;
        } else if (foodItem == "Meen Curry with Tapioca") {
            price = 150;
	    return price;
        } else if (foodItem == "Chakka Puzhukku") {
            price = 90;
	    return price;
        } else if (foodItem == "Avial") {
            price = 100;
	    return price;
        } else if (foodItem == "Thoran") {
            price = 80;
	    return price;
        } else if (foodItem == "Sambar") {
            price = 60;
	    return price;
        } else if (foodItem == "Rasam") {
            price = 50;
	    return price;
        } else if (foodItem == "Kalan") {
            price = 70;
	    return price;
        } else if (foodItem == "Olan") {
            price = 65;
	    return price;
        } else if (foodItem == "Pachadi") {
            price = 60;
	    return price;
        } else if (foodItem == "Erissery") {
            price = 90;
	    return price;
        } else if (foodItem == "Banana Chips") {
            price = 50;
	    return price;
        } else if (foodItem == "Sharkara Varatti") {
            price = 60;
	    return price;
        } else if (foodItem == "Parippu Curry") {
            price = 70;
	    return price;
        } else if (foodItem == "Payasam") {
            price = 100;
	    return price;
        } else if (foodItem == "Ada Pradhaman") {
            price = 120;
	    return price;
        } else if (foodItem == "Pazham Pori") {
            price = 40;
	    return price;
        } else if (foodItem == "Unniyappam") {
            price = 50;
	    return price;
        } else if (foodItem == "Achappam") {
            price = 55;
	    return price;
        } else if (foodItem == "Kozhukatta") {
            price = 60;
	    return price;
        } else if (foodItem == "Beef Ularthiyathu") {
            price = 190;
	    return price;
        } else if (foodItem == "Chicken Roast Kerala Style") {
            price = 180;
	    return price;
        } else if (foodItem == "Mutton Curry Kerala Style") {
            price = 220;
	    return price;
        } else if (foodItem == "Kappa Biriyani") {
            price = 150;
	    return price;
        } else {
            System.out.println("Cannot Find Food Details");
            System.out.println(foodItem + " is Invalid");
        }

        return price;
}
    public static int getPrice(String foodItem,int quantity) {
        int price = 0;

        if (foodItem == "Kerala Sadya") {
            price = 200*quantity;
	    return price;
        } else if (foodItem == "Appam with Stew") {
            price = 120*quantity;
	    return price;
        } else if (foodItem == "Puttu and Kadala Curry") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Idiyappam and Egg Curry") {
            price = 110*quantity;
	    return price;
        } else if (foodItem == "Malabar Parotta and Beef Fry") {
            price = 180*quantity;
	    return price;
        } else if (foodItem == "Fish Molee") {
            price = 200*quantity;
	    return price;
        } else if (foodItem == "Karimeen Pollichathu") {
            price = 250*quantity;
	    return price;
        } else if (foodItem == "Meen Curry with Tapioca") {
            price = 150*quantity;
	    return price;
        } else if (foodItem == "Chakka Puzhukku") {
            price = 90*quantity;
	    return price;
        } else if (foodItem == "Avial") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Thoran") {
            price = 80*quantity;
	    return price;
        } else if (foodItem == "Sambar") {
            price = 60*quantity;
	    return price;
        } else if (foodItem == "Rasam") {
            price = 50*quantity;
	    return price;
        } else if (foodItem == "Kalan") {
            price = 70*quantity;
	    return price;
        } else if (foodItem == "Olan") {
            price = 65*quantity;
	    return price;
        } else if (foodItem == "Pachadi") {
            price = 60*quantity;
	    return price;
        } else if (foodItem == "Erissery") {
            price = 90*quantity;
	    return price;
        } else if (foodItem == "Banana Chips") {
            price = 50*quantity;
	    return price;
        } else if (foodItem == "Sharkara Varatti") {
            price = 60*quantity;
	    return price;
        } else if (foodItem == "Parippu Curry") {
            price = 70*quantity;
	    return price;
        } else if (foodItem == "Payasam") {
            price = 100*quantity;
	    return price;
        } else if (foodItem == "Ada Pradhaman") {
            price = 120*quantity;
	    return price;
        } else if (foodItem == "Pazham Pori") {
            price = 40*quantity;
	    return price;
        } else if (foodItem == "Unniyappam") {
            price = 50*quantity;
	    return price;
        } else if (foodItem == "Achappam") {
            price = 55*quantity;
	    return price;
        } else if (foodItem == "Kozhukatta") {
            price = 60*quantity;
	    return price;
        } else if (foodItem == "Beef Ularthiyathu") {
            price = 190*quantity;
	    return price;
        } else if (foodItem == "Chicken Roast Kerala Style") {
            price = 180*quantity;
	    return price;
        } else if (foodItem == "Mutton Curry Kerala Style") {
            price = 220*quantity;
	    return price;
        } else if (foodItem == "Kappa Biriyani") {
            price = 150*quantity;
	    return price;
        } else {
            System.out.println("Cannot Find Food Details");
            System.out.println(foodItem + " is Invalid");
        }
 	return price;
    }
}
