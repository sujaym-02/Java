class TopTenIccTeams{

	static String ind = "INDIA";
	static String nz = "NEW ZEALAND";
	static String aus = "AUSTRALIA";
	static String sl = "SRI LANKA ";
	static String pak = "PAKISTAN";
	static String sa = "SOUTH AFRICA";
	static String af = "AFGHANISTHAN";
	static String eg = "ENGLAND";
	static String we = "WEST INDIES";
	static String bang = "BANGLADESH";
	
	static String iccTeams[] = {ind , nz , aus , sl , pak , sa , af , eg , we , bang };

	public static void main (String teams[]){

		System.out.println("-----------------------MAIN STARTED-------------------------------\n");
		System.out.println("---------------Top Ten ICC Teams---------------\n");
		for(String Team : iccTeams){
		System.out.println(Team);

}

		System.out.println("\n-----------------------MAIN ENDED-------------------------------\n");


}




}