class Casino {

    Casino() {
        System.out.println("Casino Default Constructor is invoked");
    }


    Casino(int casinoId, String name, String location, double rating, double entryFee, boolean isOpen24x7) {
        System.out.println("Casino Parameterized Constructor is invoked");
        this.casinoId = casinoId;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.entryFee = entryFee;
        this.isOpen24x7 = isOpen24x7;
    }

    int casinoId;
    String name;
    String location;
    double rating;
    double entryFee;
    boolean isOpen24x7;

    void getInformation() {
        System.out.println("casinoId: " + casinoId);
        System.out.println("name: " + name);
        System.out.println("location: " + location);
        System.out.println("rating: " + rating);
        System.out.println("entryFee: " + entryFee);
        System.out.println("isOpen24x7: " + isOpen24x7);
        System.out.println();
    }
}
