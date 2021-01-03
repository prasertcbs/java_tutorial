package com.prasertcbs;

/**
 * Created by prasert on 10/15/2014.
 */
public class Staff extends Person {
    private String officeLocation;
    private String position;

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
