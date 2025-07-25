public class Weapon {
    int weaponId;
    String type;
    String damage;
    String material;
    String range;
    boolean isLicensed;

    void getInformation() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Type: " + type);
        System.out.println("Damage: " + damage);
        System.out.println("Material: " + material);
        System.out.println("Range: " + range);
        System.out.println("Licensed: " + isLicensed);
        System.out.println();
    }
}
