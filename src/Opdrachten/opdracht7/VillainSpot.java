package Opdrachten.opdracht7;

import java.util.Random;

public class VillainSpot {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        TimeBomb timeBomb = new TimeBomb(10);
        timeBomb.activate();
        Thread.sleep(random.nextInt(30000));
        timeBomb.disarm();
    }
}
