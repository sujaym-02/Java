package com.xworkz.store;

import com.xworkz.store.app.Application;
import com.xworkz.store.playstore.PlayStore;

public class PlayStoreRunner {

    public static void main(String[] args){

        System.out.println("Main Started\n");

        Application app = new Application();
        app.setAppId(1);
        app.setAppName("WhatsApp");
        app.setVersion("2.25.21.82");
        app.setUpdatedOn("4/Aug/2025");
        app.setDownloads(100000000L);
        app.setRequiredOS("Android 5.0 and up");
        app.setOfferedBy("WhatsApp LLC");
        app.setReleasedOn("19 Oct 2010");

        PlayStore playStore = new PlayStore();
        /*if (playStore.addApplication(app) == true){
            System.out.println("App Added\n");
            playStore.getDetails();
        }*/

        boolean appAdded=playStore.addApplication(app);
        System.out.println("App Added \n");
        playStore.getDetails();


        System.out.println("\nMain Ended");

    }


}
