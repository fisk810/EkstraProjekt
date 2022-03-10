package com.company.Unit.Enemy;
import com.company.Unit.Unit;

import java.util.HashMap;
import java.util.Map;


public abstract class Enemy extends Unit{
    int id;
    public Enemy(int id, String name, int health, int damage) {
        super(name, health, damage);
        this.id = id;
    }


    public abstract int moveDecision();


}
