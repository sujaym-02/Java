class Customer {
    public static void buy(String movie, int tickets) {
        System.out.println("Customer buying " + tickets + " tickets for movie: " + movie);
        WebSite.sell(movie, tickets);
    }
}
