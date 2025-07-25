class Casino {
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
