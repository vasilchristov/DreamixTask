package com.company;

import java.time.Duration;
import java.time.Instant;

public class TimeUtility {

    public static Duration getRemainingTimeTill(long timestampInEpochMilliseconds) throws TimeAlreadyPassedException {
        final Instant now = Instant.now();
        final Instant target = Instant.ofEpochMilli(timestampInEpochMilliseconds);
        if (target.isBefore(now)) {
            throw new TimeAlreadyPassedException("The provided timestamp is in the past.");
        }
        return Duration.between(now, target);
    }
}

class TimeAlreadyPassedException extends Exception {
    public TimeAlreadyPassedException(String message) {
        super(message);
    }
}
