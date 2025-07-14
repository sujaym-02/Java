class Banner{


	static String message;
	static String color;
	static int width;
	static String material;
	static int height;
	static boolean isReusable;
	
	public static String getMessage(){
	message = "WELCOME TO XWORKZ";
	return message;
	}

	public static String getColor(){
	color = "Red";
	return color;
	}

	public static int getWidth(){
	width = 12;
	return width;
	}

	public static String getMaterial(){
	material = "Vinyl";
	return material;
	}

	public static int getHeight(){
	height = 17 ;
	return height;
	}
	
	public static Boolean getIsReusable(){
	isReusable = true;
	return isReusable;
	}



}