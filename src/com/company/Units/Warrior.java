package com.company.Units;

public abstract class Warrior extends Units {
    protected int maxRage;
    protected int currentRage;


    protected int basicAttack(){
        if(currentRage < maxRage){
            addStat(currentRage, 3);
            if(currentRage > maxRage){
                currentRage = maxRage;
            }
        }
        return atk;
    }

    protected int warriorAttack(){
        removeStat(currentRage, 20);
        if (currentRage < 0){
            currentRage = 0;
        }
        return atk + 2;
    }

    public abstract int attackAlgo();
}
