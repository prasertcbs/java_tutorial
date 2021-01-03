package com.prasertcbs;

/**
 * Created by prasert on 10/21/2014.
 */
public class SmartCamera implements ICamera, IGps {
    @Override
    public void takePhoto() {

    }

    @Override
    public void changeAperture() {

    }

    @Override
    public void changeShutterSpeed() {

    }

    @Override
    public void deletePhoto() {

    }

    @Override
    public float receiveLat() {
        return 0;
    }

    @Override
    public float receiveLon() {
        return 0;
    }

    @Override
    public boolean isGpsEnabled() {
        return false;
    }
}
