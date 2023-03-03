package Abstrakcia;

public class Chocolate extends Food {
    int weight;

    public Chocolate() {
        super();
        this.weight = 0;
    }

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return weight * 740;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

