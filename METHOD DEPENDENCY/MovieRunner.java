class MovieRunner {
    public static void main(String[] args) {
	System.out.println("Main Started");
        String movie = "Premam";
	int tickets = 2;
	Customer.buy(movie,tickets);
	System.out.println("Main Ended");
    }
}
