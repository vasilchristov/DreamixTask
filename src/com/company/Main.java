package com.company;

import java.time.Duration;

public class Main {

    private static final int FROM = 8;
    private static final int TO = 15;

    private static final String INPUT_TEXT = "'To be or not to have been ... that's the best unbelievable question in whole world.'";
    private static final String SUBSTRING_TO_BE_FOUND_IN_TEXT = "be";

    public static void main(String[] args) {
        executeExercise_1();
        executeExercise_2();
        executeExercise_3();
    }

    private static void addUserFriendlyText(final int numberOfWordsFound) {
        System.out.println("The provided text string is:");
        System.out.println(INPUT_TEXT);
        System.out.println();
        System.out.println("There are " + numberOfWordsFound + " words found" + " with substring '" + SUBSTRING_TO_BE_FOUND_IN_TEXT + "' in the provided text and they are: ");
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

    private static void executeExercise_3() {
        System.out.println();
        System.out.println("Executing Exercise 3..... ");

        final String[] array = StringUtility.getAllWordsFromAStringContainingASubstring(INPUT_TEXT, SUBSTRING_TO_BE_FOUND_IN_TEXT);
        addUserFriendlyText(array.length);

        for (int i = 0; i < array.length; i++) {
            final int positionOfFoundWordInsideText = i + 1;
            final String foundWordFromprovidedSubstring = array[i];
            System.out.println(positionOfFoundWordInsideText + ") " + foundWordFromprovidedSubstring);
        }
    }
}
