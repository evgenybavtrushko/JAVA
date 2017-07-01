package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public class Archer extends Hero {

    public Archer(String name, int health, int attack) {
        super(name, health, attack);
    }


    @Override
    public void attack(Enemy enemy) {
        System.out.println("Archer стреляет во врага");
        int i = 0;
        while (i < NUMBER_OF_SHOTS_ARCHER && enemy.isAlive()) {
            if (Math.random() * 100 > PROBABILITY_OF_A_MISS_ARCHER) {
                System.out.println("\n" + getName() + " промохнулся\n");
                i++;
            } else {
                i++;
                enemy.takeDamage(getAttack());
            }
        }

    }

    @Override
    public String toString() {
        return "Archer{} " + super.toString();
    }
}
