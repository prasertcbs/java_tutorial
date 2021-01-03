package com.company;

public class Main {

    public static String stromType(int speed) {
        String stormName = "";
        if (speed < 63) {
            stormName = "Depression";
        } else if (speed >= 63 && speed < 118) {
            stormName = "Tropical storm";
        } else {
            stormName = "Typhoon";
        }
        return stormName;
    }

    public static String zodiac(int buddhistYear) {
        int z = buddhistYear % 12; // mod 5 % 2 = 1
        String s = "";
        if (z == 0) {
            s = "มะเส็ง";
        } else if (z == 1) {
            s = "มะเมีย";
        } else if (z == 2) {
            s = "มะแม";
        } else if (z == 3) {
            s = "วอก";
        } else if (z == 4) {
            s = "ระกา";
        } else if (z == 5) {
            s = "จอ";
        } else if (z == 6) {
            s = "กุน";
        } else if (z == 7) {
            s = "ชวด";
        } else if (z == 8) {
            s = "ฉลู";
        } else if (z == 9) {
            s = "ขาล";
        } else if (z == 10) {
            s = "เถาะ";
        } else if (z == 11) {
            s = "มะโรง";
        }
        return s;
    }

    public static String zodiac2(int buddhistYear) {
        int z = buddhistYear % 12;
        String s = "";
        switch (z) {
            case 0:
                s = "มะเส็ง";
                break;
            case 1:
                s = "มะเมีย";
                break;
            case 2:
                s = "มะแม";
                break;
            case 3:
                s = "วอก";
                break;
            case 4:
                s = "ระกา";
                break;
            case 5:
                s = "จอ";
                break;
            case 6:
                s = "กุน";
                break;
            case 7:
                s = "ชวด";
                break;
            case 8:
                s = "ฉลู";
                break;
            case 9:
                s = "ขาล";
                break;
            case 10:
                s = "เถาะ";
                break;
            case 11:
                s = "มะโรง";
                break;
        }
        return s;
    }

    public static String testSwitch(String s) {
        String result = "";
        switch (s) {
            case "one":
                result = "หนึ่ง";
                break;
            case "two":
                result = "สอง";
                break;
            default:
                result = "อื่นๆ";

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(testSwitch("one"));
        System.out.println(testSwitch("two"));
        System.out.println(testSwitch("three"));

//        System.out.println(2557 % 12);
//        System.out.println(2556 % 12);
//        System.out.println(stromType(63));
//        System.out.println(zodiac(2557));
//        System.out.println(zodiac(2558));
//        System.out.println(zodiac(2559));
//        System.out.println(zodiac(2556));
        // write your code here
    }
}
