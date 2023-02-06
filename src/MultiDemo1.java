public class MultiDemo1 {
    public static void main(String[] args) {
//        Thread thread = new Thread(new CustomThread("^", 5));
//        Thread thread2 = new Thread(new CustomThread("#", 5));
//        thread.setName("^");
//        thread2.setName("#");
//        System.out.println(thread.getState());
//        System.out.println(thread2.getState());
//        thread.start();
//        thread2.start();
//
//        System.out.println(thread.getState());
//        System.out.println(thread2.getState());
//        try {
//            Thread.sleep(2000);
//        }catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        CustomThread customThread = new CustomThread();
//        CustomThread customThread2 = new CustomThread();
//        customThread.start();
//        customThread2.start();

        Thread thread = new Thread(new CustomThread("^", 5 ));
        Thread thread2 = new Thread(new CustomThread("#", 5));

        thread.setName("^");
        thread2.setName("#");

        thread.start();
        thread2.start();
    }
}
