package Opdrachten.opdracht3;



public class Threadalicious {
    public static void main(String[] args) {

        Thread thread1 = new Thread(()->print('*', 10));
        Thread thread2 = new Thread(()->print('#', 10));

        thread1.start();
        thread2.start();
        print('@', 10);
    }

    public static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(c);
            Thread.yield();

        }
    }
}
