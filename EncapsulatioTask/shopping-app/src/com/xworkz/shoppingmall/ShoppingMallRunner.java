package com.xworkz.shoppingmall;

import com.xworkz.shoppingmall.shop.Shop;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setShopId("S101");
        shop.setName("Trends Fashion");
        shop.setCategory("Clothing");
        shop.setOwner("Reliance Retail");
        shop.setLocation("Bangalore ");
        shop.setContactNumber("9645566258");

        com.xworkz.shoppingmall.ShoppingMall mall = new com.xworkz.shoppingmall.ShoppingMall();
        if (mall.addShop(shop)) {
            mall.getShopDetails();
        } else {
            System.out.println("FAILED TO GET SHOP DETAILS");
        }
    }
}
