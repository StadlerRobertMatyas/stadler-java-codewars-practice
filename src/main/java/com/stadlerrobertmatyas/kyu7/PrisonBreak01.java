package com.stadlerrobertmatyas.kyu7;

// https://www.codewars.com/kata/6507e3170b7009117e0c7865
public class PrisonBreak01 {

    public static int freedPrisoners(Boolean[] prison) {
        if (prison.length == 0 || prison[0] == false) {
            return 0;
        }

        int counter = 0;
        int currentIndex = 0;
        boolean isUnlocked = true;

        while (currentIndex < prison.length) {
            int nextIndex = -1;

            for (int i = currentIndex; i < prison.length; i++) {
                if (isUnlocked == true) {
                    if (prison[i] == true) {
                        nextIndex = i;
                        break;
                    }
                } else {
                    if (prison[i] == false) {
                        nextIndex = i;
                        break;
                    }
                }
            }

            if (nextIndex == -1) {
                break;
            }

            counter++;
            currentIndex = nextIndex + 1;
            isUnlocked = !isUnlocked;
        }

        return counter;
    }
}
