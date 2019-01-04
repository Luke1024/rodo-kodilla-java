package com.kodilla.rps;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Integer.parseInt;

public interface RpsInterface {
    Scanner sc = new Scanner(System.in);

    Random rand = new Random();


    void print(String p);
    default String scanName(){
        String playerName;
        String nullString="";

        while(true){
            playerName=sc.nextLine();
            if(playerName.equals(nullString)){
                System.out.println("What's your name?, use any sign/s.");
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
        System.out.println("Are you sure you want to restart the game? y / n");
        return areYouSureBlock();
    }



    default int getRounds(){

        int rounds;

        while(true){
            System.out.println("How many rounds do you want to play?");
            String temp = sc.nextLine();
            try {
                rounds = Integer.parseInt(temp);
                if(rounds<1 || rounds>10){
                    System.out.println("Use number from 1 to 10.");
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
                        System.out.println("Use number from 1 or 10 or x to exit.");
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
                    System.out.println("Use 1-rock, 2-paper, 3-scissors");
                }
            }
        }
        return move;
    }

    default int[] winMap(int rounds){

        int playMode = rand.nextInt(4);

        //1-computer win, 2-tie, 3-player wins
        int[] winLoseMap = new int[rounds];

        //lower bound of wins
        int lowerBound = (int) Math.floor(rounds/2.0)+1;

        //computer or player
        int winNumber = rand.nextInt(rounds-lowerBound)+lowerBound;

        //computer win
        if(playMode==0 || playMode==1){
            for(int i=0; i<winNumber; i++){
                winLoseMap[i] = 1;
            }
            Collections.shuffle(Arrays.asList(winLoseMap));

            //generate random tie

            int maxTieNumber


        }

        //computer lose
        if(playMode==2){

        }

        //tie
        if(playMode==3){

        }

        return winLoseMap;
    }
}


