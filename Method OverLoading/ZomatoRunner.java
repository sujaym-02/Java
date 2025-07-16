class ZomatoRunner{

	public static void main(String food[]){

	String foodItem = "Kheer";
	int price = Zomato.getPrice(foodItem);
	System.out.println("The PRice of " +foodItem+ "is : "+price);

	int getPriceDetails = Zomato.getPrice(foodItem,3);
	System.out.println("The Price Details of "+foodItem+ " in 3 quantity is : "+getPriceDetails);

}



}