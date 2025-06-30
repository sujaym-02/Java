class Satellite {

    static String name ;
    static String purpose ;
    static String orbitType ;
    static double massKg ;
    static double powerWatts ;
    static int launchYear ;
    static boolean isActive ;
    static String operator ;
    static String launchVehicle;
    static String communicationBand ;
    static boolean hasCamera;
    static boolean hasSolarPanels ;
    static String telemetrySystem ;
    static boolean isReusable ;
    static boolean hasOnboardStorage;
    static String controlCenter ;
    static boolean realTimeTransmission ;
    static int altitudeKm ;
    static boolean thermalProtection ;
    static String countryOfOrigin ;

	public static void main (String police[]){

        System.out.println("Satellite Name: " + name);
        System.out.println("Purpose: " + purpose);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Mass: " + massKg + " kg");
        System.out.println("Power: " + powerWatts + " W");
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Is Active: " + isActive);
        System.out.println("Operator: " + operator);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Communication Band: " + communicationBand);
        System.out.println("Has Camera: " + hasCamera);
        System.out.println("Has Solar Panels: " + hasSolarPanels);
        System.out.println("Telemetry System: " + telemetrySystem);
        System.out.println("Is Reusable: " + isReusable);
        System.out.println("Onboard Storage: " + hasOnboardStorage);
        System.out.println("Control Center: " + controlCenter);
        System.out.println("Real-Time Transmission: " + realTimeTransmission);
        System.out.println("Altitude: " + altitudeKm + " km");
        System.out.println("Thermal Protection: " + thermalProtection);
        System.out.println("Country of Origin: " + countryOfOrigin);

    name = "INSAT-3D";
    purpose = "Weather Monitoring";
    orbitType = "Geostationary";
    massKg = 2060;
    powerWatts = 1700;
    launchYear = 2013;
    isActive = true;
    operator = "ISRO";
    launchVehicle = "GSLV-D5";
    communicationBand = "C and Ku";
    hasCamera = true;
    hasSolarPanels = true;
    telemetrySystem = "S-Band";
    isReusable = false;
    hasOnboardStorage = true;
    controlCenter = "Hassan";
    realTimeTransmission = true;
    altitudeKm = 35786;
    thermalProtection = true;
    countryOfOrigin = "India";


        System.out.println("Satellite Name: " + name);
        System.out.println("Purpose: " + purpose);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Mass: " + massKg + " kg");
        System.out.println("Power: " + powerWatts + " W");
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Is Active: " + isActive);
        System.out.println("Operator: " + operator);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Communication Band: " + communicationBand);
        System.out.println("Has Camera: " + hasCamera);
        System.out.println("Has Solar Panels: " + hasSolarPanels);
        System.out.println("Telemetry System: " + telemetrySystem);
        System.out.println("Is Reusable: " + isReusable);
        System.out.println("Onboard Storage: " + hasOnboardStorage);
        System.out.println("Control Center: " + controlCenter);
        System.out.println("Real-Time Transmission: " + realTimeTransmission);
        System.out.println("Altitude: " + altitudeKm + " km");
        System.out.println("Thermal Protection: " + thermalProtection);
        System.out.println("Country of Origin: " + countryOfOrigin);
    }
}