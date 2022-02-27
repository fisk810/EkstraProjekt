package com.company;

import java.util.Random;

public class Wolf extends Enemy {

    public Wolf(String id, String name, int health, int damage) {
        super(id, name, health, damage);
    }

    public int bite() {
        return damage * 2;
    }

    public int attackDecider(){

        Random r = new Random();
        double randomNumber = r.nextInt(100 + 1);
        if(randomNumber < 11){
            return bite();
        }
        return baseAttack();
    }

    public int healDecider(){
        return 0;
    }
}
