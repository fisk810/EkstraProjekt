package com.company;



public abstract class Combatants {
    protected Enemy enemy;
    protected PlayerCombatControl player;

    public Combatants(Enemy enemy, PlayerCombatControl player) {
        this.enemy = enemy;
        this.player = player;
    }

}
