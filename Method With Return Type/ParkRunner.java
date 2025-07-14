class ParkRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String name = Park.getName();
        System.out.println("Park Name: " +name+"\n");

        String location = Park.getLocation();
        System.out.println("Location of the Park is : " +location+"\n");

        int numberOfTrees = Park.getNumberOfTrees();
        System.out.println("Number of Trees: " +numberOfTrees+"\n");

        boolean hasPlayArea = Park.getHasPlayArea();
        System.out.println("Has Play Area: "+hasPlayArea+"\n");

        boolean isPetFriendly = Park.getIsPetFriendly();
        System.out.println("Pet Friendly?: " +isPetFriendly+"\n");

        double entryFee = Park.getEntryFee();
        System.out.println("Entry Fee: " +entryFee+"rs\n");

        System.out.println("MAIN ENDED");
    }
}
