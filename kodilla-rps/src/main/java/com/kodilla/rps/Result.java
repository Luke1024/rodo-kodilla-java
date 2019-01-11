package com.kodilla.rps;

public class Result {
    String player;
    String computer;
    int playerPoint;
    int computerPoint;
    String comment1;
    String comment2;

    public int getPlayerPoint() {
        return playerPoint;
    }

    public int getComputerPoint() {
        return computerPoint;
    }

    Result(String player, String computer, int playerPoint, int computerPoint, String comment1, String comment2){
        this.player = player;
        this.computer = computer;
        this.playerPoint = playerPoint;
        this.computerPoint = computerPoint;
        this.comment1 = comment1;
        this.comment2 = comment2;
    }
    void showComputerMove(){System.out.println("Computer: " + computer);}
    void showActionComment(){ System.out.println(comment1);}

    void show(){
        showComputerMove();
        showActionComment();
    }
}
