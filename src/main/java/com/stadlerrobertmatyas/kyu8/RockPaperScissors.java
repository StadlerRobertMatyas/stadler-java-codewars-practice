package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/5672a98bdbdd995fad00000f
public class RockPaperScissors {

    public static String rps(String p1, String p2) {

        if (p1.equals(p2)) {
            return "Draw!";
        }
        boolean player1Wins =
                (p1.equals("rock") && p2.equals("scissors")) ||
                        (p1.equals("paper") && p2.equals("rock")) ||
                        (p1.equals("scissors") && p2.equals("paper"));
        return player1Wins ? "Player 1 won!" : "Player 2 won!";
    }
}
