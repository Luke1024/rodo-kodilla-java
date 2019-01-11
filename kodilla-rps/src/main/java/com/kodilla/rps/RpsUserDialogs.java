package com.kodilla.rps;

public class RpsUserDialogs {
    void helloText(){ System.out.println("<<<@@@ Rock Paper Scissors @@@>>>");}

    void menu(){ System.out.println("Press s to play Rock-Paper-Scissors," + "\n" +
                "press e to play extended version Rock-Paper-Scissors-Lizard-Spock," + "\n" +
                "press r for rules" + "\n" +
                "press x to exit.");
    }
    void rules(){
        System.out.println("_____Standard_____" + "\n" +
                "Paper covers rock," + "\n"+
                "scissors cuts paper," + "\n"+
                "and rock crushes scissors." + "\n"+
                "_____Extended_____" + "\n" +
                "Scissors cuts paper," + "\n"+
                "paper covers rock," + "\n"+
                "rock crushes lizard," + "\n"+
                "lizard poisons Spock," + "\n"+
                "Spock smashes scissors," + "\n"+
                "scissors decapitates lizard," + "\n"+
                "lizard eats paper" + "\n"+
                "paper disproves Spock," + "\n"+
                "and rock crushes scissors.");
    }

    void chooseMode() { System.out.println("Press s to play Rock-Paper-Scissors, press e to play extended version Rock-Paper-Scissors-Lizard-Spock or press x to exit.");}
    void whatName(){
        System.out.println("What's your name?");
    }
    void howRounds(){
        System.out.println("How many rounds do you want to play?");
    }
    void whatName2(){
        System.out.println("What's your name?, use any character/s.");
    }
    void sureExit(){
        System.out.println("Are you sure you want to exit? y / n");
    }
    void use1to10(){
        System.out.println("Use number from 1 to 10.");
    }
    void gameNotStarted(){
        System.out.println("Game hasn't even started yet.");
    }

    void nameNull(){
        System.out.println("Use any character/s.");
    }
    void toExitOrRestart(){
        System.out.println("Press x to exit or press n to restart.");
    }

    //for rps
    void yourMove() {
        System.out.println("Your move... 1-rock, 2-paper, 3-scissors");
    }
    void use123(){
        System.out.println("Use 1-rock, 2-paper, 3-scissors");
    }
    void use12345() { System.out.println("Use 1-rock, 2-paper, 3-scissors, 4-lizard, 5-spock"); }
    //for rpsls
    void yourMoveExtended() {
        System.out.println("Your move... 1-rock, 2-paper, 3-scissors, 4-lizard, 5-spock");
    }
    void use123Extended(){
        System.out.println("Use 1-rock, 2-paper, 3-scissors, 4-lizard, 5-spock");
    }
    //interactions
    String rockScissors(){
        return "Rock crushes scissors.";
    }
    String rockLizard(){
        return "Rock crushes lizard.";
    }
    String paperRock(){ return "Paper covers rock."; }
    String paperSpock(){
        return "Paper disproves spock.";
    }
    String scissorsPaper(){
        return "Scissors cuts paper.";
    }
    String scissorsLizard(){
        return "Scissors decapitates lizard.";
    }
    String lizardPaper(){
        return "Lizard eats paper.";
    }
    String lizardSpock(){
        return "Lizard poisons spock.";
    }
    String spockScissors(){
        return "Spock smashes scissors.";
    }
    String spockRock(){
        return "Spock vaporizes rock.";
    }
}
