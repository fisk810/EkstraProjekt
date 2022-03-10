package com.company.Combat;


import com.company.Unit.Enemy.Enemy;
import com.company.Unit.Player.Player;

public class CombatantController extends Combatants {

    public CombatantController(Enemy enemy, Player player) {
        super(enemy, player);
        turnDecider();
    }


    private void turnDecider(){
            playerTurn();
            enemyTurn();

        if(enemy.health > 0 && player.health > 0) {
            turnDecider();
        }
    }

    private void enemyTurn(){
        int dmgHeal = enemy.moveDecision();
        if(dmgHeal > 0){
            healE(dmgHeal);
        }
        else{
            damageP(dmgHeal);
        }
        System.out.println(player.toString());
        System.out.println(enemy.toString());
    }

    private void damageP(int damage){
        player.removeHealth(damage);
    }

    private void healE(int heal){
        enemy.healHealth(heal);
    }

    private void damageE(int damage){
        enemy.removeHealth(damage);
    }

    private void healP(int heal){
        player.healHealth(heal);
    }


    private void playerTurn(){
        int dmgHeal = player.moveDecision();
        if(dmgHeal > 0){
            healP(dmgHeal);

        }
        else{
            damageE(dmgHeal);

        }

        System.out.println(player.toString());
        System.out.println(enemy.toString());
    }
}
