package com.company;



public class CombatantController extends Combatants {

    public CombatantController(Enemy enemy, PlayerCombatControl player) {
        super(enemy, player);
    }


    private void turnDecider(){
        enemyTurn();
        playerTurn();
    }

    private void enemyTurn(){
        boolean attackOrHeal = enemy.healOrAttack();
        if(attackOrHeal){
            enemyAttack();
        }
        else{
            enemyHeal();
        }
    }

    private void playerTurn(){
        boolean attackOrHeal = player.healOrAttack();
        if(attackOrHeal){
            playerAttack();
        }
        else{
            playerHeal();
        }
    }

    private void enemyAttack(){
        player.removeHealth(enemy.attackDecider());
    }

    private void playerAttack(){
        enemy.removeHealth(player.attackDecider());
    }

    private void enemyHeal(){
        enemy.healHealth(enemy.healDecider());
    }

    private void playerHeal(){
        player.healHealth(player.healDecider());
    }


}
