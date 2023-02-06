package Opdrachten.opdracht1;

public class MyThread extends Thread{
    private char c;
    private int count;

    public MyThread(char c, int count) {
        this.c = c;
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(c);
        }
    }
}
