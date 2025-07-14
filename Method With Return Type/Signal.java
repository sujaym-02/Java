class Signal {

    static String type;
    static double  frequency;
    static int range;
    static boolean isActive;
    static int powerLevel;
    static boolean isEncrypted;



	public static String getType(){
 	type = "WiFi";
	return type;
	}

	public static double getFrequency(){
        frequency = 2.4;
	return frequency;
	}

	public static int getRange(){
        range = 100 ;
	return range;
	}

	public static Boolean getIsActive(){
        isActive = true;
	return isActive;
	}
	
	public static int getPowerLevel(){
        powerLevel = 75;
	return powerLevel;
	}
	
	public static Boolean getIsEncrypted(){
        isEncrypted = true;
	return isEncrypted;
	}


}