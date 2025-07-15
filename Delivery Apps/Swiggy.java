class Swiggy {

    public static int getPrice(String foodItem) {
        int price = 0;

        if (foodItem == "Kerala Sadya") {
            price = 200;
        } else if (foodItem == "Appam with Stew") {
            price = 120;
        } else if (foodItem == "Puttu and Kadala Curry") {
            price = 100;
        } else if (foodItem == "Idiyappam and Egg Curry") {
            price = 110;
        } else if (foodItem == "Malabar Parotta and Beef Fry") {
            price = 180;
        } else if (foodItem == "Fish Molee") {
            price = 200;
        } else if (foodItem == "Karimeen Pollichathu") {
            price = 250;
        } else if (foodItem == "Meen Curry with Tapioca") {
            price = 150;
        } else if (foodItem == "Chakka Puzhukku") {
            price = 90;
        } else if (foodItem == "Avial") {
            price = 100;
        } else if (foodItem == "Thoran") {
            price = 80;
        } else if (foodItem == "Sambar") {
            price = 60;
        } else if (foodItem == "Rasam") {
            price = 50;
        } else if (foodItem == "Kalan") {
            price = 70;
        } else if (foodItem == "Olan") {
            price = 65;
        } else if (foodItem == "Pachadi") {
            price = 60;
        } else if (foodItem == "Erissery") {
            price = 90;
        } else if (foodItem == "Banana Chips") {
            price = 50;
        } else if (foodItem == "Sharkara Varatti") {
            price = 60;
        } else if (foodItem == "Parippu Curry") {
            price = 70;
        } else if (foodItem == "Payasam") {
            price = 100;
        } else if (foodItem == "Ada Pradhaman") {
            price = 120;
        } else if (foodItem == "Pazham Pori") {
            price = 40;
        } else if (foodItem == "Unniyappam") {
            price = 50;
        } else if (foodItem == "Achappam") {
            price = 55;
        } else if (foodItem == "Kozhukatta") {
            price = 60;
        } else if (foodItem == "Beef Ularthiyathu") {
            price = 190;
        } else if (foodItem == "Chicken Roast Kerala Style") {
            price = 180;
        } else if (foodItem == "Mutton Curry Kerala Style") {
            price = 220;
        } else if (foodItem == "Kappa Biriyani") {
            price = 150;
        } else {
            System.out.println("Cannot Find Food Details");
            System.out.println(foodItem + " is Invalid");
        }

        return price;
    }
}
