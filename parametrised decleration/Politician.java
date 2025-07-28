public class Politician {

    Politician() {
        System.out.println("Politician Default Constructor is invoked");
    }


    Politician(int politicianId, String name, String party, int age, String state, boolean isCorrupt) {
        System.out.println("Politician Parameterized Constructor is invoked");
        this.politicianId = politicianId;
        this.name = name;
        this.party = party;
        this.age = age;
        this.state = state;
        this.isCorrupt = isCorrupt;
    }

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
