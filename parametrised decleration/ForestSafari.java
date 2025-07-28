public class ForestSafari {

	ForestSafari(){
	System.out.println(" Constructor is invoked");
	}	

	ForestSafari(int safariId,String location,String animalSighted,String guideName,double duration, double price){
	System.out.println(" Constructor is invoked");
	this.safariId=safariId;
	this.location=location;
	this.animalSighted=animalSighted;
	this.guideName=guideName;
	this.duration=duration;
	this.price=price;
	}

    int safariId;
    String location;
    String animalSighted;
    String guideName;
    double duration;
    double price;

void getInformation(){

        System.out.println("Safari ID: " + safariId);
        System.out.println("Location: " +location);
        System.out.println("Animal Sighted: " + animalSighted);
        System.out.println("Guide Name: " +guideName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Price: " +price);
        System.out.println();

}
}