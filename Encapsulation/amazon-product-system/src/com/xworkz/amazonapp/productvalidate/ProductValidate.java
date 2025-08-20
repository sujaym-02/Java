package com.xworkz.amazonapp.productvalidate;

import com.xworkz.amazonapp.product.Product;

public class ProductValidate {

    Product product;

        public boolean validateProduct(Product product) {
            boolean validated = false;

            boolean idValid = false;
            boolean nameValid = false;
            boolean categoryValid = false;
            boolean priceValid = false;
            boolean quantityValid = false;
            boolean sellerValid = false;
            boolean ratingValid = false;
            boolean addedOnValid = false;

            if (product.getProductId() != null && !product.getProductId().isEmpty()) {
                idValid = true;
            } else System.out.println("Invalid Product ID");

            if (product.getName() != null && !product.getName().isEmpty()) {
                nameValid = true;
            } else System.out.println("Invalid Product Name");

            if (product.getCategory() != null && !product.getCategory().isEmpty()) {
                categoryValid = true;
            } else System.out.println("Invalid Category");

            if (product.getPrice() > 0) {
                priceValid = true;
            } else System.out.println("Invalid Price");

            if (product.getQuantity() > 0) {
                quantityValid = true;
            } else System.out.println("Invalid Quantity");

            if (product.getSeller() != null && !product.getSeller().isEmpty()) {
                sellerValid = true;
            } else System.out.println("Invalid Seller");

            if (product.getRating() >= 0 && product.getRating() <= 5) {
                ratingValid = true;
            } else System.out.println("Invalid Rating");

            if (product.getAddedOn() != null && !product.getAddedOn().isEmpty()) {
                addedOnValid = true;
            } else System.out.println("Invalid Added Date");

            if (idValid && nameValid && categoryValid && priceValid && quantityValid &&
                    sellerValid && ratingValid && addedOnValid) {
                validated = true;
            }

            return validated;


        }

}

