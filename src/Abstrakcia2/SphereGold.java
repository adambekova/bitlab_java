package Abstrakcia2;

public class SphereGold extends GoldShape {
    double radius;

    public SphereGold() {
        double radius = 0.0;
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (3.14 * (radius * radius * radius)) * 4 / 3;
    }
}
