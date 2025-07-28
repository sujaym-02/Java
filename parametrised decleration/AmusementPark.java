class AmusementPark {

	AmusementPark(){
	System.out.println("AmusementPark Constructor is invoked");
	}	

	AmusementPark(int parkId,String name,String location,double entryFee, int ridesAvailable, String area){
	System.out.println("AmusementPark Constructor is invoked");
	this.parkId=parkId;
	this.name=name;
	this.location=location;
	this.entryFee=entryFee;
	this.ridesAvailable=ridesAvailable;
	this.area=area;
	}

    	int parkId;
    	String name;
    	String location;
    	double entryFee;
    	int ridesAvailable;
    	String area;

void getInformation(){
	
	System.out.println("The Park ID is : "+parkId);
	System.out.println("The Name of Park is :"+name);
	System.out.println("The Location of Park is : "+location);
	System.out.println("The Entry For The Park is : "+entryFee);
	System.out.println("The Rides Available : "+ridesAvailable);
	System.out.println("THE Area of the park is : "+area);
	System.out.println();
	
	}
}