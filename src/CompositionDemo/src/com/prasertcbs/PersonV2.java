package com.prasertcbs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by prasert on 11/4/2014.
 */
public class PersonV2 {

    // PersonV2 composes of PersonName(en, th).
    private PersonName nameEn, nameTh;
    private LocalDate dob;
    //    private String mobileNumber, homeNumber, officeNumber, mobileNumber2, homeNumber2;
    private Map<String, String> phone = new HashMap<String, String>();

    public Map<String, String> getPhone() {
        return phone;
    }

    public void setPhone(Map<String, String> phone) {
        this.phone = phone;
    }

    public PersonV2(PersonName nameEn, PersonName nameTh, LocalDate dob) {
        this.nameEn = nameEn;
        this.nameTh = nameTh;
        this.dob = dob;
    }

    public PersonV2() {
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "nameEn=" + nameEn +
                ", nameTh=" + nameTh +
                ", dob=" + dob +
                '}';
    }

    public PersonName getNameEn() {
        return nameEn;
    }

    public void setNameEn(PersonName nameEn) {
        this.nameEn = nameEn;
    }

    public PersonName getNameTh() {
        return nameTh;
    }

    public void setNameTh(PersonName nameTh) {
        this.nameTh = nameTh;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
