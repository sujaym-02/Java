public class Karate {

    Karate() {
        System.out.println("Karate Default Constructor is invoked");
    }


    Karate(int studentId, String name, String belt, String level, int age, boolean isChampion) {
        System.out.println("Karate Parameterized Constructor is invoked");
        this.studentId = studentId;
        this.name = name;
        this.belt = belt;
        this.level = level;
        this.age = age;
        this.isChampion = isChampion;
    }

    int studentId;
    String name;
    String belt;
    String level;
    int age;
    boolean isChampion;

    void getInformation() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Belt: " + belt);
        System.out.println("Level: " + level);
        System.out.println("Age: " + age);
        System.out.println("Champion: " + isChampion);
        System.out.println();
    }
}
