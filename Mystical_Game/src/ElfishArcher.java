public class ElfishArcher extends Unit {
    public ElfishArcher(String name) {
        super(name, 29, 6, new MeleeWeapon("Sword", 5, 2, WeaponType.BLADE, Weapon.WeaponSpecial.FIRST_STRIKE),
                new RangedWeapon("Bow", 5, 4, WeaponType.PIERCE, Weapon.WeaponSpecial.MAGICAL));
    }

    @Override
    public String type_name() {
        return "Elfish Archer";
    }
}
