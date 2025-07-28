class Blade {

    Blade() {
        System.out.println("Blade Default Constructor is invoked");
    }


    Blade(int bladeId, String brand, String material, double price, int quantity, String type) {
        System.out.println("Blade Parameterized Constructor is invoked");
        this.bladeId = bladeId;
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    int bladeId;
    String brand;
    String material;
    double price;
    int quantity;
    String type;

    void getInformation() {
        System.out.println("bladeId: " + bladeId);
        System.out.println("brand: " + brand);
        System.out.println("material: " + material);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);
        System.out.println("type: " + type);
        System.out.println();
    }
}
