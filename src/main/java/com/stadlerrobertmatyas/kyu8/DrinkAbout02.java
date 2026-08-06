package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/56170e844da7c6f647000063
public class DrinkAbout02 {

    public static String peopleWithAgeDrink(int age){
        String drink;
        if (age >= 0 && age < 14) {
            drink = "toddy";
        } else if (age >= 14 && age < 18) {
            drink = "coke";
        } else if (age >= 18 && age < 21) {
            drink = "beer";
        } else if (age >= 21) {
            drink = "whisky" ;
        } else {
            return "Invalid age";
        }
        return "drink " + drink;
    }
}
