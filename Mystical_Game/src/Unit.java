public abstract class Unit {
    private String name_;
    private int health_;
    private int max_health_;
    private int moves_;
    private MeleeWeapon melee_weapon_;
    private RangedWeapon ranged_weapon_;

    public Unit(String name, int health, int max_health, MeleeWeapon melee_weapon, RangedWeapon ranged_weapon) {
        this.name_ = name;
        this.health_ = health;
        this.max_health_ = max_health;
        this.melee_weapon_ = melee_weapon;
        this.ranged_weapon_ = ranged_weapon;
        this.moves_ = 0; // Set to default or another value as required
    }
    public void attack(Unit other, Weapon w) {
        Weapon ow = other.getMeleeWeapon();
        if (w.isRanged()) {
            ow = other.getRangedWeapon();
        }
        int maxStrikes = Math.max(w.getStrikes(), ow.getStrikes());
        for (int i = 0; i < maxStrikes; ++i) {
            if (isDead()) {
                return; // Your unit has lost
            }
            if (i < w.getStrikes()) {
                other.setHealth_(other.getHealth() - w.getDamage());
            }
            if (other.isDead()) {
                return;
            }
            if (i < ow.getStrikes()) {
                health_ -= ow.getDamage();
            }
        }
    }


    public abstract String type_name();

    public String getName() {
        return name_;
    }

    public int getHealth() {
        return health_;
    }

    public void setHealth_(int health_) {
        this.health_ = health_;
    }

    public int getMaxHealth() {
        return max_health_;
    }

    public int getMoves() {
        return moves_;
    }

    public boolean isDead() {
        return health_ < 0;
    }

    public MeleeWeapon getMeleeWeapon() {
        return melee_weapon_;
    }

    public RangedWeapon getRangedWeapon() {
        return ranged_weapon_;
    }


}
