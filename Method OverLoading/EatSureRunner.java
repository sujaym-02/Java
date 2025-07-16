class EatSureRunner{

	public static void main(String food[]){

	String foodItem = "Chicken Kofta";
	int price = EatSure.getPrice(foodItem);
	System.out.println("The Price Of " +foodItem+ " is :"+price);

	int getPriceDetails = EatSure.getPrice(foodItem,3);
	System.out.println("The Price Details of "+foodItem+ " in 3 quantity is : "+getPriceDetails);


}



}