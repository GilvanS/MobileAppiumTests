package tests.utils;

import java.time.Duration;

public enum DurationConstants {

    D_10SECONDS(Duration.ofSeconds(10)),
    D_500MILLIS(Duration.ofMillis(500));

    private Duration duration;

    DurationConstants(Duration duration) {
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }
}
