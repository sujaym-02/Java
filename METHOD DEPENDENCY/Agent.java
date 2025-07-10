class Agent{

	public static void purchase(String vegitable,int quantity){
	System.out.println("The agent purchases "+vegitable+ " in the quantity of" +quantity);
	Broker.brokerage(vegitable,quantity);

}
}