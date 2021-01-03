package com.prasertcbs;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("th", "TH", "TH"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        double number = 12345678.1234;
        //System.out.println(nf.format(number));
        //System.out.println(thaiNumeral(number));
        System.out.println(thaiNumeral(number, "#,##0.000"));
        System.out.println(thaiNumeral(.3456, "0.00%"));
    }

    public static String thaiNumeral(double number) {
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("th", "TH", "TH"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(number);
    }

    public static String thaiNumeral(double number, String pattern) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("th", "TH", "TH"));
        df.applyPattern(pattern);
        return df.format(number);
    }
}
