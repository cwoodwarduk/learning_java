package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isGameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(isGameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //CHALLENGE

        String playerOneName = "Barry";
        int playerOneScore = 1500;
        int playerOnePosition = calculateHighScorePosition(playerOneScore);
        displayHighScorePosition(playerOneName, playerOnePosition);

        String playerTwoName = "Charlotte";
        int playerTwoScore = 900;
        int playerTwoPosition = calculateHighScorePosition(playerTwoScore);
        displayHighScorePosition(playerTwoName, playerTwoPosition);

        String playerThreeName = "Thomas";
        int playerThreeScore = 400;
        int playerThreePosition = calculateHighScorePosition(playerThreeScore);
        displayHighScorePosition(playerThreeName, playerThreePosition);

        String playerFourName = "Ben";
        int playerFourScore = 50;
        int playerFourPosition = calculateHighScorePosition(playerFourScore);
        displayHighScorePosition(playerFourName, playerFourPosition);

    }

    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {

        if (isGameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else if (!isGameOver) {
            return 0;
        } else {
            //In Java and other strongly-typed languages, -1 is used
            //to indicate an error in methods returning an Int
            return -1;
        }
    }

    public static int calculateHighScorePosition (int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }

    }

    // A method returning void is often called a "procedure".
    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }
}
