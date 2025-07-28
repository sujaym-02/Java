public class HairClip {

    HairClip() {
        System.out.println("HairClip Default Constructor is invoked");
    }

    HairClip(int clipId, String color, String material, String type, String brand, double price) {
        System.out.println("HairClip Parameterized Constructor is invoked");
        this.clipId = clipId;
        this.color = color;
        this.material = material;
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    int clipId;
    String color;
    String material;
    String type;
    String brand;
    double price;

    void getInformation() {
        System.out.println("Clip ID: " + clipId);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------------");
    }
}
