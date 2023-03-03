package Chapter;

import java.util.Scanner;

public class Chapter1 {
    String name;
    String model;
    int price;

    public Chapter1() {
        name = "no name";
        model = "no model";
        price = 0;
    }

    public Chapter1(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {

        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public String toString() {
        return name + model + price;
    }

    public String getCategory() {
        if (price > 1000) {
            return "TOP";
        } else if (price <= 1000 && price >= 500) {
            return "MEDIUM";
        } else {
            return "SIMPLE";
        }
    }
}




