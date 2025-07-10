class Broker{

	public static void brokerage(String vegitable,int quantity){
	System.out.println("The broker sells "+vegitable+ " in the quantity of" +quantity);
	Farmer.farm(vegitable,quantity);

}
}