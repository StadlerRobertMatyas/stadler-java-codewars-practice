package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/56170e844da7c6f647000063
public class DrinkAbout01 {

    public static String peopleWithAgeDrink(int age){
        if (age > 0 && age < 14) {
            return "drink toddy";
        } else if (age >= 14 && age < 18) {
            return "drink coke";
        } else if (age >= 18 && age < 21) {
            return "drink beer";
        } else if (age >= 21 && age < 123) {
            return "drink whisky";
        } else {
            return "Invalid age";
        }
    }
}
