package com.stadlerrobertmatyas.kyu7;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

// https://www.codewars.com/kata/671bd5419ea261fbb8d0a0ca
// BitwiseOperatorExample extra package-ben --> az egy darab & miatt, bitwise ÉS
public class MewCipher02 {

    /*
    i --> charIndex, columnIndex, colIndex, position
    j --> stringIndex, rowIndex
    s --> sum, totalValue, acc, accumulator
    c --> alphabeticalIndex, charIndex
     */
    public static String decipher(String[] code) {
        return range(0, code[0].length())
                .map(columnIndex -> range(0, code.length)
                        .reduce(0, (acc, rowIndex) -> acc + (code[rowIndex].charAt(columnIndex) & 31)) / code.length)
                .mapToObj(alphabeticalIndex -> (char) (alphabeticalIndex > 0 ? alphabeticalIndex + 96 : 32) + "")
                .collect(joining());
    }
}
