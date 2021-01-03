package com.prasertcbs;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo() {
        Person p1 = new Person("Mr.", "Peter", "Parker", LocalDate.of(1995, Month.JULY, 17));
        System.out.println(p1);

        Person p2 = new Person("Mr.", "Peter", "Parker",
                               "นาย","ปีเตอร์","ปาร์คเกอร์", LocalDate.of(1995, Month.JULY,17));
        System.out.println(p2);
    }

    public static void demo2() {
        PersonV2 p1 = new PersonV2();
        PersonName th = new PersonName("นาย","ปีเตอร์","ปาร์คเกอร์");
        PersonName en = new PersonName("Mr.", "Peter", "Parker");
        p1.setNameTh(th);
        p1.setNameEn(en);
        p1.setDob(LocalDate.of(1995, Month.JULY, 17));

        Map<String, String> phone = new HashMap<String, String>();
        phone.put("mobile", "0812345678");
        phone.put("home", "021111111");
        phone.put("office", "022185555");
        phone.put("office2", "022188888");
        p1.setPhone(phone);


        PersonV2 p2 = new PersonV2(new PersonName("Mr.", "Peter", "Parker"),
                                   new PersonName("นาย","ปีเตอร์","ปาร์คเกอร์"),
                                   LocalDate.of(1995, Month.JULY, 17));


        System.out.println(p1);
    }
}
