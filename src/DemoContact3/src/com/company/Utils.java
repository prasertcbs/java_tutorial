package com.company;

/**
 * Created by prasert on 5/11/2014.
 */
public class Utils {
    // static method -> class method
    public static String capitalizedFirstCharOfString(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }
}
