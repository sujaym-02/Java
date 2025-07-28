class BlazzerRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED\n");

 

        Blazzer blazzer1 = new Blazzer(1, "Van Heusen", "Black", 3999.0, "M", "Cotton", true);
        blazzer1.getInformation();

        Blazzer blazzer2 = new Blazzer(2, "Peter England", "Blue", 3599.0, "L", "Wool", false);
        blazzer2.getInformation();

        Blazzer blazzer3 = new Blazzer(3, "Raymond", "Grey", 4299.0, "XL", "Linen", true);
        blazzer3.getInformation();

        Blazzer blazzer4 = new Blazzer(4, "Allen Solly", "Brown", 3899.0, "S", "Polyester", false);
        blazzer4.getInformation();

        Blazzer blazzer5 = new Blazzer(5, "Zara", "White", 4499.0, "M", "Cotton Blend", true);
        blazzer5.getInformation();

        Blazzer blazzer6 = new Blazzer(6, "Louis Philippe", "Navy Blue", 4599.0, "L", "Silk", true);
        blazzer6.getInformation();

        Blazzer blazzer7 = new Blazzer(7, "H&M", "Olive Green", 3399.0, "M", "Cotton", false);
        blazzer7.getInformation();

        Blazzer blazzer8 = new Blazzer(8, "U.S. Polo", "Maroon", 3799.0, "XL", "Wool Blend", true);
        blazzer8.getInformation();

        Blazzer blazzer9 = new Blazzer(9, "Blackberrys", "Charcoal", 4199.0, "M", "Polyester Wool", false);
        blazzer9.getInformation();

        Blazzer blazzer10 = new Blazzer(10, "Jack & Jones", "Cream", 3299.0, "S", "Viscose", true);
        blazzer10.getInformation();

        Blazzer blazzer11 = new Blazzer(11, "Levis", "Ash", 4099.0, "L", "Cotton Wool", false);
        blazzer11.getInformation();

        Blazzer blazzer12 = new Blazzer(12, "Marks & Spencer", "Khaki", 4799.0, "XL", "Wool", true);
        blazzer12.getInformation();

        Blazzer blazzer13 = new Blazzer(13, "Tommy Hilfiger", "Black", 4999.0, "M", "Wool Silk Blend", true);
        blazzer13.getInformation();

        Blazzer blazzer14 = new Blazzer(14, "Wrangler", "Green", 3199.0, "L", "Cotton Linen", false);
        blazzer14.getInformation();

        Blazzer blazzer15 = new Blazzer(15, "Mufti", "Beige", 3499.0, "S", "Cotton", true);
        blazzer15.getInformation();

        Blazzer blazzer16 = new Blazzer(16, "Red Tape", "Dark Grey", 3899.0, "XL", "Poly Cotton", false);
        blazzer16.getInformation();

        Blazzer blazzer17 = new Blazzer(17, "Arrow", "Navy", 4599.0, "M", "Tweed", true);
        blazzer17.getInformation();

        Blazzer blazzer18 = new Blazzer(18, "Park Avenue", "Steel Blue", 3699.0, "L", "Polyester", false);
        blazzer18.getInformation();

        Blazzer blazzer19 = new Blazzer(19, "Indian Terrain", "Rust", 3399.0, "M", "Linen Blend", true);
        blazzer19.getInformation();

        Blazzer blazzer20 = new Blazzer(20, "Flying Machine", "Teal", 3099.0, "S", "Viscose Rayon", false);
        blazzer20.getInformation();

        System.out.println("\nMAIN ENDED");
    }
}


        /*Blazzer blazzer1 = new Blazzer();
        blazzer1.blazzerId = 1;
        blazzer1.brand = "Van Heusen";
        blazzer1.color = "Black";
        blazzer1.price = 3999.0;
        blazzer1.size = "M";
        blazzer1.fabric = "Cotton";
        blazzer1.isSlimFit = true;
        blazzer1.getInformation();

        Blazzer blazzer2 = new Blazzer();
        blazzer2.blazzerId = 2;
        blazzer2.brand = "Peter England";
        blazzer2.color = "Blue";
        blazzer2.price = 3599.0;
        blazzer2.size = "L";
        blazzer2.fabric = "Wool";
        blazzer2.isSlimFit = false;
        blazzer2.getInformation();

        Blazzer blazzer3 = new Blazzer();
        blazzer3.blazzerId = 3;
        blazzer3.brand = "Raymond";
        blazzer3.color = "Grey";
        blazzer3.price = 4299.0;
        blazzer3.size = "XL";
        blazzer3.fabric = "Linen";
        blazzer3.isSlimFit = true;
        blazzer3.getInformation();

        Blazzer blazzer4 = new Blazzer();
        blazzer4.blazzerId = 4;
        blazzer4.brand = "Allen Solly";
        blazzer4.color = "Brown";
        blazzer4.price = 3899.0;
        blazzer4.size = "S";
        blazzer4.fabric = "Polyester";
        blazzer4.isSlimFit = false;
        blazzer4.getInformation();

        Blazzer blazzer5 = new Blazzer();
        blazzer5.blazzerId = 5;
        blazzer5.brand = "Zara";
        blazzer5.color = "White";
        blazzer5.price = 4499.0;
        blazzer5.size = "M";
        blazzer5.fabric = "Cotton Blend";
        blazzer5.isSlimFit = true;
        blazzer5.getInformation();

        Blazzer blazzer6 = new Blazzer();
        blazzer6.blazzerId = 6;
        blazzer6.brand = "Louis Philippe";
        blazzer6.color = "Navy Blue";
        blazzer6.price = 4599.0;
        blazzer6.size = "L";
        blazzer6.fabric = "Silk";
        blazzer6.isSlimFit = true;
        blazzer6.getInformation();

        Blazzer blazzer7 = new Blazzer();
        blazzer7.blazzerId = 7;
        blazzer7.brand = "H&M";
        blazzer7.color = "Olive Green";
        blazzer7.price = 3399.0;
        blazzer7.size = "M";
        blazzer7.fabric = "Cotton";
        blazzer7.isSlimFit = false;
        blazzer7.getInformation();

        Blazzer blazzer8 = new Blazzer();
        blazzer8.blazzerId = 8;
        blazzer8.brand = "U.S. Polo";
        blazzer8.color = "Maroon";
        blazzer8.price = 3799.0;
        blazzer8.size = "XL";
        blazzer8.fabric = "Wool Blend";
        blazzer8.isSlimFit = true;
        blazzer8.getInformation();

        Blazzer blazzer9 = new Blazzer();
        blazzer9.blazzerId = 9;
        blazzer9.brand = "Blackberrys";
        blazzer9.color = "Charcoal";
        blazzer9.price = 4199.0;
        blazzer9.size = "M";
        blazzer9.fabric = "Polyester Wool";
        blazzer9.isSlimFit = false;
        blazzer9.getInformation();

        Blazzer blazzer10 = new Blazzer();
        blazzer10.blazzerId = 10;
        blazzer10.brand = "Jack & Jones";
        blazzer10.color = "Cream";
        blazzer10.price = 3299.0;
        blazzer10.size = "S";
        blazzer10.fabric = "Viscose";
        blazzer10.isSlimFit = true;
        blazzer10.getInformation();

        Blazzer blazzer11 = new Blazzer();
        blazzer11.blazzerId = 11;
        blazzer11.brand = "Levis";
        blazzer11.color = "Ash";
        blazzer11.price = 4099.0;
        blazzer11.size = "L";
        blazzer11.fabric = "Cotton Wool";
        blazzer11.isSlimFit = false;
        blazzer11.getInformation();

        Blazzer blazzer12 = new Blazzer();
        blazzer12.blazzerId = 12;
        blazzer12.brand = "Marks & Spencer";
        blazzer12.color = "Khaki";
        blazzer12.price = 4799.0;
        blazzer12.size = "XL";
        blazzer12.fabric = "Wool";
        blazzer12.isSlimFit = true;
        blazzer12.getInformation();

        Blazzer blazzer13 = new Blazzer();
        blazzer13.blazzerId = 13;
        blazzer13.brand = "Tommy Hilfiger";
        blazzer13.color = "Black";
        blazzer13.price = 4999.0;
        blazzer13.size = "M";
        blazzer13.fabric = "Wool Silk Blend";
        blazzer13.isSlimFit = true;
        blazzer13.getInformation();

        Blazzer blazzer14 = new Blazzer();
        blazzer14.blazzerId = 14;
        blazzer14.brand = "Wrangler";
        blazzer14.color = "Green";
        blazzer14.price = 3199.0;
        blazzer14.size = "L";
        blazzer14.fabric = "Cotton Linen";
        blazzer14.isSlimFit = false;
        blazzer14.getInformation();

        Blazzer blazzer15 = new Blazzer();
        blazzer15.blazzerId = 15;
        blazzer15.brand = "Mufti";
        blazzer15.color = "Beige";
        blazzer15.price = 3499.0;
        blazzer15.size = "S";
        blazzer15.fabric = "Cotton";
        blazzer15.isSlimFit = true;
        blazzer15.getInformation();

        Blazzer blazzer16 = new Blazzer();
        blazzer16.blazzerId = 16;
        blazzer16.brand = "Red Tape";
        blazzer16.color = "Dark Grey";
        blazzer16.price = 3899.0;
        blazzer16.size = "XL";
        blazzer16.fabric = "Poly Cotton";
        blazzer16.isSlimFit = false;
        blazzer16.getInformation();

        Blazzer blazzer17 = new Blazzer();
        blazzer17.blazzerId = 17;
        blazzer17.brand = "Arrow";
        blazzer17.color = "Navy";
        blazzer17.price = 4599.0;
        blazzer17.size = "M";
        blazzer17.fabric = "Tweed";
        blazzer17.isSlimFit = true;
        blazzer17.getInformation();

        Blazzer blazzer18 = new Blazzer();
        blazzer18.blazzerId = 18;
        blazzer18.brand = "Park Avenue";
        blazzer18.color = "Steel Blue";
        blazzer18.price = 3699.0;
        blazzer18.size = "L";
        blazzer18.fabric = "Polyester";
        blazzer18.isSlimFit = false;
        blazzer18.getInformation();

        Blazzer blazzer19 = new Blazzer();
        blazzer19.blazzerId = 19;
        blazzer19.brand = "Indian Terrain";
        blazzer19.color = "Rust";
        blazzer19.price = 3399.0;
        blazzer19.size = "M";
        blazzer19.fabric = "Linen Blend";
        blazzer19.isSlimFit = true;
        blazzer19.getInformation();

        Blazzer blazzer20 = new Blazzer();
        blazzer20.blazzerId = 20;
        blazzer20.brand = "Flying Machine";
        blazzer20.color = "Teal";
        blazzer20.price = 3099.0;
        blazzer20.size = "S";
        blazzer20.fabric = "Viscose Rayon";
        blazzer20.isSlimFit = false;
        blazzer20.getInformation();*/


