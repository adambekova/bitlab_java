package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MainAccount2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Account2> IIN = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            IIN.put(in.next(), new Account2(in.next(), in.next(), in.next()));

        }

        for (String key : IIN.keySet()) {
            System.out.println(IIN.get(key) + key);
        }
    }
}


class Account2 {
    String name;
    String surname;
    String city;

    public Account2() {
        String name = "no name";
        String surname = "no surname";
        String city = "no city";
    }

    public Account2(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Account " + name + " " + surname + " from " + city + " has IIN number: ";
    }
}

