package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.productvalidate.ProductValidate;

public class Amazon {

         Product product;

        public boolean addProduct(Product product) {
            boolean added = false;

            ProductValidate validator = new ProductValidate();
            boolean isValid = validator.validateProduct(product);

            if (isValid) {
                this.product = product;
                added = true;
            }

            return added;
        }
    public boolean updateProductPrice(double price){
        boolean isPriceUpdated = false;
        if (price>0){
            product.setPrice(price);
            isPriceUpdated = true;
        }
        return isPriceUpdated;
    }

        public void getProductInfo() {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: ₹" + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Seller: " + product.getSeller());
            System.out.println("Rating: " + product.getRating());
            System.out.println("Added On: " + product.getAddedOn());
        }


}

