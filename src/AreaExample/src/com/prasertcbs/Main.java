package com.prasertcbs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double width, height, area;
        Scanner in = new Scanner(System.in);

        System.out.print("enter width: ");
        width = in.nextDouble();

        System.out.print("enter height: ");
        height = in.nextDouble();

        area = Area.rectangle(width, height);
        System.out.println("area = " + area);

        in.nextLine();
        System.out.print("press Enter to exit");
        in.nextLine();
        System.out.println("bye");
    }
}