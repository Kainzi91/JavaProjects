public class DwarfishFighter extends Unit {


    public DwarfishFighter(String name) {
        super(name, 38, 4, new MeleeWeapon("Axe", 7, 3, WeaponType.BLADE, Weapon.WeaponSpecial.MAGICAL),
                new RangedWeapon("None", 0, 0, WeaponType.NONE, Weapon.WeaponSpecial.FIRST_STRIKE));
    }

    @Override
    public String type_name() {
        return "Dwarfish Fighter";
    }



}
