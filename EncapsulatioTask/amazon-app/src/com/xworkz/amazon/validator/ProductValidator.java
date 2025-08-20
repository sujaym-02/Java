package com.xworkz.amazon.validator;

import com.xworkz.amazon.product.Product;

public class ProductValidator {

    public boolean productValid(Product product) {
        boolean isProductValid = false;
        boolean idValid = false;
        boolean nameValid = false;
        boolean categoryValid = false;
        boolean priceValid = false;
        boolean brandValid = false;
        boolean ratingValid = false;

        if (product.getProductId() != null && !product.getProductId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("PRODUCT ID NOT VALID");
        }

        if (product.getProductName() != null && !product.getProductName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("PRODUCT NAME NOT VALID");
        }

        if (product.getCategory() != null && !product.getCategory().isEmpty()) {
            categoryValid = true;
        } else {
            System.out.println("CATEGORY NOT VALID");
        }

        if (product.getPrice() >0){
            priceValid = true;
        } else {
            System.out.println("PRICE NOT VALID");
        }

        if (product.getBrand() != null && !product.getBrand().isEmpty()) {
            brandValid = true;
        } else {
            System.out.println("BRAND NOT VALID");
        }

        if (product.getRating() != null && !product.getRating().isEmpty()) {
            ratingValid = true;
        } else {
            System.out.println("RATING NOT VALID");
        }

        if (idValid && nameValid && categoryValid && priceValid && brandValid && ratingValid) {
            isProductValid = true;
        }

        return isProductValid;
    }
}
