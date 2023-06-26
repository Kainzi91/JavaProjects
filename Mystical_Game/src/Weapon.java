public class Weapon {


    public enum WeaponSpecial {
        FIRST_STRIKE,
        MAGICAL,
        NONE,
        PLAGUE,
        POISON
    }

    private String name;
    private int damage;
    private int strikes;
    private WeaponType type;
    private WeaponSpecial special;

    public Weapon(String name, int damage, int strikes, WeaponType type, WeaponSpecial special) {
        this.name = name;
        this.damage = damage;
        this.strikes = strikes;
        this.type = type;
        this.special = special;
    }

    public Weapon(String name, int damage, int strikes, WeaponType type) {
        this(name, damage, strikes, type, WeaponSpecial.NONE);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getStrikes() {
        return strikes;
    }

    public WeaponType getType() {
        return type;
    }

    public WeaponSpecial getSpecial() {
        return special;
    }

    public boolean isRanged() {
        return false;
    }

    public boolean isMelee() {
        return !isRanged();
    }
}
