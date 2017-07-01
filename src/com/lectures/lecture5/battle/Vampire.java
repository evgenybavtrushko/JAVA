package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public class Vampire extends Enemy {

    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        if (hero.getHealth() > 0) {
            setHealth(getHealth() + (int) (PERCENTAGE_OF_VAMPIRE_HEALTH_UPGRADE / 100 * (hero.getHealth())));
            System.out.println(getName() + " востанавливает " + (int) (PERCENTAGE_OF_VAMPIRE_HEALTH_UPGRADE / 100 * (hero.getHealth())) + " здоровья");
        }
    }


    public Vampire(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public String toString() {
        return "Vampire{} " + super.toString();
    }
}
