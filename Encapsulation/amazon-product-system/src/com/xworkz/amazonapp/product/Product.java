package com.xworkz.amazonapp.product;

public class Product {

        private String productId;
        private String name;
        private String category;
        private double price;
        private int quantity;
        private String seller;
        private double rating;
        private String addedOn;


        public String getProductId() {
            return productId;
        }
        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }
        public void setCategory(String category) {
            this.category = category;
        }

        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getSeller() {
            return seller;
        }
        public void setSeller(String seller) {
            this.seller = seller;
        }

        public double getRating() {
            return rating;
        }
        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getAddedOn() {
            return addedOn;
        }
        public void setAddedOn(String addedOn) {
            this.addedOn = addedOn;
        }
    }

