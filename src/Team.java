import Characters.Hero;
import Characters.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T>{

    private Hero hero;
    private List<T> teammates = new ArrayList<>();


    public Team(Hero hero) {
        this.hero = hero;
    }

    public void add(T character) {
        teammates.add(character);
    }

    @Override
    public Iterator<T> iterator() {
        return teammates.iterator();
    }

    @Override
    public String toString() {
        StringBuilder teamToString = new StringBuilder(hero.toString());
        for (T warrior : this) {
            teamToString.append(warrior.toString() + "\n");
        }

        return teamToString.toString();
    }

    public Integer getTeamHP() {
        Integer teamHP = this.hero.getHealthPoint();
        for (T warrior : this) {
            teamHP += warrior.getHealthPoint();
        }
        return teamHP;
    }

    public List<T> getTeammates() {
        return teammates;
    }
}
