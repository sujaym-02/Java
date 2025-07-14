class RadioRunner{

	public static void main(String radios[]){

	System.out.println("MAIN STARTED\n");

	String brandName = Radio.getBrandName();
	System.out.println("The Brand of The Radio is : "+brandName+"\n");

	String model = Radio.getModel();
	System.out.println("The Model of the Radio is : " +model+"\n");

	int price = Radio.getPrice();
	System.out.println("The Price of The Radio is : " +price+"rs \n");

	String color= Radio.getColor();
	System.out.println("The Color of The Radio is : "+color+"\n");

	int size = Radio.getSize();
	System.out.println("The Size of the Radio is : "+size+"inch \n"); 

	System.out.println("MAIN ENDED");
}


}