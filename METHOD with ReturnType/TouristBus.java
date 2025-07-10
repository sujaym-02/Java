class TouristBus{

	static String busName;
	static byte seatCapacity;
	static short totalTrips;
	static int wheelbase;
	static long kiloMeter;
	static float fuelLevel;
	static double busPrice;
	static char fuelType;
	static boolean isOperating; 

	public static String getBusName(){
	busName = "KOMBAN";
	return busName;
	}

	public static byte getSeatCapacity(){
	seatCapacity = 49;
	return seatCapacity;
	}

	public static short getTotalTrips(){
	totalTrips = 410;
	return totalTrips;
	}

	public static int getWheelBase(){
	int wheelbase = 222;
	return wheelbase;
	}

	public static long  getKiloMeter(){
	kiloMeter = 112458l;
	return kiloMeter;
	}

	public static float getFuelLevel(){
	fuelLevel = 68;
	return fuelLevel;
	}

	public static double getBusPrice(){
	busPrice = 9800000;
	return busPrice;
	}

	public static char getFuelType(){
	fuelType = 'D' ;
	return fuelType;
	}

	public static boolean getIsOperating(){
	isOperating = true;
	return isOperating;
	}

}