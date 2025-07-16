class UberEatsRunner{


	public static void main(String foods[]){


	String foodItem = "Orange Juice";
	int price  = UberEats.getPrice(foodItem);
	System.out.println("The Price of "+foodItem+" is : "+price); 

	int getPriceDetails = UberEats.getPrice(foodItem,3);
	System.out.println("The Price Details of "+foodItem+ " in 3 quantity is : "+getPriceDetails);





}



}