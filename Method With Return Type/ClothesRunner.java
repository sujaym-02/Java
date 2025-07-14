class ClothesRunner {

    public static void main(String clothes[]) {

        System.out.println("MAIN STARTED\n");

        String type = Clothes.getType();
        System.out.println("Clothing Type: " + type + "\n");

        String color = Clothes.getColor();
        System.out.println("Color: " + color + "\n");

        String size = Clothes.getSize();
        System.out.println("Size: " + size + "\n");

        String fabric = Clothes.getFabric();
        System.out.println("Fabric: " + fabric + "\n");

        boolean isWashed = Clothes.getIsWashed();
        System.out.println("Is Washed?: " + isWashed + "\n");

        boolean isIroned = Clothes.getIsIroned();
        System.out.println("Is Ironed?: " + isIroned + "\n");

        double price = Clothes.getPrice();
        System.out.println("Price: ₹" + price + "\n");

        System.out.println("MAIN ENDED");
    }
}
