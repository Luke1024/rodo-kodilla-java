package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public interface RpsInterface {
    Scanner sc = new Scanner(System.in);


    void print(String p);
    default String scanName(){
        String playerName;
        String nullString="";

        while(true){
            playerName=sc.nextLine();
            if(playerName.equals(nullString)){
                System.out.println("What's your name?, use any sign.");
            } else {
                break;
            }
        }
        return playerName;
    }
    default void helloText(){
        System.out.println("<<<@@@ Rock Paper Scissors @@@>>>");
        System.out.println("Key bindings: 1-Rock, 2-Paper, 3-Scissors, x-End Game, n-Game Restart");
        System.out.println();
        System.out.println("What's your name?");
    }

    default boolean areYouSureBlock() {
        String response = sc.nextLine().toLowerCase();
        boolean value = false;
        if(response.equals("y") || response.equals("n")){
            if(response.equals("y")) {
                value = true;
            }
        } else System.out.println("Type y for yes and n for no.");
        return value;
    }

    default boolean areYouSure(){
        System.out.println("Are you sure you want to exit? y / n");
        return areYouSureBlock();
    }

    default boolean areYouSure2(){
        System.out.println("Are you sure you want to renew game? y / n");
        return areYouSureBlock();
    }



    default int getRounds(){

        int rounds;

        while(true){
            System.out.println("How many rounds do you wanna play?");
            String temp = sc.nextLine();
            try {
                rounds = Integer.parseInt(temp);
                if(rounds<1 || rounds>10){
                    System.out.println("Use number between 1 to 10.");
                } else {
                    break;
                }
            } catch (NumberFormatException e){
                temp=temp.toLowerCase();
                if(temp.equals("x") || temp.equals("n")){
                    if (temp.equals("x")){
                        if(areYouSure()==true) {
                            System.exit(0);
                        }
                    } else {
                        System.out.println("Game hasn't even started yet.");
                    }
                } else {
                        System.out.println("Use number beetween 1 or 10 or x to exit.");
                    }
                }
            }
        return rounds;
    }

    default int getMove(){

        int move;

        while(true){
            System.out.println("Your move... 1-rock, 2-paper, 3-scissors");
            String temp = sc.nextLine();
            try {
                move = Integer.parseInt(temp);
                if (!!(move==1 || move==2 || move==3)){
                    System.out.println("Use 1-rock, 2-paper, 3-scissors");
                } else {
                    break;
                }
            } catch (NumberFormatException e){
                temp=temp.toLowerCase();
                if(temp.equals("x") || temp.equals("n")){
                    if (temp.equals("x")){
                        if(areYouSure()==true) {
                            System.exit(0);
                        }
                    } else {
                        if(areYouSure2()==true){
                            move=42;
                            break;
                        }
                    }
                } else {
                    System.out.println("Use number beetween 1 or 10 or x to exit.");
                }
            }
        }
        return move;
    }

    default int[] winMap(int rounds){

        //start here

        for(int i=0; i<0; i++){
            winLoseMap.add()
        }
        return winLoseMap;
    }
}




                    /*
                rounds = Integer.parseInt(sc.nextLine());
                if(rounds<1 || rounds > 10){
                  System.out.println("Rounds number cannot be lower than 1 or larger than 10");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
                try {
                    command = sc.nextLine();
                    if(command.toLowerCase()=="x"){
                        System.exit(0);
                    }
                    if(command.toLowerCase()=="n"){
                        System.out.println("Game not even started yet.");
                    }
                } catch (Exception z){
                    System.out.println("User number between 1 and 10");
                }
            }
        }
        return rounds;
    }
}
*/