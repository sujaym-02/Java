package com.xworkz.watchshop.validator;

import com.xworkz.watchshop.watch.Watch;

public class WatchValidator {

    public boolean watchValid(Watch watch) {
        boolean isWatchValid = false;
        boolean idValid = false;
        boolean brandValid = false;
        boolean modelValid = false;
        boolean priceValid = false;
        boolean typeValid = false;
        boolean warrantyValid = false;

        if (watch.getWatchId() != null && !watch.getWatchId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("WATCH ID NOT VALID");
        }

        if (watch.getBrand() != null && !watch.getBrand().isEmpty()) {
            brandValid = true;
        } else {
            System.out.println("BRAND NOT VALID");
        }

        if (watch.getModel() != null && !watch.getModel().isEmpty()) {
            modelValid = true;
        } else {
            System.out.println("MODEL NOT VALID");
        }

        if (watch.getPrice() != null && !watch.getPrice().isEmpty()) {
            priceValid = true;
        } else {
            System.out.println("PRICE NOT VALID");
        }

        if (watch.getType() != null && !watch.getType().isEmpty()) {
            typeValid = true;
        } else {
            System.out.println("TYPE NOT VALID");
        }

        if (watch.getWarranty() != null && !watch.getWarranty().isEmpty()) {
            warrantyValid = true;
        } else {
            System.out.println("WARRANTY NOT VALID");
        }

        if (idValid && brandValid && modelValid && priceValid && typeValid && warrantyValid) {
            isWatchValid = true;
        }

        return isWatchValid;
    }
}
