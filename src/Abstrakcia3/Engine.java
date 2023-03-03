package Abstrakcia3;

public abstract class Engine {
    abstract double efficiency();

    abstract double throttleEnergy();

    abstract double breakEnergy();


    double engineVolume;
    int cylinderAmount;
    double engineWeight;

    public Engine() {
        double engineVolume = 0.0;
        int cylinderAmount = 0;
        double engineWeight = 0.0;
    }

    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight= engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    public double getMaxSpeed() {
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
}


