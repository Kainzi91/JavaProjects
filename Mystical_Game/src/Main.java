public class Main {

    public static void main(String[] args) {
        MeleeWeapon dagger = new MeleeWeapon("Dagger", 3, 3, WeaponType.BLADE, Weapon.WeaponSpecial.MAGICAL);
        RangedWeapon throwingKnives = new RangedWeapon("Throwing Knives", 2, 2, WeaponType.BLADE, Weapon.WeaponSpecial.FIRST_STRIKE);
        System.out.println(dagger);
        System.out.println(throwingKnives);

        DwarfishFighter pierre = new DwarfishFighter("Pierre");
        ElfishArcher sudhang = new ElfishArcher("Sudhang");

        System.out.println(pierre);
        System.out.println(sudhang);

        while (!pierre.isDead() && !sudhang.isDead()) {
            pierre.attack(sudhang, pierre.getMeleeWeapon());
            sudhang.attack(pierre, sudhang.getRangedWeapon());
        }

        if (sudhang.isDead()) {
            System.out.println(pierre + " won, " + sudhang + " is dead.");
        } else {
            System.out.println(sudhang + " won, " + pierre + " is dead.");
        }
    }
}