package com.stadlerrobertmatyas.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class AdaptiveSecuritySystemTest {

    @Test
    public void basicExamples() {
        int[][] hackersCases = {
                {7, 6, 8, 9},
                {10, 11, 12},
                {5, 5, 5},
                {}
        };

        int[] securityLevels = {6, 5, 5, 4};
        int[] increases = {2, 3, 1, 2};
        int[] answers = {1, 3, 0, 0};

        for (int i = 0; i < hackersCases.length; i++) {
            int[] hackers = hackersCases[i];
            int securityLevel = securityLevels[i];
            int increase = increases[i];
            int answer = answers[i];

            int[] originalHackers = Arrays.copyOf(hackers, hackers.length);

            assertEquals(
                    "hackers=" + Arrays.toString(originalHackers)
                            + ", securityLevel=" + securityLevel
                            + ", increase=" + increase,
                    answer,
                    AdaptiveSecuritySystem.breachAttempts(Arrays.copyOf(hackers, hackers.length), securityLevel, increase)
            );
        }
    }
}
