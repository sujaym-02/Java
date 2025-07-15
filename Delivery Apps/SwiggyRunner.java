class SwiggyRunner{

	public static void main (String food[]){

	String foodItem = "Appam with Stew";
	int price = Swiggy.getPrice(foodItem);
	System.out.println("The price of" +foodItem+ "is : " +price);



}


}