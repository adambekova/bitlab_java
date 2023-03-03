package Abstrakcia;

import com.sun.source.tree.BreakTree;

public class Burger extends Food {
    int meatAmount;
    int meatType;

    public Burger() {
        super();
        int meatAmount = 0;
        int meatType = 0;
    }

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    @Override
    public double getCalories() {
        if (meatType == 1) {
            return meatAmount * 840;
        } else {
            return meatAmount * 560;
        }
    }

    public int getMeatAmount() {
        return meatAmount;
    }

    public int getMeatType() {
        return meatType;
    }

    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }

    public void setMeatType(int meatType) {
        this.meatType = meatType;
    }
}
