public class Pistols {
    private String name;
    private String ammoType;
    private int magCap;
    private int fireRate;
    private int baseDamage;
    private int range;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public int getMagCap() {
        return magCap;
    }

    public void setMagCap(int magCap) {
        this.magCap = magCap;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }


    public Pistols() {

    }

    public Pistols(String name,String ammoType, int magCap, int fireRate, int baseDamage, int range) {
        this.name = name;
        this.ammoType = ammoType;
        this.magCap = magCap;
        this.fireRate = fireRate;
        this.baseDamage = baseDamage;
        this.range = range;
    }


    @Override
    public String toString() {
        return  name +'\'' +
                ", Ammo type = '" + ammoType +'\'' +
                ", magCap= '" + magCap + '\'' +
                ", fireRate = " + fireRate + "%"  +
                ", baseDamage = " + baseDamage + "%"  +
                ", range = " + range + "%" ;
    }
}
