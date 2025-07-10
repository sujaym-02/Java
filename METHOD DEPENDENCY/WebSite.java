class WebSite {
    public static void sell(String movie, int tickets) {
        System.out.println("Website selling " + tickets + " tickets for movie: " + movie);
        PaymentGateway.pay(movie, tickets);
    }
}
