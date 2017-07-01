package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public interface Mortal {

    boolean isAlive();

    void takeDamage(int damage);

    int ATTACK_POWER_WARRIOR = 50;
    int ATTACK_POWER_ARCHER = 30;
    int ATTACK_POWER_MAGE = 40;
    int ATTACK_POWER_ZOMBIE = 30;
    int ATTACK_POWER_VAMPIRE = 35;
    int ATTACK_POWER_DRAGON = 45;

    int HEALTH_WARRIOR = 300;
    int HEALTH_ARCHER = 150;
    int HEALTH_MAGE = 200;
    int HEALTH_ZOMBIE = 100;
    int HEALTH_VAMPIRE = 200;
    int HEALTH_DRAGON = 400;

    int PROBABILITY_OF_A_MISS_ARCHER = 50; //  %
    int NUMBER_OF_SHOTS_ARCHER = 3;
    int FIRE_DAMAGE_FOR_DRAGON = 5;
    int PROBABILITY_OF_BLOCKING_DAMAGE = 20; //  %
    int PROBABILITY_OF_CRITICAL_DAMAGE = 20; // %
    double PERCENTAGE_OF_VAMPIRE_HEALTH_UPGRADE = 20; // %
}

