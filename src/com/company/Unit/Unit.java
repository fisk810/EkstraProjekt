package com.company.Unit;

import java.util.Random;

public abstract class Unit {
    protected String name;
    public int health, damage;

    protected Unit(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    protected Unit() {
    }

    public abstract int moveDecision();

    public void removeHealth(int damage){
        health = health + damage;
    }

    public void healHealth(int heal){
        health = health + heal;
    }

    protected int baseAttack(){
        return damage;
    }

    protected int baseHeal(){
        return 2;
    }

    protected double rng(){
            Random r = new Random();
            return r.nextInt(100 + 1);
    }
}
