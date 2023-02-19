package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

    public static int generateRandomNumberInRange(int from, int to) {
        System.out.println("The randomly generated number will be in the range between " + from + " (inclusive) and " + to + " (exclusive).");

        if (from >= to) {
            throw new IllegalArgumentException("The provided 'from' value must be smaller than the provided 'to' value!");
        }
        int randomNumberInSpecificRange = ThreadLocalRandom.current().nextInt(from, to);
        return randomNumberInSpecificRange;
    }
}
