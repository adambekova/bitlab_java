package Abstrakcia;

public class Coke extends Food {
    double volumeLiters;
    boolean isSparkling;

    public Coke() {
        super();
        double volumeLiters = 0;
        boolean isSparkling = true;
    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public void setSparkling(boolean isSparkling) {
        this.isSparkling = isSparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling) {
            return volumeLiters * 400;
        } else {
            return volumeLiters * 100;
        }
    }
}
