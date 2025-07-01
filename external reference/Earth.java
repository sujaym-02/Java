class Earth{

	static String cont1 = "Asia";
	static String cont2 = "Africa";
	static String cont3 = "North America";
	static String cont4 = "South America";
	static String cont5 = "Antarctica";
	static String cont6 = "Europe";
	static String cont7 = "Australia";
	static String continents[] = {cont1, cont2, cont3, cont4, cont5, cont6, cont7};

	public static void main (String continent[]){

		//System.out.println("THE EARTH'S CONTINENTS ARE : " + continents[0] + ", " + continents[1] + ", " + continents[2] + ", " + continents[3] + ", " + continents[4] + ", " + continents[5] + ", " + continents[6] + " \n");

		for(String conti : continents){
		System.out.println(conti);

}
}

}