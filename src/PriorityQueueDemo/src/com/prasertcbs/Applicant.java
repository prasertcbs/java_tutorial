package com.prasertcbs;

/**
 * Created by prasert on 12/5/2014.
 */
public class Applicant {
    private String name;
    private int score;

    public Applicant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
