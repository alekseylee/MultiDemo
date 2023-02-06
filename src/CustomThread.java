//public class CustomThread extends Thread{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100 ; i++) {
//            System.out.println(i);
//        }
//    }
//}

public class CustomThread implements Runnable{

    private String sign;
    private int times;

    public CustomThread(String sign, int times) {
        this.sign = sign;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times ; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " " +sign);
            Thread.yield();
        }
    }
}
