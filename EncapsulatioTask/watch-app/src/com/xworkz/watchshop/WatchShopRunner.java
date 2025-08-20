package com.xworkz.watchshop;

import com.xworkz.watchshop.watch.Watch;
import com.xworkz.watchshop.watchadd.WatchShop;

public class WatchShopRunner {
    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.setWatchId("70");
        watch.setBrand("Rolex");
        watch.setModel("Perpetual");
        watch.setPrice("8,50,000");
//        watch.setType("Analog");
        watch.setWarranty("7 Years");

        WatchShop shop = new WatchShop();
        if (shop.addWatch(watch)) {
            shop.getWatchDetails();
        } else {
            System.out.println("FAILED TO GET WATCH DETAILS");
        }
    }
}
