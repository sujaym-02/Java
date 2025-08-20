package com.xworkz.amazon.amazonadd;

import com.xworkz.amazon.product.Product;
import com.xworkz.amazon.validator.ProductValidator;

public class Amazon {
     Product product;

    public boolean addProduct(Product product) {
        boolean isProductAdded = false;
        ProductValidator validator = new ProductValidator();
        boolean validProduct = validator.productValid(product);

        if (validProduct) {
            this.product = product;
            System.out.println("PRODUCT ADDED TO AMAZON SUCCESSFULLY");
            isProductAdded = true;
        } else {
            System.out.println("ADDING PRODUCT FAILED");
        }
        return isProductAdded;
    }

    public boolean updateProductPrice(double price){
        boolean isPriceUpdated=false;
        if(price>0){
            product.setPrice(price);
            isPriceUpdated=true;
        }
        return isPriceUpdated;
    }

    public void getProductDetails() {

        System.out.println("PRODUCT ID   : " + product.getProductId());
        System.out.println("NAME         : " + product.getProductName());
        System.out.println("CATEGORY     : " + product.getCategory());
        System.out.println("PRICE        : " + product.getPrice());
        System.out.println("BRAND        : " + product.getBrand());
        System.out.println("RATING       : " + product.getRating());
    }
}
