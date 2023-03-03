package Classiobject;

import java.util.Scanner;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public Club() {
        name = "no name";
        country = "no country";
        ratingPoints = 0;
        players = null;
    }

    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData() {
        System.out.println("Name: " + name + " " + "Country: " + country + " " + "RatingPoints: " + ratingPoints + " " + "Players: ");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}
