package com.lectures.lecture5.battle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 022 22.06.17.
 */
public class BattleGround {
    public static void main(String[] args) {


        Hero warrior = new Warrior("Warrior", Mortal.HEALTH_WARRIOR, Mortal.ATTACK_POWER_WARRIOR);
        Hero mage = new Mage("Mage", Mortal.HEALTH_MAGE, Mortal.ATTACK_POWER_MAGE);
        Hero archer = new Archer("Archer", Mortal.HEALTH_ARCHER, Mortal.ATTACK_POWER_ARCHER);

        Enemy zombie = new Zombie("Zombie", Mortal.HEALTH_ZOMBIE, Mortal.ATTACK_POWER_ZOMBIE);
        Enemy dragon = new Dragon("Dragon", Mortal.HEALTH_DRAGON, Mortal.ATTACK_POWER_DRAGON);
        Enemy vampire = new Vampire("Vampire", Mortal.HEALTH_VAMPIRE, Mortal.ATTACK_POWER_VAMPIRE);

        while ((vampire.isAlive() || zombie.isAlive() || dragon.isAlive()) && (mage.isAlive()/*||warrior.isAlive()||archer.isAlive()*/)) {

            if (mage.isAlive() && vampire.isAlive()) {
                mage.attack(vampire);
            }
            if (vampire.isAlive() && mage.isAlive()) {
                vampire.attack(mage);
            }
            if (mage.isAlive() && zombie.isAlive()) {
                mage.attack(zombie);
            }
            if (mage.isAlive() && zombie.isAlive()) {
                zombie.attack(mage);
            }
            if (mage.isAlive() && dragon.isAlive()) {
                mage.attack(dragon);
            }
            if (mage.isAlive() && dragon.isAlive()) {
                dragon.attack(mage);
            }

        }
    }

}

