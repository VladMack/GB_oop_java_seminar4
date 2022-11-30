package Characters;

import Shields.MagicalShield;
import Weapon.Staff;

public class Mage extends Warrior<Staff, MagicalShield>{
    Integer distance;
    Integer mana;

    public Mage(String name, Staff weapon, MagicalShield shield, Integer healthPoint, Integer distance, Integer mana) {
        super(name, weapon, shield, healthPoint);
        this.distance = distance;
        this.mana = mana;
    }


    @Override
    public String toString() {
        return "Mage, " + super.toString() + ", shootDistanation= " + distance + ", mana= " + mana;
    }
}
