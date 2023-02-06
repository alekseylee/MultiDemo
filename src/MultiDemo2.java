public class MultiDemo2 {
    public static void main(String[] args) {

        Thread thread = new Thread(new CustomThread("&", 100));
        thread.run();

        thread.interrupt();

    }
}
