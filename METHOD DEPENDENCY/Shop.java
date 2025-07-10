class Shop{

	public static void sell(String vegitable,int quantity){
	System.out.println("The shop sells "+vegitable+ " in the quantity of" +quantity);
	Agent.purchase(vegitable,quantity);

}

}