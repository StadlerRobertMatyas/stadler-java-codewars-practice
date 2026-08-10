package com.stadlerrobertmatyas.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class ShipOfTheseusTest {

    private static String[][] cloneShip(String[][] ship) {
        String[][] copy = new String[ship.length][];

        for (int i = 0; i < ship.length; i++) {
            copy[i] = Arrays.copyOf(ship[i], ship[i].length);
        }

        return copy;
    }

    @Test
    public void basicExamples() {
        Object[] shipsCases = {
                new String[][] {{"a", "b", "c"}, {"x", "b", "c"}, {"x", "y", "c"}, {"x", "y", "z"}},
                new String[][] {{"a", "b", "c"}, {"x", "y", "c"}},
                new String[][] {{"a", "b", "c"}, {"x", "b"}},
                new String[][] {{"a", "b", "c"}},
                new String[][] {}
        };

        boolean[] answers = {
                true,
                false,
                false,
                true,
                true
        };

        for (int i = 0; i < shipsCases.length; i++) {
            String[][] ship = (String[][]) shipsCases[i];
            boolean answer = answers[i];
            String[][] original = cloneShip(ship);

            assertEquals(
                    "ship=" + Arrays.deepToString(original),
                    answer,
                    ShipOfTheseus.shipOfTheseus(cloneShip(ship))
            );
        }
    }
}
