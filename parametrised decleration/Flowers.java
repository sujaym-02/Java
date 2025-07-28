public class Flowers {

    Flowers() {
        System.out.println("Flowers Default Constructor is invoked");
    }


    Flowers(int flowerId, String name, String color, String fragrance, boolean isSeasonal, double price) {
        System.out.println("Flowers Parameterized Constructor is invoked");
        this.flowerId = flowerId;
        this.name = name;
        this.color = color;
        this.fragrance = fragrance;
        this.isSeasonal = isSeasonal;
        this.price = price;
    }

    int flowerId;
    String name;
    String color;
    String fragrance;
    boolean isSeasonal;
    double price;

    void getInformation() {
        System.out.println("Flower ID: " + flowerId);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Seasonal: " + isSeasonal);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
