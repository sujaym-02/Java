public class Network {
    int networkId;
    String provider;
    double speed;
    String technology;
    String coverage;
    double price;

    void getInformation() {
        System.out.println("Network ID: " + networkId);
        System.out.println("Provider: " + provider);
        System.out.println("Speed: " + speed + " Mbps");
        System.out.println("Technology: " + technology);
        System.out.println("Coverage: " + coverage);
        System.out.println("Price: ₹" + price);
        System.out.println();
    }
}
