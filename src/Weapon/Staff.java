package Weapon;

public class Staff extends Weapon{
    public Staff() {
        super(10);
    }

    @Override
    public String toString() {
        return "Staff, " + this.getDamage();
    }
}
