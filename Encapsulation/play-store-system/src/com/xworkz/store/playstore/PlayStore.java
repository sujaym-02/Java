package com.xworkz.store.playstore;


import com.xworkz.store.app.Application;
import com.xworkz.store.validator.AppValidator;

import java.util.SortedMap;

public class PlayStore {

    Application application;

    public boolean addApplication(Application application){
        boolean isAppAdded=false;
        boolean isAppInfoValid = false;

        AppValidator appValidator = new AppValidator();
        boolean appvalid = appValidator.validatedAppInfo(application);

        if (appvalid){
            isAppInfoValid = true;
            this.application = application;
            System.out.println("App Is Validated\n");
        }


        /*if (isAppInfoValid){
            isAppAdded = true;
        }*/
        //else System.out.println("App is Not Added\n");






        return isAppAdded;



    }


    public void getDetails() {
        System.out.println("---------App Details--------");
        System.out.println("App ID : "+application.getAppId());
        System.out.println("App Name : "+application.getAppName());
        System.out.println("App Version : "+application.getVersion());
        System.out.println("App Updated On : "+application.getUpdatedOn());
        System.out.println("App Downloads : "+application.getDownloads());
        System.out.println("App Required OS : "+application.getRequiredOS());
        System.out.println("App Offered By : "+application.getOfferedBy());
        System.out.println("App Realeased On : "+application.getReleasedOn());
    }
}
