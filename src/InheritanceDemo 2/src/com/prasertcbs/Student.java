package com.prasertcbs;

/**
 * Created by prasert on 10/15/2014.
 */

// child class, derived class
public class Student extends Person {
    private String faculty, major;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
