public class Pipe {

    Pipe() {
        System.out.println("Pipe Default Constructor is invoked");
    }


    Pipe(int pipeId, String material, double diameter, double length, String color, String usage) {
        System.out.println("Pipe Parameterized Constructor is invoked");
        this.pipeId = pipeId;
        this.material = material;
        this.diameter = diameter;
        this.length = length;
        this.color = color;
        this.usage = usage;
    }

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
