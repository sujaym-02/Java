public class Weapon {

	Weapon(){
	System.out.println("Constructor is Invoked");
	}

	Weapon(int weaponId,String type,String damage,String material,String range,boolean isLicensed){

    this.weaponId= weaponId;
    this.type= type;
    this.damage= damage;
    this.material= material;
    this.range= range;
    this.isLicensed= isLicensed;
	
	}
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
