package com.prasertcbs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        List<Province> list = createProvinceList("provinces.csv");
//        list.sort(comparatorByArea()); // Java 8

//        Collections.sort(list, comparatorByArea());

//        list.sort(new Comparator<Province>() {
//            @Override
//            public int compare(Province o1, Province o2) {
//                return Float.valueOf(o1.getArea()).compareTo(Float.valueOf(o2.getArea()));
//            }
//        });

//        list.sort(new Comparator<Province>() {
//            @Override
//            public int compare(Province o1, Province o2) {
//                return o1.getNameEn().compareTo(o2.getNameEn());
//            }
//        });

//        list.sort(new Comparator<Province>() {
//            @Override
//            public int compare(Province o1, Province o2) {
//                Collator coll = Collator.getInstance(new Locale("th", "TH"));
//                return coll.compare(o1.getNameTh(), o2.getNameTh());
////                return o1.getNameTh().compareTo(o2.getNameTh());
//            }
//        });

//        list.sort(new Comparator<Province>() {
//            @Override
//            public int compare(Province o1, Province o2) {
////                return o1.getNameThLength() - o2.getNameThLength();
//                return Integer.valueOf(o1.getNameThLength()).compareTo(Integer.valueOf(o2.getNameThLength()));
//            }
//        });
//
        list.sort(new Comparator<Province>() {
            @Override
            public int compare(Province o1, Province o2) {
                Collator coll = Collator.getInstance(new Locale("th", "TH"));
                if (o1.getNameThLength() == o2.getNameThLength()) {
                    return coll.compare(o1.getNameTh(), o2.getNameTh());
                } else {
                    return Integer.valueOf(o1.getNameThLength()).compareTo(Integer.valueOf(o2.getNameThLength()));
                }
            }
        });

        showList(list);
    }

    public static void showList(List<Province> list) {
        for (Province province : list) {
            System.out.printf("%s %s %s %,.2f %d%n", province.getNameTh(), province.getNameEn(), province.getAbbr(),
                              province.getArea(), province.getNameThLength());
        }
    }

    public static Comparator comparatorByArea() {
        Comparator cmp = new Comparator<Province>() {
            @Override
            public int compare(Province o1, Province o2) {
                // ascending order
                return Float.valueOf(o1.getArea()).compareTo(Float.valueOf(o2.getArea()));
            }
        };
        return cmp;
    }

    public static List<Province> createProvinceList(String fileName) {
        List<Province> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
//                System.out.println(Arrays.toString(data));
//                System.out.println(data[0]);
//                System.out.println(line);
                list.add(new Province(data[0], data[1], data[2], Float.parseFloat(data[3])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
