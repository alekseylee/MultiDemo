package Opdrachten.opdracht6;

import java.time.LocalDateTime;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(LocalDateTime.now() + ": " + i);
            Thread.sleep(1000);
        }
    }
}
