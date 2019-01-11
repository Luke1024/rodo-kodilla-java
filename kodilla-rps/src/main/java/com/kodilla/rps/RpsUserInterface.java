package com.kodilla.rps;

import java.util.Scanner;

public class RpsUserInterface {
    RpsUserDialogs dialogs = new RpsUserDialogs();
    Scanner scanner = new Scanner(System.in);
    Mode mode;
    Move move;
    String moveToString;
    String command;
    String input;
    String inLow;
    int moveInt;
    int rounds;
    boolean restartFlag;


    public void exitAndRestartProcessing(String input){
        if (input.equals("x")){
            dialogs.sureExit();
            if (scanner.nextLine().toLowerCase().equals("y")){
                System.exit(0);
            }
        }
        if (input.equals("n")) {
            dialogs.gameNotStarted();
        }
    }

    public String scanName(){
        while(true){
            input=scanner.nextLine();
            inLow = input.toLowerCase();
            if(inLow.length()==1) {
                if (inLow.equals("x") || inLow.equals("n")) {
                    exitAndRestartProcessing(inLow);
                }
            }
            if(input.length()==0){
                dialogs.nameNull();
            }
            if(input.length()>0){
                break;
            }
            dialogs.whatName2();
        }
        return input;
    }

    public int scanRounds(){
        while(true){
            input=scanner.nextLine().toLowerCase();
            rounds=0;
            if (input.equals("x") || input.equals("n")) {
                exitAndRestartProcessing(input);
            } else {
                try{
                    rounds = Integer.parseInt(input);
                    if(rounds<1 || rounds>10) {
                        dialogs.use1to10();
                    } else {
                        break;
                    }
                } catch (Exception e){
                    dialogs.use1to10();
                }
            }
            dialogs.howRounds();
        }
        return rounds;
    }

    public Move moveTranslator(int moveInt){
        if(moveInt==1)move = Move.ROCK;
        if(moveInt==2)move = Move.PAPER;
        if(moveInt==3)move = Move.SCISSORS;
        if(moveInt==4)move = Move.LIZARD;
        if(moveInt==5)move = Move.SPOCK;
        return move;
    }

    public Move scanMove(Mode mode){
        if(mode==Mode.STANDARD){
            dialogs.yourMove();
        } else {
            dialogs.yourMoveExtended();
        }
        while(true){
            input=scanner.nextLine().toLowerCase();
            if (input.equals("x") || input.equals("n")) {
                exitAndRestartProcessing(input);
            } else {
                if(mode==Mode.STANDARD){
                    try{
                        moveInt = Integer.parseInt(input);
                        if(moveInt==1 || moveInt==2 || moveInt==3){
                            move = moveTranslator(moveInt);
                            break;
                        }
                    } catch (Exception e){
                        dialogs.use123();
                    }
                } else {
                    try{
                        moveInt = Integer.parseInt(input);
                        if(moveInt==1 || moveInt==2 || moveInt==3 || moveInt==4 || moveInt==5){
                            move = moveTranslator(moveInt);
                            break;
                        }
                    } catch (Exception e){
                        dialogs.use12345();
                    }
                }
            }
            if(mode==Mode.STANDARD){
                dialogs.yourMove();
            } else {
                dialogs.yourMoveExtended();
            }
        }
        return move;
    }

    public boolean renewOrExit(){
        while(true) {
            dialogs.toExitOrRestart();
            command = scanner.nextLine().toLowerCase();
            restartFlag = false;
            if (command.equals("x")) System.exit(0);
            if (command.equals("n")) {
                restartFlag = true;
                break;
            }
        }
        return restartFlag;
    }

    public Mode scanMode(){
        while(true) {
            command = scanner.nextLine().toLowerCase();
            if(command.equals("x")){ exitAndRestartProcessing(command);}
            if(command.equals("n")) dialogs.gameNotStarted();
            if(command.equals("r")) dialogs.rules();
            if(command.equals("s")){
                mode = Mode.STANDARD;
                break;
            }
            if(command.equals("e")){
                mode = Mode.EXTENDED;
                break;
            }
            dialogs.chooseMode();
        }
        return mode;
    }

    String moveToString(Move move){
        if(move==Move.ROCK)moveToString="Rock";
        if(move==Move.PAPER)moveToString="Paper";
        if(move==Move.SCISSORS)moveToString="Scissors";
        if(move==Move.LIZARD)moveToString="Lizard";
        if(move==Move.SPOCK)moveToString="Spock";
        return moveToString;
    }
}
