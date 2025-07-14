class GoldRunner {

    public static void main(String golds[]) {

        System.out.println("MAIN STARTED\n");

        String purity = Gold.getPurity();
        System.out.println("Purity: " + purity + "\n");

        double weight = Gold.getWeight();
        System.out.println("Weight: " + weight + " grams\n");

        String type = Gold.getType();
        System.out.println("Type: " + type + "\n");

        boolean isHallmarked = Gold.getIsHallmarked();
        System.out.println("Hallmarked: " + isHallmarked + "\n");

        double pricePerGram = Gold.getPricePerGram();
        System.out.println("Price per gram: ₹" + pricePerGram + "\n");

        String origin = Gold.getOrigin();
        System.out.println("Origin: " + origin + "\n");

        System.out.println("MAIN ENDED");
    }
}
