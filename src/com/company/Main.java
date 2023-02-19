package com.company;

public class Main {

    private static final int FROM = 8;
    private static final int TO = 15;

    public static void main(String[] args) {
        executeExercise_1();
    }

    private static void executeExercise_1 () {
        System.out.println("Executing Exercise 1..... ");

        final int randomInt = RandomNumberGenerator.generateRandomNumberInRange(FROM, TO);
        System.out.println("The chosen random number is " + randomInt + ".");
    }
}
