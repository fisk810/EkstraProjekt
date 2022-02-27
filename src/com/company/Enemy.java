package com.company;

import com.company.UnitControl;

public abstract class Enemy extends UnitControl {
    String id;

    public Enemy(String id, String name, int health, int damage) {
        super(name, health, damage);
        this.id = id;
    }

    public abstract int attackDecider();

    public abstract int healDecider();



}
