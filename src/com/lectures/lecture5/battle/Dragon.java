package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public class Dragon extends Enemy {
    public Dragon(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        System.out.println(getName() + " поджигает противника");
        for (int i = 0; i < Math.random() * 10; i++) {
            hero.takeDamage(FIRE_DAMAGE_FOR_DRAGON);
        }

    }

    @Override
    public String toString() {
        return "Dragon{} " + super.toString();
    }
}
