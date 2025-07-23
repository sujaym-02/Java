class NewsPaperRunner{

	public static void main (String paper[]){
		
	System.out.println("MAIN STARTED\n");

	NewsPaper newsPaper = new NewsPaper();
	newsPaper.newsPaperId =1;
	newsPaper.noOfPages = 10;
	newsPaper.language ="English";
	newsPaper.date = "22/07/2025";
	newsPaper.day = "Tuesday";
	newsPaper.companyName = "The Hindu";

	System.out.println("The News PAper Id is : "+newsPaper.newsPaperId);
	System.out.println("THE no of Pages : "+newsPaper.noOfPages);
	System.out.println("The Language is : "+newsPaper.language);
	System.out.println("DAte :"+newsPaper.date);
	System.out.println("day : "+newsPaper.day);
	System.out.println("Company NAme : "+newsPaper.companyName);
	System.out.println();

	NewsPaper newsPaper2 = new NewsPaper();
	newsPaper2.newsPaperId =2;
	System.out.println("The News PAper Id is : "+newsPaper2.newsPaperId);
	newsPaper2.noOfPages = 12;
	System.out.println("THE no of Pages : "+newsPaper2.noOfPages);
	newsPaper2.language ="English";
	System.out.println("The Language is : "+newsPaper2.language);
	newsPaper2.date = "22/07/2025";
	System.out.println("DAte :"+newsPaper2.date);
	newsPaper2.day = "Tuesday";
	System.out.println("day : "+newsPaper2.day);
	newsPaper2.companyName = "The Times";
	System.out.println("Company NAme : "+newsPaper2.companyName);
	System.out.println();

		







}








}
