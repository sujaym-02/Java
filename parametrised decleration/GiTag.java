public class GiTag {
        GiTag() {
        System.out.println("GiTag Default Constructor is invoked");
    }

        GiTag(int tagId, String product, String origin, boolean isHandmade, boolean isCertified, String yearAwarded) {
        System.out.println("GiTag Parameterized Constructor is invoked");
        this.tagId = tagId;
        this.product = product;
        this.origin = origin;
        this.isHandmade = isHandmade;
        this.isCertified = isCertified;
        this.yearAwarded = yearAwarded;
    }

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
