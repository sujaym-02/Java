class SwiggyRunner{

	public static void main (String food[]){

	String foodItem = "Appam with Stew";
	int price = Swiggy.getPrice(foodItem);
	System.out.println("The price of" +foodItem+ "is : " +price);

	String foodItems = "Banana Chips";
	int getPriceDetails = Swiggy.getPrice(foodItems,3);
	System.out.println("The price of "+foodItems+" in quantity 3 is : "+getPriceDetails);



}


}