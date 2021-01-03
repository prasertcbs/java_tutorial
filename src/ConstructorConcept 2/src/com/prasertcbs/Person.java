package com.prasertcbs;

/**
 * Created by prasert on 11/8/2014.
 */
public class Person {
    private String firstName, lastName, nickName, gender;

    public Person(String firstName, String lastName, String nickName, String gender) {
//        this.firstName = firstName.trim().substring(0,1).toUpperCase() +
//                firstName.trim().substring(1).toLowerCase();
        setFirstName(firstName);
        this.lastName = lastName;
        this.nickName = nickName;
        this.gender = gender;
    }

    // chain constructor
    public Person(String firstName, String nickName) {
        this(firstName, "", nickName, "");
    }

    public Person(String firstName, String lastName, String gender) {
        this(firstName, lastName, "", gender);
    }

    /*
            public Person(String firstName, String nickName) {
                this.firstName = firstName.trim().substring(0,1).toUpperCase() +
                        firstName.trim().substring(1).toLowerCase();
        //        this.firstName = firstName;
                this.nickName = nickName;
            }

            public Person(String firstName, String lastName, String gender) {
                this.firstName = firstName.trim().substring(0,1).toUpperCase() +
                        firstName.trim().substring(1).toLowerCase();
        //        this.firstName = firstName;
                this.lastName = lastName;
                this.gender = gender;
            }
        */
    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
//        this.firstName = firstName;
        this.firstName = firstName.trim().substring(0,1).toUpperCase() +
                firstName.trim().substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
