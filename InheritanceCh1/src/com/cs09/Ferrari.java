package com.cs09;

public class Ferrari extends Car {
    private int roadServiceMonths;

    public Ferrari(int roadServiceMonths) {
        super("Ferrari", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changedGear(1);
        }
        else if(newVelocity > 0 && newVelocity <= 10)
            changedGear(1);
        else if(newVelocity > 10 && newVelocity <= 20)
            changedGear(2);
        else if(newVelocity > 20 && newVelocity <= 30)
            changedGear(3);
        else
            changedGear(4);

        if(newVelocity > 0){
            changedVelocity(newVelocity, getCurrentDirection());
        }
    }
}
