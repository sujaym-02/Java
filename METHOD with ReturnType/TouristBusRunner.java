class TouristBusRunner{

	public static void main(String bus[]){

		System.out.println("MAIN STARTED\n");
		
		String busName = TouristBus.getBusName();
		System.out.println("The Bus Name is : " +busName+"\n");

		byte seatCapacity = TouristBus.getSeatCapacity();
		System.out.println("The seat capacity of " +busName+ " is : "+seatCapacity+"\n");

		short totalTrips = TouristBus.getTotalTrips();
		System.out.println("The total trips  of " +busName+ " is : "+totalTrips+"\n");

		int wheelBase = TouristBus.getWheelBase();
		System.out.println("The Wheel Base of " +busName+ " is : "+wheelBase+"WB\n");

		long kiloMeter = TouristBus.getKiloMeter();
		System.out.println("The total KiloMeter of " +busName+ " is : "+kiloMeter+"KM\n");

		float fuelLevel = TouristBus.getFuelLevel();
		System.out.println("The Fuel capacity of " +busName+ " is : "+fuelLevel+"L\n");

		double busPrice = TouristBus.getBusPrice();
		System.out.println("The Price of " +busName+ " is : "+busPrice+"LAKH\n");

		char fuelType = TouristBus.getFuelType();
		System.out.println("The Fuel Type of " +busName+ " is : "+fuelType+"\n");

		boolean isOperating = TouristBus.getIsOperating();
		System.out.println("Whether " +busName+ " is Operating : "+isOperating+"\n");

		System.out.println("MAIN ENDED\n");









		





	}






}