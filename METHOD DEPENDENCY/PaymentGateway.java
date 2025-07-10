 class PaymentGateway {
    public static void pay(String movie, int tickets) {
        System.out.println("Payment Gateway processing payment for " + tickets + " tickets of " + movie);
        Theatre.reserve(movie, tickets);
    }
}
