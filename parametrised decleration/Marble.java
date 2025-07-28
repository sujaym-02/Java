public class Marble {

    Marble() {
        System.out.println("Marble Default Constructor is invoked");
    }


    Marble(int marbleId, String color, String origin, boolean polishType, double price, boolean isImported) {
        System.out.println("Marble Parameterized Constructor is invoked");
        this.marbleId = marbleId;
        this.color = color;
        this.origin = origin;
        this.polishType = polishType;
        this.price = price;
        this.isImported = isImported;
    }

    int marbleId;
    String color;
    String origin;
    boolean polishType;
    double price;
    boolean isImported;

    void getInformation() {
        System.out.println("Marble ID: " + marbleId);
        System.out.println("Color: " + color);
        System.out.println("Origin: " + origin);
        System.out.println("Polish: " + polishType);
        System.out.println("Price: " + price);
        System.out.println("Imported: " + isImported);
        System.out.println();
    }
}
