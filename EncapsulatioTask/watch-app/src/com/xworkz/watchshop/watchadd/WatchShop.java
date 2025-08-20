package com.xworkz.watchshop.watchadd;

import com.xworkz.watchshop.watch.Watch;
import com.xworkz.watchshop.validator.WatchValidator;

public class WatchShop {
    private Watch watch;

    public boolean addWatch(Watch watch) {
        boolean isWatchAdded = false;
        WatchValidator validator = new WatchValidator();
        boolean validWatch = validator.watchValid(watch);

        if (validWatch) {
            this.watch = watch;
            System.out.println("WATCH ADDED SUCCESSFULLY TO SHOP");
            isWatchAdded = true;
        } else {
            System.out.println("ADDING WATCH FAILED");
        }

        return isWatchAdded;
    }

    public void getWatchDetails() {

        System.out.println("WATCH ID   : " + watch.getWatchId());
        System.out.println("BRAND      : " + watch.getBrand());
        System.out.println("MODEL      : " + watch.getModel());
        System.out.println("PRICE      : " + watch.getPrice());
        System.out.println("TYPE       : " + watch.getType());
        System.out.println("WARRANTY   : " + watch.getWarranty());
    }
}
