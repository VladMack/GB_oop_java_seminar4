package Characters;

import Shields.Shield;
import Weapon.Weapon;

public abstract class Warrior<T extends Weapon, E extends Shield> {
    private String name;
    private T weapon;
    private E shield;
    private Integer healthPoint;

    public Warrior(String name, T weapon,E shield, Integer healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    @Override
    public String toString() {
        return "name= " + name +
                ", weapon= " + weapon +
                ", shield= " + shield +
                ", healthPoint= " + healthPoint;
    }

    public E getShield() {
        return shield;
    }
}
