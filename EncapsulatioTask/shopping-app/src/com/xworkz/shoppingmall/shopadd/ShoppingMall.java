package com.xworkz.shoppingmall;

import com.xworkz.shoppingmall.shop.Shop;
import com.xworkz.shoppingmall.validator.ShopValidator;

public class ShoppingMall {
    private Shop shop;

    public boolean addShop(Shop shop) {
        boolean isShopAdded = false;
        ShopValidator validator = new ShopValidator();
        boolean validShop = validator.shopValid(shop);

        if (validShop) {
            this.shop = shop;
            System.out.println("SHOP ADDED SUCCESSFULLY TO MALL");
            isShopAdded = true;
        } else {
            System.out.println("ADDING SHOP FAILED");
        }

        return isShopAdded;
    }

    public void getShopDetails() {
        if (shop == null) {
            System.out.println("NO SHOP AVAILABLE");
            return;
        }

        System.out.println("SHOP ID   : " + shop.getShopId());
        System.out.println("NAME      : " + shop.getName());
        System.out.println("CATEGORY  : " + shop.getCategory());
        System.out.println("OWNER     : " + shop.getOwner());
        System.out.println("LOCATION  : " + shop.getLocation());
        System.out.println("CONTACT   : " + shop.getContactNumber());
    }
}
