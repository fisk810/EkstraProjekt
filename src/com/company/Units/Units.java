package com.company.Units;

public abstract class Units {
    protected int maxHp;
    protected int currentHp;
    protected String name;
    protected int id;
    protected int atk;

    protected void removeStat(int stat, int loss) {
        stat = stat - loss;
    }

    protected void addStat(int stat, int add) {
        stat = stat + add;
    }


}
