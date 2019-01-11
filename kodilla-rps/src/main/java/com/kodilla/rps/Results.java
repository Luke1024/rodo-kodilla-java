package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Results {
    int computerScore;
    int playerScore;
    String playerName;
    List<Result> resultsList = new ArrayList<>();

    void addResult(Result result){
        resultsList.add(result);
    }
    void computeScore(){
        computerScore = IntStream.range(0,resultsList.size())
                .map(n->resultsList.get(n).getComputerPoint()).sum();
        playerScore = IntStream.range(0,resultsList.size())
                .map(n->resultsList.get(n).getPlayerPoint()).sum();
    }

    void score(String playerName){
        computeScore();
        System.out.println(playerName + ": " + playerScore + "  Computer: " + computerScore);
    }

    void showFinalResults(String playerName){
        System.out.println();
        computeScore();
        for(Result result : resultsList){
            System.out.println(playerName + ": " + result.player + "  Computer: " + result.computer + "  " + result.comment2);
        }
        if(computerScore==playerScore){
            System.out.println("Match result: DRAW   Score: " + playerName + ": " + playerScore + "  Computer: " + computerScore);
        } else {
            if(computerScore>playerScore){
                System.out.println("Computer WIN   Score: " + playerName + ": " + playerScore + "  Computer: " + computerScore);
            } else {
                System.out.println("You WIN   Score: " + playerName + ": " + playerScore + "  Computer: " + computerScore);
            }
        }
    }
}
