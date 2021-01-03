package com.prasertcbs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Camera c = new Camera();
        c.changeAperture();
        c.takePhoto();
        System.out.println(ICamera.currentLocalDateTime());
        c.takeHdrPhoto();
        c.shootVideo();
    }
}
