package com.cs09;

public class Main {

    public static void main(String[] args) {
        int playerPosition = calculateScore(1500);
        displayHighScorePosition("Abc", playerPosition);

        playerPosition = calculateScore(900);
        displayHighScorePosition("Xyz", playerPosition);

        playerPosition = calculateScore(400);
        displayHighScorePosition("Mno", playerPosition);

        playerPosition = calculateScore(100);
        displayHighScorePosition("Pqr", playerPosition);

    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }
    public static int calculateScore(int playerScore){
        if(playerScore > 1000)
            return 1;
        else if((playerScore > 500) && (playerScore < 1000))
            return 2;
        else if ((playerScore > 100) && (playerScore < 500))
            return 3;
        else
            return 4;
    }
}
