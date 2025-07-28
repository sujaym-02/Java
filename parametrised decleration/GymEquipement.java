public class GymEquipement {

    GymEquipement() {
        System.out.println("GymEquipement Default Constructor is invoked");
    }

       GymEquipement(int equipId, String name, double weight, String type, String brand, double price, boolean isElectronic) {
        System.out.println("GymEquipement Parameterized Constructor is invoked");
        this.equipId = equipId;
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.isElectronic = isElectronic;
    }

    int equipId;
    String name;
    double weight;
    String type;
    String brand;
    double price;
    boolean isElectronic;

    void getInformation() {
        System.out.println("Equip ID: " + equipId);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Electronic: " + isElectronic);
        System.out.println();
    }
}
