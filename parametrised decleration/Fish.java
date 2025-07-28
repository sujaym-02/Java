public class Fish {

    Fish() {
        System.out.println("Fish Default Constructor is invoked");
    }


    Fish(int fishId, String name, String species, double weight, String waterType, boolean isEdible) {
        System.out.println("Fish Parameterized Constructor is invoked");
        this.fishId = fishId;
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.waterType = waterType;
        this.isEdible = isEdible;
    }

    int fishId;
    String name;
    String species;
    double weight;
    String waterType;
    boolean isEdible;

    void getInformation() {
        System.out.println("Fish ID: " + fishId);
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Water Type: " + waterType);
        System.out.println("Edible: " + isEdible);
        System.out.println();
    }
}
