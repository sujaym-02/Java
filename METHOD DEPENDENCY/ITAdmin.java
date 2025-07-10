class ITAdmin {
    public static void checkAvailability(String model) {
        System.out.println("IT Admin checking availability for: " + model);
        AssetManager.approve(model);
    }
}
