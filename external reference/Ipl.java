class Ipl{

	static String team1 = "Chennai Super Kings";
	static String team2 = "Mumbai Indians";
	static String team3 = "Royal Challengers Bangalore";
	static String team4 = "Kolkata Knight Riders";
	static String team5 = "Delhi Capitals";
	static String team6 = "Rajasthan Royals";
	static String team7 = "Sunrisers Hyderabad";
	static String team8 = "Punjab Kings";
	static String team9 = "Lucknow Super Giants";
	static String team10 = "Gujarat Titans";
	static String teamNames[] = {team1, team2, team3, team4, team5, team6, team7, team8, team9, team10};

	public static void main(String team[]){

		//System.out.println("THE IPL TEAMS ARE : " + teamNames[0] + ", " + teamNames[1] + ", " + teamNames[2] + ", " + teamNames[3] + ", " + teamNames[4] + ", " + teamNames[5] + ", " + teamNames[6] + ", " + teamNames[7] + ", " + teamNames[8] + ", " + teamNames[9] + " \n");

		for(String names : teamNames){
		System.out.println(names);

}



}
}