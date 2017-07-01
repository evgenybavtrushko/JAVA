package com.lectures.lecture5.battle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 025 25.06.17.
 */
public class Battle {
    public static void main(String[] args) {

        List<Hero> heroList = new ArrayList<>();
        heroList.add(new Warrior("Warrior", Mortal.HEALTH_WARRIOR, Mortal.ATTACK_POWER_WARRIOR));
        heroList.add(new Mage("Mage", Mortal.HEALTH_MAGE, Mortal.ATTACK_POWER_MAGE));
        heroList.add(new Archer("Archer", Mortal.HEALTH_ARCHER, Mortal.ATTACK_POWER_ARCHER));
        List<Enemy> enemyList = new ArrayList<>();
        enemyList.add(new Zombie("Zombie", Mortal.HEALTH_ZOMBIE, Mortal.ATTACK_POWER_ZOMBIE));
        enemyList.add(new Dragon("Dragon", Mortal.HEALTH_DRAGON, Mortal.ATTACK_POWER_DRAGON));
        enemyList.add(new Vampire("Vampire", Mortal.HEALTH_VAMPIRE, Mortal.ATTACK_POWER_VAMPIRE));


        while ((enemyList.get(0).isAlive()) && (heroList.get(0).isAlive())) {

            if (heroList.get(0).isAlive() && enemyList.get(0).isAlive()) {
                heroList.get(0).attack(enemyList.get(0));
            }
            if (enemyList.get(0).isAlive() && heroList.get(0).isAlive()) {
                enemyList.get(0).attack(heroList.get(0));
            }

            if (!(heroList.get(0).isAlive())) {
                heroList.remove(0);
            }
            if (!(enemyList.get(0).isAlive())) {
                enemyList.remove(0);
            }
            if ((heroList.isEmpty()) || (enemyList.isEmpty())) {

                if ((heroList.isEmpty())) {
                    System.out.println("Монстры победили!!!");
                } else if ((enemyList.isEmpty())) {
                    System.out.println("Герои победили!!!");
                }
                return;
            }
        }
    }
}



