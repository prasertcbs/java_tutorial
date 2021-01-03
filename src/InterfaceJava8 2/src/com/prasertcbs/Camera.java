package com.prasertcbs;

/**
 * Created by prasert on 10/22/2014.
 */
public class Camera implements ICamera {
    @Override
    public void takePhoto() {
        System.out.println("Cheese");
    }

    @Override
    public void changeAperture() {
        System.out.println("Adjust aperture");
    }
}
