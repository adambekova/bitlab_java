package Classiobject;

import java.util.Scanner;

public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player() {
        number = 0;
        name = "no name";
        surname = "no surname";
        position = "no position";

    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString() {
        return "Player{" + "number=" + number + ", " + "name=" + "" + "'" + name + "'" + ", " + "surname=" + "'" + surname + "'" + ", " + "position=" + "'" + position + "'" + "}";
    }
}


