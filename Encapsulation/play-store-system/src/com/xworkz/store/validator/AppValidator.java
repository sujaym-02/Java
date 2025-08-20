package com.xworkz.store.validator;

import com.xworkz.store.app.Application;

public class AppValidator {

    Application application;

    public boolean validatedAppInfo(Application application) {
        boolean appVAlidated = false;

       boolean appIdValid = false;
       boolean appNameValid = false;
       boolean appVersionValid =false;
       boolean updatedOnValid = false;
       boolean downloadsValid = false;
       boolean requiredOsValid = false;
       boolean appOfferedValid = false;
       boolean appReleasedValid = false;

       if (application.getAppId()>0){
           appIdValid = true;
       }
       else System.out.println("Enter a Proper App Id");

       if (application.getAppName()!=null && !application.getAppName().isEmpty()){
           appNameValid = true;
       }
       else System.out.println("Enter A Proper App Name");

       if (application.getVersion()!=null && !application.getVersion().isEmpty()){
           appVersionValid = true;
       }
       else System.out.println("Enter Proper Version");

       if (application.getUpdatedOn()!=null && !application.getUpdatedOn().isEmpty()){
           updatedOnValid = true;
       }
       else System.out.println("Enter Proper Updation");

       if (application.getDownloads()>0){
           downloadsValid = true;
       }
       else System.out.println("Enyter Proper Downloads");

       if (application.getRequiredOS()!=null && !application.getRequiredOS().isEmpty()){
           requiredOsValid = true;
       }
       else System.out.println("Enter Proper Required OS");

       if (application.getOfferedBy()!=null && !application.getOfferedBy().isEmpty()){
           appOfferedValid = true;
       }
       else System.out.println("Enter Propered Offered");

       if (application.getReleasedOn()!=null && !application.getReleasedOn().isEmpty()){
           appReleasedValid = true;
       }
       else System.out.println("Enter Proper Release DAte");

       if (appIdValid && appNameValid && appVersionValid && updatedOnValid && downloadsValid && requiredOsValid
       && appOfferedValid && appReleasedValid == true){
           appVAlidated = true;
       }
       else System.out.println("App Is Not Validated\n");





        return appVAlidated;
    }


}
