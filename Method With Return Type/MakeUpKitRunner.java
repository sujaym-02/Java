class MakeUpKitRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String brand = MakeUpKit.getBrand();
        System.out.println("Brand: " +brand+"\n");

        int itemCount = MakeUpKit.getItemCount();
        System.out.println("Number of Items: " +itemCount+"\n");

        boolean hasMirror = MakeUpKit.getHasMirror();
        System.out.println("Has Mirror?: "+hasMirror+"\n");

        boolean isTravelFriendly = MakeUpKit.getIsTravelFriendly();
        System.out.println("Travel Friendly?: "+isTravelFriendly+"\n");

        String kitType = MakeUpKit.getKitType();
        System.out.println("Kit Type: " +kitType+"\n");

        double price = MakeUpKit.getPrice();
        System.out.println("Price: " + price+ "rs\n");

        System.out.println("MAIN ENDED");
    }
}
