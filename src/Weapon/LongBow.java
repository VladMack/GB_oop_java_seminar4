package Weapon;

public class LongBow extends Bow{

    public Integer damage() {
        return 20;
    }

    public String toString() {
        return "LongBow, " + damage();
    }
}
