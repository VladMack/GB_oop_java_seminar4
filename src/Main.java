import Characters.*;
import Shields.MagicalShield;
import Shields.SuperShield;
import Shields.ZeroShield;
import Weapon.Arbalet;
import Weapon.Bow;
import Weapon.LongBow;
import Weapon.Staff;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hero1", new Staff(), new SuperShield(), 150);

        Team<Archer> team1 = new Team<>(hero1);
        team1.add(new Archer("Archer1", new Bow(), new ZeroShield(), 80, 10));
        team1.add(new Archer("Archer2", new LongBow(), new ZeroShield(), 75, 10));

        Team<Warrior> team2 = new Team<>(hero1);
        team2.add(new Archer("Archer3", new Bow(),new ZeroShield(), 80, 10));
        team2.add(new Mage("Mage1", new Staff(), new MagicalShield(), 90, 5, 30));


        printTeamBalance(team1, team2);

        attack(team2.getTeammates().get(1), team1.getTeammates().get(0));

        printTeamBalance(team1, team2);

    }

    public static void attack(Warrior attacker, Warrior defender) {
        Integer realDamage = (int)
                (attacker.getWeapon().getDamage() / defender.getShield().getShieldRatio());
        defender.setHealthPoint(defender.getHealthPoint() - realDamage);
        System.out.format("%s атакует %s. %s применяет щит на %,.1f и получает %d урона," +
                "осталось %d HP.\n\n",
                attacker.getName(), defender.getName(), defender.getName(),
                defender.getShield().getShieldRatio(), realDamage, defender.getHealthPoint());
    }

    public static void printTeamBalance(Team team1, Team team2) {
        System.out.println(team1);
        System.out.println(team2);
    }
}