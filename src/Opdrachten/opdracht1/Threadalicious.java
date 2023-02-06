package Opdrachten.opdracht1;

public class Threadalicious {
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread('*', 100);
        MyThread myThread2 = new MyThread('#', 100);

        myThread1.start();
        myThread2.start();

    }
}
