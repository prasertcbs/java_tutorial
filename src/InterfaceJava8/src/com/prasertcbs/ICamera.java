package com.prasertcbs;

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
}
