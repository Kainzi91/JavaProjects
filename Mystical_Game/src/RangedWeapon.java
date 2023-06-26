public class RangedWeapon extends Weapon {
    public RangedWeapon(String name, int damage, int strikes, WeaponType type, WeaponSpecial special) {
        super(name, damage, strikes, type, special);
    }

    @Override
    public boolean isRanged() {
        return true;
    }
}