package com.kodilla.rps;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

public class RpsRunner {
    public static void main(String[] args) {
        RpsInterface inter = new RpsInterface() {
            @Override
            public void print(String p) {
            }
        };

        inter.helloText();
        String playerName = inter.scanName();

        //fast ending
        if(playerName.equals("x")){
            if(inter.areYouSure()==true){
                System.exit(0);
            }
        }
        if(playerName.equals("n")){
            System.out.println("Game hasn't started yet.");
        }



        //game starting
        while(true){

            int rounds = inter.getRounds();
            int move;
            int roundsCounter = 0;

            boolean[] winMap= inter.winMap(rounds);
            String result = inter.result(winMap);


            while(true){
                move=inter.getMove();
                if (move==42){
                    break;
                } else {
                    inter.getCompMove();
                }
                rounds++;
                if(rounds==roundsCounter){
                    break;
                }
            }
            if(rounds==roundsCounter){
                System.out.println("Do you wanna play once again? y / n");
                if(inter.areYouSureBlock()==false){
                    break;
                }
            }
        }
    }
}








/*
        while(true){
            String playerName = sc.nextLine();
            if(playerName.equals(nullString)){
                System.out.println("What's your name? Use any signs.");
            } else {
                break;
        }}

        //how much rounds
        System.out.println("How much rounds do you wanna play? More than 10 rounds is not available");

        int rounds;

        while(true){
            try{
                rounds = Integer.parseInt(sc.nextLine());
                if(rounds<1 || rounds > 10){
                    System.out.println("Rounds number cannot be lower than 1 or larger than 10");
                } else {
                    break;
                }
            } catch (Exception e){
                System.out.println("Use number.");
            }
        }
        RpsEngine engine = new RpsEngine(rounds);
       */