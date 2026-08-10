package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/69b58aaee8f1deef7ece7d0e
public class AdaptiveSecuritySystem {

    public static int breachAttempts(int[] hackers, int securityLevel, int increase) {
        if (hackers == null) {
            return 0;
        }
        int counter = 0;
        for (int hacker : hackers) {
            if (hacker <= securityLevel) {
                securityLevel += increase;
            } else {
                counter++;
            }
        }
        return counter;
    }
}
