package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public class Mage extends Hero {

    public Mage(String name, int health, int attack) {
        super(name, health, attack);
    }


    @Override
    public void attack(Enemy mortal) {
        System.out.println("Mage атакует врага");
        if (Math.random() * 100 > PROBABILITY_OF_CRITICAL_DAMAGE) {
            mortal.takeDamage(getAttack());
        } else {
            System.out.println(getName() + " наносит критический урон");
            mortal.takeDamage(getAttack() * 2);
        }


    }


    @Override
    public String toString() {
        return "Mage{} " + super.toString();
    }
}

