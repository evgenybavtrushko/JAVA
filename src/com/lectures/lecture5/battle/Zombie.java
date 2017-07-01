package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public class Zombie extends Enemy {
    public Zombie(String name, int health, int attack) {
        super(name, health, attack);

    }

    private String resurrected = "";

    @Override
    public boolean isAlive() {

        boolean x = false;
        if (getHealth() <= 0 && !(resurrected.equals("Resurrected "))) {
            setHealth(150);
            resurrected = "Resurrected ";
            System.out.println("\n" + getName() + " воскрес" + "\n");
            x = true;
        } else if (getHealth() > 0) {
            x = true;
        }
        return x;
    }

    @Override
    public String toString() {
        return resurrected + " Zombie " + "health " + getHealth();
    }
}
