package Characters;

import Shields.ZeroShield;
import Weapon.Bow;

public class Archer extends Warrior<Bow, ZeroShield>{
    Integer shootDistanation;

    public Archer(String name, Bow weapon, ZeroShield shield, Integer healthPoint, Integer shootDistanation) {
        super(name, weapon, shield, healthPoint);
        this.shootDistanation = shootDistanation;
    }


    @Override
    public String toString() {
        return "Archer, " + super.toString() + ", shootDistanation= " + shootDistanation;
    }
}
