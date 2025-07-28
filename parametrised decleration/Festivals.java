public class Festivals {

    Festivals() {
        System.out.println("Festivals Default Constructor is invoked");
    }


    Festivals(int festivalId, String name, String region, boolean isReligious, double duration, String month) {
        System.out.println("Festivals Parameterized Constructor is invoked");
        this.festivalId = festivalId;
        this.name = name;
        this.region = region;
        this.isReligious = isReligious;
        this.duration = duration;
        this.month = month;
    }

    int festivalId;
    String name;
    String region;
    boolean isReligious;
    double duration;
    String month;

    void getInformation() {
        System.out.println("ID :" + festivalId);
        System.out.println("Name : " + name);
        System.out.println("Region : " + region);
        System.out.println("Is Religious : " + isReligious);
        System.out.println("Duration : " + duration);
        System.out.println("Month : " + month);
        System.out.println();
    }
}
