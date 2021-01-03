package com.prasertcbs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ref: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
 */
public class Main {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-d (D)");
        System.out.println(now.format(formatter));
    }

    public static void demo2() {
        String[] patterns = {
                "yyyy-MM-dd",
                "yyyy-MMM-d",
                "E, yyyy-MMMM-d",
                "EE, yyyy-MMMM-d",
                "EEE, yyyy-MMMM-d",
                "EEEE, yyyy-MMMM-d hh:mm a",
                "EEEEE, yyyy-MMMM-d kk:mm:ss",
                "kk:mm 'o''clock'"
        };
        LocalDateTime now = LocalDateTime.now();
        for (String pattern : patterns) {
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            //System.out.printf("%-30s -> %s%n",pattern, now.format(formatter));
            System.out.printf("%-30s -> %s%n", pattern, now.format(DateTimeFormatter.ofPattern(pattern)));
        }
    }
}
