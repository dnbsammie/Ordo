package com.dnbsammie.utils;

import java.time.Duration;

public class TimeUtils {
    public static String formatDuration(Duration duration) {
        return String.format("%d horas, %d minutos",
                duration.toHours(),
                duration.toMinutesPart());
    }
}