public class Pipe {
    int pipeId;
    String material;
    double diameter;
    double length;
    String color;
    String usage;

    void getInformation() {
        System.out.println("Pipe ID: " + pipeId);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter);
        System.out.println("Length: " + length);
        System.out.println("Color: " + color);
        System.out.println("Usage: " + usage);
        System.out.println();
    }
}
