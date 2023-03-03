package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class MainAccount1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account1 account1 = new Account1("Madina", "Adambekova", "Almaty");
        Account1 account2 = new Account1("Bagdat", "Rahimov", "Almaty");
        Account1 account3 = new Account1("Fatima", "Adambekova", "Almaty");
        Account1 account4 = new Account1("Bagdat", "Rahimov", "Almaty");
        Account1 account5 = new Account1("Bagdat", "Rahimov", "Almaty");

        HashMap<String, Account1> IIN = new HashMap<>();

        IIN.put("930700421562", account1);
        IIN.put("823456789123", account2);
        IIN.put("789456123321", account3);
        IIN.put("963258741147", account4);
        IIN.put("741258963258", account4);
        IIN.put("852136547898", account5);

        String str=in.next();
        boolean check=false;
        for (String key : IIN.keySet()) {
            if (str.equals(key)) {
                check = true;
                System.out.println(IIN.get(key) + key);

            }
        }if (!check)
            System.out.println("Account not found");
        }
     }


class Account1 {
    String name;
    String surname;
    String city;

    public Account1() {
        String name = "no name";
        String surname = "no surname";
        String city = "no city";
    }

    public Account1(String name, String surname, String city) {
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

