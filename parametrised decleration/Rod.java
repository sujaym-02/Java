public class Rod {

    Rod() {
        System.out.println("Rod Default Constructor is invoked");
    }


    Rod(int rodId, double length, String material, String usage, double weight, String brand) {
        System.out.println("Rod Parameterized Constructor is invoked");
        this.rodId = rodId;
        this.length = length;
        this.material = material;
        this.usage = usage;
        this.weight = weight;
        this.brand = brand;
    }

    int rodId;
    double length;
    String material;
    String usage;
    double weight;
    String brand;

    void getInformation() {
        System.out.println("Rod ID: " + rodId);
        System.out.println("Length: " + length);
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("Weight: " + weight);
        System.out.println("Brand: " + brand);
        System.out.println();
    }
}
