package com.prasertcbs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        // Map Interface
        // HashMap implements Map interface
        Map<String, String> m = new HashMap<String, String>();
        // Key, Value
        m.put("cn", "China");
        m.put("th", "Thailand");
        m.put("jp", "Japan");

//        System.out.println(m.get("jp"));

        for (Map.Entry<String, String> item : m.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }

        System.out.println("----------------------");
        m.put("th", "Siam");

        for (Map.Entry<String, String> item : m.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n", key, value);
        }

        if (m.containsValue("Japan")) {
            System.out.println("found Japan");
        }

        if (m.containsKey("cn")) {
            System.out.println("found key cn");
            m.remove("cn");
            System.out.println("----------------remove cn-------------");
            for (Map.Entry<String, String> item : m.entrySet()) {
                String key = item.getKey();
                String value = item.getValue();
                System.out.printf("%s => %s\n", key, value);
            }
        }

    }
}
