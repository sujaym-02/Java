package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.productvalidate.ProductValidate;

public class AmazonRunner {

        public static void main(String[] args) {
            System.out.println("Amazon product management started...");

            Product product = new Product();
            product.setProductId("AMZ001");
            product.setName("Iphone 16");
            product.setCategory("Mobile");
            product.setPrice(89999.99);
            product.setQuantity(50);
            product.setSeller("Apple Store");
            product.setRating(4.4);
            product.setAddedOn("21/10/2024");

            Amazon amazon = new Amazon();
            boolean added = amazon.addProduct(product);
            System.out.println("Product added: " + added);

            if (added) {
                amazon.getProductInfo();
            }

            amazon.updateProductPrice(69999.99);
            if (amazon.updateProductPrice(product.getPrice())){
                System.out.println("\nafter Updating\n");
                //amazon.getProductInfo();
                System.out.println("Updated Price :"+product.getPrice());
            }else System.out.println("Not updated");
    }
}
