public class Marble {
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
