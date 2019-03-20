package com.kodilla.rps;

public class RpsGame {
    RpsLogic logic = new RpsLogic();
    RpsUserDialogs dialogs = new RpsUserDialogs();
    RpsUserInterface userInterface = new RpsUserInterface();
    Move move;
    Mode mode;
    String playerName;
    int rounds;
    int roundCounter;

    public void run(){
        dialogs.helloText();
        dialogs.menu();
        mode = userInterface.scanMode();
        dialogs.whatName();
        playerName = userInterface.scanName();
        while(true) {
            dialogs.howRounds();
            rounds = userInterface.scanRounds();
            Results results = new Results();
            roundCounter = 0;
            while (true) {
                move = userInterface.scanMove(mode); //scan move
                Result result = logic.computerMove(move, mode);
                result.show();
                results.addResult(result);
                results.score(playerName);
                roundCounter++;
                if (roundCounter == rounds) {
                    break;
                }
            }
            results.score(playerName);
            results.showFinalResults(playerName);
            if (userInterface.renewOrExit() == false) {
                break;
            }
        }
    }
}
