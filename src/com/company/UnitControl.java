package com.company;

import com.company.Unit;

public class UnitControl extends Unit {

    public UnitControl(String name, int health, int damage) {
        super(name, health, damage);
    }

    protected void removeHealth(int damage){
        health = health - damage;
    }

    protected void healHealth(int heal){
        health = health + heal;
    }

    protected boolean healOrAttack(){
        return true;
    }

    protected int baseAttack(){
        return damage;
    }

    protected int baseHeal(){
        return 2;
    }

}
