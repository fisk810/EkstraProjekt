package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputPlayer {
    Scanner input = new Scanner(System.in);

    public boolean playerBattleDecision(){
        boolean loop = true;
        while(loop) {
            System.out.println("Enter 1 if you want to attack, enter 2 if you want to heal");
            try {
                int in = input.nextInt();
                return in == 1;
            } catch (InputMismatchException e){
            }
            wrongInput();
        }
        return false;
    }

    public void wrongInput(){
        System.out.println("\nLooks like you entered something wrong. Try again.\nPress enter to continue\n");
        input.nextLine();
        input.nextLine();
    }


}