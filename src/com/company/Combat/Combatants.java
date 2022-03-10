package com.company.Combat;


import com.company.Unit.Enemy.Enemy;
import com.company.Unit.Player.Player;


public abstract class Combatants {
    protected Enemy enemy;
    protected Player player;

    public Combatants(Enemy enemy, Player player) {
        this.enemy = enemy;
        this.player = player;
    }

}
