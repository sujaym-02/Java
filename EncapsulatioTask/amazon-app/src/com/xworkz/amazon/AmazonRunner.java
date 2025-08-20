package com.xworkz.amazon;

import com.xworkz.amazon.amazonadd.Amazon;
import com.xworkz.amazon.product.Product;

public class AmazonRunner {
    public static void main(String[] ama) {
        Product product = new Product();
        product.setProductId("P1001");
        product.setProductName("Apple iPhone 16");
        product.setCategory("Smartphone");
        product.setPrice(79_999);
        product.setBrand("Apple");
        product.setRating("4.8/5");

        Amazon amazon = new Amazon();
        if (amazon.addProduct(product)){
            amazon.getProductDetails();
        } else System.out.println("FAILED TO GET PRODUCT DETAILS");
        amazon.updateProductPrice(59_999);
        if (amazon.updateProductPrice(product.getPrice())){
            System.out.println("AFTER UPDATING..........................................................................");
            amazon.getProductDetails();
        } else System.out.println("NOT UPDATED");
    }
}
