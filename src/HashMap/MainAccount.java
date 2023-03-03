package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account account1 = new Account("Madina", "Adambekova", "Almaty");
        Account account2 = new Account("Bagdat", "Rahimov", "Almaty");
        Account account3 = new Account("Fatima", "Adambekova", "Almaty");
        Account account4 = new Account("Bagdat", "Rahimov", "Almaty");
        Account account5 = new Account("Bagdat", "Rahimov", "Almaty");

        HashMap<String, Account> IIN = new HashMap<>();

        IIN.put("930700421562", account1);
        IIN.put("823456789123", account2);
        IIN.put("789456123321", account3);
        IIN.put("963258741147", account4);
        IIN.put("741258963258", account4);
        IIN.put("852136547898", account5);

        for (String key : IIN.keySet()) {
            System.out.println(IIN.get(key) + key);

        }
    }
}

class Account {
    String name;
    String surname;
    String city;

    public Account() {
        String name = "no name";
        String surname = "no surname";
        String city = "no city";
    }

    public Account(String name, String surname, String city) {
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

