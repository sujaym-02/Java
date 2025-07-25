public class HairClip {
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
