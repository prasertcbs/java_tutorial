package com.prasertcbs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    //static PriorityQueue<Applicant> applicants = new PriorityQueue<>(new Comparator<Applicant>() {
    //    @Override
    //    public int compare(Applicant o1, Applicant o2) {
    //        if (Integer.compare(o1.getScore(), o2.getScore()) == 0) {
    //            return o1.getName().compareToIgnoreCase(o2.getName());
    //        } else {
    //            return Integer.compare(o2.getScore(), o1.getScore());
    //        }
    //    }
    //});

    // lambda expression
    //static PriorityQueue<Applicant> applicants = new PriorityQueue<>(
    //        (Applicant o1, Applicant o2) -> {
    //            if (Integer.compare(o1.getScore(), o2.getScore()) == 0) {
    //                return o1.getName().compareToIgnoreCase(o2.getName());
    //            } else {
    //                return Integer.compare(o2.getScore(), o1.getScore());
    //            }
    //        }
    //);

    // method references
    static PriorityQueue<Applicant> applicants = new PriorityQueue<>(
            Comparator.comparing(Applicant::getScore).reversed()
                    .thenComparing(Applicant::getName)
    );

    public static void main(String[] args) {
        createData();
        pollQueue();
    }

    private static void pollQueue() {
        int q = 0;
        while (!applicants.isEmpty()) {
            System.out.printf("queue #%d -> %s%n", ++q, applicants.poll());
        }
    }

    private static void createData() {
        applicants.offer(new Applicant("Jack", 92));
        applicants.offer(new Applicant("April", 75));
        applicants.offer(new Applicant("Jill", 80));
        applicants.offer(new Applicant("Bruce", 69));
        applicants.offer(new Applicant("Zena", 72));
        applicants.offer(new Applicant("Clark", 88));
        applicants.offer(new Applicant("Linda", 92));
    }
}
