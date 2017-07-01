package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public class Warrior extends Hero {


    public Warrior(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void takeDamage(int damage) {
        if (Math.random() * 100 > PROBABILITY_OF_BLOCKING_DAMAGE) {
            super.takeDamage(damage);
        } else {
            System.out.println("Warrior \n заблокировал урон");
            if (getHealth() > 0)
                System.out.println("Осталось здоровья " + getHealth());

        }
    }


    @Override
    public String toString() {
        return "Warrior " + getName() + " health " + getHealth();
    }
}
