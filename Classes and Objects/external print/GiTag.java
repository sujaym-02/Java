public class GiTag {
    int tagId;
    String product;
    String origin;
    boolean isHandmade;
    boolean isCertified;
    String yearAwarded;

    void getInformation() {
        System.out.println("Tag ID: " + tagId);
        System.out.println("Product: " + product);
        System.out.println("Origin: " + origin);
        System.out.println("Handmade: " + isHandmade);
        System.out.println("Certified: " + isCertified);
        System.out.println("Year Awarded: " + yearAwarded);
        System.out.println();
    }
}
