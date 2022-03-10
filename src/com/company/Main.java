package com.company;

import com.company.Combat.CombatantController;
import com.company.Unit.Enemy.Enemy;
import com.company.Unit.Enemy.Wolf;
import com.company.Unit.Player.Player;

public class Main {

    public static void main(String[] args) {
        Player p = Player.getInstance();
        CombatantController cc = new CombatantController(new Wolf(1,"wolf",10,-2),p);



    }
}
