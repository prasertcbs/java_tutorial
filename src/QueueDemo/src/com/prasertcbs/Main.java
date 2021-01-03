package com.prasertcbs;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Queue<String> q = new LinkedList<String>();
        q.offer("mango");
        q.offer("apple");
        q.offer("coffee");
        q.offer("green tea");
        System.out.println(q);

        System.out.println(q.peek());
        q.poll();

        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}
