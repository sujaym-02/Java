public class Network {

    Network() {
        System.out.println("Network Default Constructor is invoked");
    }


    Network(int networkId, String provider, double speed, String technology, String coverage, double price) {
        System.out.println("Network Parameterized Constructor is invoked");
        this.networkId = networkId;
        this.provider = provider;
        this.speed = speed;
        this.technology = technology;
        this.coverage = coverage;
        this.price = price;
    }

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
