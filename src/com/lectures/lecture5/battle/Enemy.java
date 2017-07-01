package com.lectures.lecture5.battle;

/**
 * Created by User on 022 22.06.17.
 */
public abstract class Enemy implements Mortal {
    public void setName(String name) {
        this.name = name;

    }


    private String name;
    private int health;
    private int attack;

    public void attack(Hero hero) {
        System.out.print(name + " атакует ");
        hero.takeDamage(getAttack());
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println("\n" + name + " получает " + damage + " урона");
        health -= damage;
        if (health > 0) {
            System.out.println("Осталось здоровья " + health);
        } else {
            System.out.println("\n" + name + " мёртв" + "\n");
        }
    }

    @Override
    public boolean isAlive() {

        boolean x = false;
        if (health > 0) {
            x = true;
        }
        return x;
    }


    public Enemy(String name, int health, int attack) {
        this.health = health;
        this.attack = attack;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                '}';
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }
}