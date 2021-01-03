package com.company;

/**
 * Created by prasert on 5/11/2014.
 */
public class Contact {
    private String firstName, lastName;
    private String phoneNumber;

    public Contact() {

    }

    public Contact(String firstName, String lastName, String phoneNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        // petEr -> Peter
//        Utils util = new Utils();
        this.firstName = Utils.capitalizedFirstCharOfString(firstName);
//        this.firstName = firstName.substring(0, 1).toUpperCase() +
//                firstName.substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
//        Utils util = new Utils();
        this.lastName = Utils.capitalizedFirstCharOfString(lastName);
//        this.lastName = lastName.substring(0, 1).toUpperCase() +
//                lastName.substring(1).toLowerCase();
    }

//    private String capitalizedFirstCharOfString(String s) {
//        return s.substring(0, 1).toUpperCase() +
//                s.substring(1).toLowerCase();
//    }

    public String getPhoneNumber() {
        return prettyFormatPhoneNumber();
    }

    public void setPhoneNumber(String phoneNumber) {
        // \D -> non numeric character
        this.phoneNumber = phoneNumber.replaceAll("[\\D]", ""); // regular expression
    }

    public String prettyFormatPhoneNumber() {
        if (phoneNumber.length() == 9) {
            return phoneNumber.replaceAll("(\\d{2})(\\d{3})(\\d{4})", "($1)-$2-$3");
        } else {
            return phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1)-$2-$3");
        }

//        return phoneNumber.replaceAll("(\\d{2})(\\d{4})(\\d{4})", "($1) $2 $3");
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + prettyFormatPhoneNumber() + '\'' +
                '}';
    }
}
