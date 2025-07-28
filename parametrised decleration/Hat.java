public class Hat {

    Hat() {
        System.out.println("Hat Default Constructor is invoked");
    }

    Hat(int hatId, String style, String color, String material, String size, String brand) {
        System.out.println("Hat Parameterized Constructor is invoked");
        this.hatId = hatId;
        this.style = style;
        this.color = color;
        this.material = material;
        this.size = size;
        this.brand = brand;
    }

    int hatId;
    String style;
    String color;
    String material;
    String size;
    String brand;

    void getInformation() {
        System.out.println("Hat ID: " + hatId);
        System.out.println("Style: " + style);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
        System.out.println("------------------------");
    }
}
