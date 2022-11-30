package Weapon;

public abstract class Weapon{
    Integer damage;


    public Weapon(Integer damage) {
        this.damage = damage;
    }

    public Integer getDamage() {
        return damage;
    }
}
