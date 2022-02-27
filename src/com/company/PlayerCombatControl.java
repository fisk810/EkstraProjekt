package com.company;

public class PlayerCombatControl extends Player {
    private UserInputPlayer in = new UserInputPlayer();
    public PlayerCombatControl(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    protected boolean healOrAttack(){
        return in.playerBattleDecision();
    }


    public int attackDecider(){
        return baseAttack();
    }

    public int healDecider(){
        return baseHeal();
    }
}
