package com.prasertcbs;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Created by prasert on 10/22/2014.
 */
public interface ICamera {
    void takePhoto(); // abstract method
    void changeAperture();

    default void takeHdrPhoto() {
        System.out.println("take 3 photos with different exposures and combine them together");
    }

    default void shootVideo() {
        System.out.println("shooting a video");
    }

    // utility function/method
    // public
    static LocalDateTime currentLocalDateTime() {
        return LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    }
}
