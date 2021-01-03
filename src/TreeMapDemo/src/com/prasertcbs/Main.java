package com.prasertcbs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

//        System.out.println("---- using TreeMap -----");
//        treeMapDemo();
//        System.out.println();
//        System.out.println("---- using HashMap -----");
//        hashMapDemo();

        int score = 85;
        System.out.println("--- using if ---");
        System.out.println(gradeLetterIf(score));
        System.out.println("--- using treeMap ----");
        System.out.println(gradeLetterTreeMap(score));
    }

    public static void treeMapDemo() {
        TreeMap<Integer, String> m = new TreeMap<Integer, String>();
        m.put(1133, "สอบถามเลขหมายโทรศัพท์");
        m.put(183,"สอบถามเลขหมายในภูมิภาค");
        m.put(189,"รับร้องเรียนเรื่องโทรศัพท์");
        m.put(1177,"แจ้งโทรศัพท์ขัดข้อง(กด 1177 ตามด้วยเลขหมายโทรศัพท์ที่ขัดข้อง)");
        for (Map.Entry<Integer, String> item : m.entrySet()) {
            Integer key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
    }

    public static String gradeLetterIf(int score) {
        /*
         0 - 49  F
        50 - 59  D
        60 - 69  C
        70 - 79  B
        80 - 100 A
         */
        String grade = "";
        if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public static String gradeLetterTreeMap(int score) {
        TreeMap<Integer, String> gradeMap = new TreeMap<Integer, String>();
        gradeMap.put(0, "F");  // [0, 50)
        gradeMap.put(50, "D"); // [50, 56)
        gradeMap.put(56, "D+"); // [56, 60)
        gradeMap.put(60, "C"); // [60, 66)
        gradeMap.put(66, "C+"); // [66, 70)
        gradeMap.put(70, "B"); // [70, 76)
        gradeMap.put(76, "B+"); // [76, 80)
        gradeMap.put(80, "A"); // [80, 86)
        gradeMap.put(86, "A+"); // [86, 100)
        return gradeMap.floorEntry(score).getValue();
    }

    public static void hashMapDemo() {
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(1133, "สอบถามเลขหมายโทรศัพท์");
        m.put(183,"สอบถามเลขหมายในภูมิภาค");
        m.put(189,"รับร้องเรียนเรื่องโทรศัพท์");
        m.put(1177,"แจ้งโทรศัพท์ขัดข้อง(กด 1177 ตามด้วยเลขหมายโทรศัพท์ที่ขัดข้อง)");
        for (Map.Entry<Integer, String> item : m.entrySet()) {
            Integer key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }
    }
}
