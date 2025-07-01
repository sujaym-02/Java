class StockMarket{
	
	static String reli = "Reliance Industries";
	static String tata = "Tata Consultancy Services";
	static String inf = "Infosys";
	static String hdfc = "HDFC Bank";
	static String icici = "ICICI Bank";
	static String hind = "Hindustan Unilever";
	static String sbi = "State Bank of India";
	static String bhar = "Bharti Airtel";
	static String itc = "ITC Limited";
	static String lars = "Larsen & Toubro"; 
	static String stockMarkets[] = {reli, tata, inf, hdfc, icici, hind, sbi, bhar, itc, lars};

	public static void main(String names[]){

		//System.out.println("THE STOCK MARKET COMPANIES IN INDIA ARE : " + stockMarkets[0] + ", " + stockMarkets[1] + ", " + stockMarkets[2] + ", " + stockMarkets[3] + ", " + stockMarkets[4] + ", " + stockMarkets[5] + ", " + stockMarkets[6] + ", " + stockMarkets[7] + ", " + stockMarkets[8] + ", " + stockMarkets[9] + "\n");

		for(String stock : stockMarkets){
		System.out.println(stock);

}



}



}