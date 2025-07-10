class AssetManager {
    public static void approve(String model) {
        System.out.println("Asset Manager approved the issue of: " + model);
        Inventory.update(model);
    }
}
