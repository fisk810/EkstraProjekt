package com.company;

public abstract class Unit {
    protected String name;
    protected int health, damage;

    protected Unit(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }


}
