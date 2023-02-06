package Opdrachten.opdracht7;

import java.util.Random;

public class TimeBomb {
    private int timeLeft;
    private boolean isActive;

    public TimeBomb(int time) {
        this.timeLeft = time;
    }

    public void activate() {
        this.isActive = true;
        System.out.println("The bomb is now active and ticking down from " + this.timeLeft + " seconds.");
        while (this.timeLeft > 0) {
            try {
                Thread.sleep(1000);
                System.out.println("Time left: " + --this.timeLeft + " seconds.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.isActive) {
            System.out.println("BOOOOOM!!! The bomb exploded.");
        }
    }

    public void disarm() {
        this.isActive = false;
        System.out.println("The bomb has been disarmed.");
    }
}