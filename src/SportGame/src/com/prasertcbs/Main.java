package com.prasertcbs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Team teamA = new Team();
        teamA.setName("Cavaliers");
        teamA.setCity("Cleveland");
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("LeBron", "James", "forward", LocalDate.of(1994, Month.JULY,1)));
        players.add(new Player("Mike", "Will", "center", LocalDate.of(1994, Month.JULY,1)));
        players.add(new Player("Jame", "Jackson", "forward", LocalDate.of(1994, Month.JULY,1)));
        players.add(new Player("Jack", "Smith", "guard", LocalDate.of(1994, Month.JULY,1)));
        players.add(new Player("Peter", "Parker", "guard", LocalDate.of(1994, Month.JULY,1)));
        teamA.setPlayers(players);

        System.out.println(teamA);

        Team teamB = new Team();
        teamB.setName("Hawks");
        teamB.setCity("Atlanta");
        List<Player> playersB = new ArrayList<Player>();
        playersB.add(new Player("Bill", "James", "forward", LocalDate.of(1994, Month.JULY,1)));
        playersB.add(new Player("Alex", "Will", "center", LocalDate.of(1994, Month.JULY, 1)));
        playersB.add(new Player("Brad", "Jackson", "forward", LocalDate.of(1994, Month.JULY, 1)));
        playersB.add(new Player("John", "Smith", "guard", LocalDate.of(1994, Month.JULY,1)));
        playersB.add(new Player("Bruce", "Parker", "guard", LocalDate.of(1994, Month.JULY,1)));
        teamB.setPlayers(players);
        System.out.println(teamB);

        Match m = new Match(teamA, teamB, "Cleveland",
                            LocalDateTime.of(2014, Month.NOVEMBER, 13, 18,0,0));

        System.out.println(m);

    }
}
