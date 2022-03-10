package com.company.Unit.Enemy;

import java.util.Map;
import java.util.Random;

public class Wolf extends Enemy {

    public Wolf(int id, String name, int health, int damage) {
        super(id, name, health, damage);
    }

    public int bite() {
        return damage * 2;
    }

    @Override
    public int moveDecision() {
        if (rng() < 11) {
            return bite();
        }
        return baseAttack();
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
