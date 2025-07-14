class DisneyLandRunner {

    public static void main(String args[]) {

        System.out.println("MAIN STARTED\n");

        String location = DisneyLand.getLocation();
        System.out.println("Location: "+location+"\n");

        int numberOfRides = DisneyLand.getNumberOfRides();
        System.out.println("Number of Rides: "+numberOfRides+"\n");

        boolean hasParade = DisneyLand.getHasParade();
        System.out.println("Has Parade: "+hasParade+"\n");

        String mascot = DisneyLand.getMascot();
        System.out.println("Mascot: "+mascot+"\n");

        double ticketPrice = DisneyLand.getTicketPrice();
        System.out.println("Ticket Price: "+ticketPrice+"$\n");

        boolean hasFireworksShow = DisneyLand.getHasFireworksShow();
        System.out.println("Has Fireworks Show: "+hasFireworksShow+"\n");

        System.out.println("MAIN ENDED");
    }
}
