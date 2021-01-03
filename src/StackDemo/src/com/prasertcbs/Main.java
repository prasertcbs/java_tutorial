package com.prasertcbs;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        demo();
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
}
