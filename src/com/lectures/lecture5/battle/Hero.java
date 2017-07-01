package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public abstract class Hero implements Mortal {

    private String name;

    public void setHealth(int health) {
        this.health = health;
    }

    private int health;
    private int attack;
    int i = 0;

    public void attack(Enemy enemy) {
        System.out.print(name + " атакует ");
        enemy.takeDamage(getAttack());
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (damage > FIRE_DAMAGE_FOR_DRAGON && health > 0) {
            System.out.println("\n" + name + " получает " + damage + " урона");

            System.out.println("Осталось здоровья " + health);
        } else if (health > 0) {
            System.out.println(name + " горит -" + FIRE_DAMAGE_FOR_DRAGON);
        }
    }

    @Override
    public boolean isAlive() {

        boolean x = false;
        if (health > 0) {
            x = true;
        } else if (i == 0) {
            System.out.println("\n" + name + " мёртв" + "\n");
            i++;
        }
        return x;
    }


    public Hero(String name, int health, int attack) {
        this.attack = attack;
        this.name = name;
        this.health = health;

    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}

