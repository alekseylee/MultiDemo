package Opdrachten.opdracht4;

public class Threadalicious {
    public static void main(String[] args) {

        Thread thread1 = new Thread(()->print('*', 10000));
        Thread thread2 = new Thread(()->print('#', 100));
        thread1.setDaemon(true);

        thread1.start();
        thread2.start();

    }

    public static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(c);
            Thread.yield();
        }
    }
}