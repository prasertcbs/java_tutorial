package com.prasertcbs;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //demo();
        String s = "love";
        System.out.println(reverseString(s));
    }

    public static void demo() {
        Stack<String> st = new Stack<>();
        st.push("mango");
        st.push("coconut");
        st.push("banana");
        st.push("apple");
        st.push("kiwi");
        st.push("orange");

        System.out.println(st);

        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.search("kiwi"));
        System.out.println(st.search("apple"));
        System.out.println(st.search("coconut"));

        System.out.println(st.contains("apple"));
        System.out.println(st.contains("watermelon"));

        System.out.println("...popping...");
        while (!st.empty()) {
            System.out.println(st.pop());
        }
    }

    public static String reverseString(String s) {
        // love -> evol
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            System.out.println(st);
        }
        StringBuilder sb = new StringBuilder();
        while (!st.empty()) {
            System.out.println(st.peek());
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
