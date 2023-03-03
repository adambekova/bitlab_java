package Classiobject;

import java.util.Scanner;

public class Phone {

    String name;
    String model;
    int price;

    public Phone() {
        name = "no name";
        model = "no model";
        price = 0;
    }

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;

    }

    public String getData() {
        return name + " - " + model + " for " + price + " KZT";
    }

}


