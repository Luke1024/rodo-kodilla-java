package com.kodilla.rps;

import java.util.Random;

public class RpsLogic {
    Random rand = new Random();
    RpsUserInterface userInterface = new RpsUserInterface();
    RpsUserDialogs dialogs = new RpsUserDialogs();
    Move compMove;
    String comment1;
    String comment2;
    int destinyInt;
    int playerPoint;
    int computerPoint;
    boolean option;

    Move playerWin(Move move){
        if(move == Move.ROCK) {
            compMove = Move.SCISSORS;
            comment1 = dialogs.rockScissors();
        }
        if(move == Move.PAPER){
            compMove = Move.ROCK;
            comment1 = dialogs.paperRock();
        }
        if(move == Move.SCISSORS){
            compMove = Move.PAPER;
            comment1 = dialogs.scissorsPaper();
        }
        return compMove;
    }

    Move playerLose(Move move){
        if(move == Move.ROCK){
            compMove = Move.PAPER;
            comment1 = dialogs.paperRock();
        }
        if(move == Move.PAPER){
            compMove = Move.SCISSORS;
            comment1 = dialogs.scissorsPaper();
        }
        if(move == Move.SCISSORS){
            compMove = Move.ROCK;
            comment1 = dialogs.rockScissors();
        }
        return compMove;
    }

    Move playerWinExtended(Move move){
        option = rand.nextBoolean();
        if(move==Move.ROCK){
            if(option==true){
                compMove=Move.SCISSORS;
                comment1 = dialogs.rockScissors();
            } else {
                compMove=Move.LIZARD;
                comment1 = dialogs.rockLizard();
            }
        }
        if(move==Move.PAPER){
            if(option==true){
                compMove=Move.ROCK;
                comment1 = dialogs.paperRock();
            } else {
                compMove=Move.SPOCK;
                comment1 = dialogs.paperSpock();
            }
        }
        if(move==Move.SCISSORS){
            if(option==true){
                compMove=Move.PAPER;
                comment1 = dialogs.scissorsPaper();
            } else {
                compMove=Move.LIZARD;
                comment1 = dialogs.scissorsLizard();
            }
        }
        if(move==Move.LIZARD){
            if(option==true){
                compMove=Move.PAPER;
                comment1 = dialogs.lizardPaper();
            } else {
                compMove=Move.SPOCK;
                comment1 = dialogs.lizardSpock();
            }
        }
        if(move==Move.SPOCK){
            if(option==true){
                compMove=Move.SCISSORS;
                comment1 = dialogs.spockScissors();
            } else {
                compMove=Move.ROCK;
                comment1 = dialogs.spockRock();
            }
        }
        return compMove;
    }

    Move playerLoseExtended(Move move){
        option = rand.nextBoolean();
        if(move==Move.ROCK) {
            if(option==true){
                compMove=Move.PAPER;
                comment1 = dialogs.paperRock();
            } else {
                compMove=Move.SPOCK;
                comment1 = dialogs.spockRock();
            }
        }
        if(move==Move.PAPER){
            if(option==true){
                compMove=Move.SCISSORS;
                comment1 = dialogs.scissorsPaper();
            } else  {
                compMove=Move.LIZARD;
                comment1 = dialogs.lizardPaper();
            }
        }
        if(move==Move.SCISSORS){
            if(option==true){
                compMove=Move.ROCK;
                comment1 = dialogs.rockScissors();
            } else {
                compMove=Move.SPOCK;
                comment1 = dialogs.spockScissors();
            }
        }
        if(move==Move.LIZARD){
            if(option==true){
                compMove=Move.PAPER;
                comment1 = dialogs.lizardPaper();
            } else {
                compMove=Move.SCISSORS;
                comment1 = dialogs.scissorsLizard();
            }
        }
        if(move==Move.SPOCK){
            if(option==true){
                compMove=Move.LIZARD;
                comment1 = dialogs.lizardSpock();
            } else {
                compMove=Move.PAPER;
                comment1 = dialogs.paperSpock();
            }
        }
        return compMove;
    }

    Result computerMove(Move move, Mode mode){
        destinyInt=rand.nextInt(100);
        //0-24-tie, 25-49-player win, 50-99-computer win
        playerPoint=0;
        computerPoint=0;
        if(destinyInt<25){
            compMove = move;
            comment1 = "DRAW";
            comment2 = "DRAW";
        }

        if(mode==Mode.STANDARD) {
            if (destinyInt > 24 && destinyInt < 50){
                compMove = playerWin(move);
                playerPoint++;
                comment2 = "You WIN!";
            }
            if (destinyInt > 49 && destinyInt < 100){
                compMove = playerLose(move);
                computerPoint++;
                comment2 = "Computer Win.";
            }
        } else {
            if (destinyInt > 24 && destinyInt < 50) {
                compMove = playerWinExtended(move);
                playerPoint++;
                comment2 = "You WIN!";
            }
            if (destinyInt > 49 && destinyInt < 100){
                compMove = playerLoseExtended(move);
                computerPoint++;
                comment2 = "Computer Win.";
            }
        }
        return new Result(userInterface.moveToString(move), userInterface.moveToString(compMove), playerPoint, computerPoint, comment1, comment2);
    }
}
