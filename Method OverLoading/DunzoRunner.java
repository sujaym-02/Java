class DunzoRunner{

	public static void main(String food[]){


	String foodItem = "Ramen";
	int price = Dunzo.getPrice(foodItem);
	System.out.println("The Price of "+foodItem+" is :" +price );

	int getPriceDetails = Dunzo.getPrice(foodItem,3);
	System.out.println("The Price Details of "+foodItem+ " in 3 quantity is : "+getPriceDetails);






}



}