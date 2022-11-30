package Weapon;

public class Bow extends Weapon{
    public Bow() {
        super(15);
    }

    @Override
    public String toString() {
        return "Bow, " + getDamage();
    }
}
