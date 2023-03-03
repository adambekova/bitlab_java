package Abstrakcia;

public abstract class Food {
    public abstract double getCalories();


    String name;

    public Food() {
        String name = "no name";
    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

