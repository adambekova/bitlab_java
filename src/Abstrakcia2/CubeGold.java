package Abstrakcia2;

public class CubeGold extends GoldShape {
    double side;

    public CubeGold() {
        double side = 0.0;
    }

    public CubeGold(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }
}
