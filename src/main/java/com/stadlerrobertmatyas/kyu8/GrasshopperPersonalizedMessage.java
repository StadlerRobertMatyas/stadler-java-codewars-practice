package com.stadlerrobertmatyas.kyu8;

// https://www.codewars.com/kata/5772da22b89313a4d50012f7
public class GrasshopperPersonalizedMessage {

    static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }
}
