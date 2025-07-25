public class Politician {
    int politicianId;
    String name;
    String party;
    int age;
    String state;
    boolean isCorrupt;

    void getInformation() {
        System.out.println("Politician ID: " + politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Age: " + age);
        System.out.println("State: " + state);
        System.out.println("Is Corrupt: " + isCorrupt);
        System.out.println();
    }
}
