class BanglorePin{

	static int silk = 5896123;
	static int rajaji = 895478;
	static int bantwal = 589674;
	static int jp = 789456;
	static int pinCodes[] = { silk, rajaji , bantwal  , jp};

	public static void main(String pin[]){

		System.out.println("---------------MAIN STARTED------------------------\n");

			System.out.println("The Pincodes of Banglore are : ");
			for(int pins : pinCodes){
			System.out.println(pins);
				}


		System.out.println("\n-----------------------------MAIN ENDED---------------------");



} 


}