package com.xworkz.watchshop.watch;

public class Watch {
    private String watchId;
    private String brand;
    private String model;
    private String price;
    private String type; // Analog / Digital / Smart
    private String warranty;

    public String getWatchId() {
        return watchId;
    }
    public void setWatchId(String watchId) {
        this.watchId = watchId;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getWarranty() {
        return warranty;
    }
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
}
