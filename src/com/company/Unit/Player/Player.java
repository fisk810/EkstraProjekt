package com.company.Unit.Player;

import com.company.Unit.Unit;
import com.company.UserInputPlayer;

public class Player extends Unit{
    protected UserInputPlayer pIO = new UserInputPlayer();
    private static Player p = new Player();
    private Player() {
        createPlayer();
        this.health = 20;
        this.damage = -2;
        this.name = "Jens";
    }

    public int moveDecision(){
        if(pIO.playerBattleDecision()){
            return baseAttack();
        }
        else{
            return baseHeal();
        }
    }

    public void createPlayer(){

    }

    public static Player getInstance(){
        return p;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
