package com.company.Unit.Enemy;

import java.util.Map;
import java.util.Random;

public class Mage extends Enemy{

    public Mage(int id, String name, int health, int damage) {
        super(id, name, health, damage);
    }

    @Override
    public int moveDecision() {
        if (health <= 5 && rng() < 51) {
            return baseHeal();
        }
        return baseAttack();
    }
}
