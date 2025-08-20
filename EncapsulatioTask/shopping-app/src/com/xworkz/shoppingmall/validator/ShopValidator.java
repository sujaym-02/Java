package com.xworkz.shoppingmall.validator;

import com.xworkz.shoppingmall.shop.Shop;

public class ShopValidator {

    public boolean shopValid(Shop shop) {
        boolean isShopValid = false;
        boolean idValid = false;
        boolean nameValid = false;
        boolean categoryValid = false;
        boolean ownerValid = false;
        boolean locationValid = false;
        boolean contactValid = false;

        if (shop.getShopId() != null && !shop.getShopId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("SHOP ID NOT VALID");
        }

        if (shop.getName() != null && !shop.getName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("SHOP NAME NOT VALID");
        }

        if (shop.getCategory() != null && !shop.getCategory().isEmpty()) {
            categoryValid = true;
        } else {
            System.out.println("CATEGORY NOT VALID");
        }

        if (shop.getOwner() != null && !shop.getOwner().isEmpty()) {
            ownerValid = true;
        } else {
            System.out.println("OWNER NOT VALID");
        }

        if (shop.getLocation() != null && !shop.getLocation().isEmpty()) {
            locationValid = true;
        } else {
            System.out.println("LOCATION NOT VALID");
        }

        if (shop.getContactNumber() != null && !shop.getContactNumber().isEmpty()) {
            contactValid = true;
        } else {
            System.out.println("CONTACT NUMBER NOT VALID");
        }

        if (idValid && nameValid && categoryValid && ownerValid && locationValid && contactValid) {
            isShopValid = true;
        }

        return isShopValid;
    }
}
