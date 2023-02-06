package Opdrachten.opdracht5;

public class Threadalicious {
    public static void main(String[] args) {

        Thread thread1 = new Thread(()->print('*', 10000));
        Thread thread2 = new Thread(()->print('#', 100));
        thread1.setName("T1");
        thread2.setName("T2");

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
            thread1.interrupt();
            Thread.sleep(1000);
            thread2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(c);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+ " is interrupted.");
            }

        }
    }
}
