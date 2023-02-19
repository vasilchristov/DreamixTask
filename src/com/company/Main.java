package com.company;

import java.time.Duration;

public class Main {

    private static final int FROM = 8;
    private static final int TO = 15;

    public static void main(String[] args) {
        executeExercise_1();
        executeExercise_2();
    }

    private static void executeExercise_1() {
        System.out.println("Executing Exercise 1..... ");

        final int randomInt = RandomNumberGenerator.generateRandomNumberInRange(FROM, TO);
        System.out.println("The chosen random number is " + randomInt + ".");
    }

    private static void executeExercise_2() {
        System.out.println();
        System.out.println("Executing Exercise 2..... ");

        try {
            final long providedDateInMiliseconds = 16452132000000L;
            final Duration duration = TimeUtility.getRemainingTimeTill(providedDateInMiliseconds);
            System.out.println("We have " + duration.toDays() + " days left to the provided target date.");
        } catch (TimeAlreadyPassedException e) {
            e.printStackTrace();
        }
    }
}
