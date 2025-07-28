public class King {

    King() {
        System.out.println("King Default Constructor is invoked");
    }


    King(int kingId, String name, String dynasty, String reignStart, String reignEnd, boolean isFamous) {
        System.out.println("King Parameterized Constructor is invoked");
        this.kingId = kingId;
        this.name = name;
        this.dynasty = dynasty;
        this.reignStart = reignStart;
        this.reignEnd = reignEnd;
        this.isFamous = isFamous;
    }

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
