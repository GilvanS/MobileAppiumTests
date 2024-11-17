package tests.utils;

import java.time.Duration;

public enum SecondsConstants {

    DEFAULT_POLLING_SECONDS(1),
    FIVE_SECONDS(5),
    TEN_SECONDS(10),
    FIFTEEN_SECONDS(15),
    TWENTY_SECONDS(20),
    THIRTY_SECONDS(30),
    FORTY_SECONDS(40);

    private Integer value;

    SecondsConstants(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public class Constants {
        public static final int TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS = 60;
        public static final int DEFAULT_DELAY_IN_MILLISECONDS = 1000;
        public static final int SEND_KEYS_DELAY_IN_MILLISECONDS = 1000;


    }
}

