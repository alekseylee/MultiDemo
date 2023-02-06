package Opdrachten.opdracht2;

import com.sun.security.jgss.GSSUtil;

public class CharacterPrinter implements Runnable {
    private char c;
    private int count;

    public CharacterPrinter(char c, int count) {
        this.c = c;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(c);
        }
    }

}
