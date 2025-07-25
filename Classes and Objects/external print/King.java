public class King {
    int kingId;
    String name;
    String dynasty;
    String reignStart;
    String reignEnd;
    boolean isFamous;

    void getInformation() {
        System.out.println("King ID: " + kingId);
        System.out.println("Name: " + name);
        System.out.println("Dynasty: " + dynasty);
        System.out.println("Reign Start: " + reignStart);
        System.out.println("Reign End: " + reignEnd);
        System.out.println("Famous: " + isFamous);
        System.out.println();
    }
}
