class Blazzer {

    Blazzer() {
        System.out.println("Blazzer Default Constructor is invoked");
    }


    Blazzer(int blazzerId, String brand, String color, double price, String size, String fabric, boolean isSlimFit) {
        System.out.println("Blazzer Parameterized Constructor is invoked");
        this.blazzerId = blazzerId;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.fabric = fabric;
        this.isSlimFit = isSlimFit;
    }

    int blazzerId;
    String brand;
    String color;
    double price;
    String size;
    String fabric;
    boolean isSlimFit;

    void getInformation() {
        System.out.println("Blazzer ID: " + blazzerId);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
        System.out.println("Is Slim Fit: " + isSlimFit);
        System.out.println("------------------------");
    }
}
