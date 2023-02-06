package Opdrachten.opdracht2;

public class Threadalicious {
    public static void main(String[] args) {

        CharacterPrinter characterPrinter1 = new CharacterPrinter('*', 100);
        CharacterPrinter characterPrinter2 = new CharacterPrinter('#', 100);

        Thread thread1 = new Thread(characterPrinter1);
        Thread thread2 = new Thread(characterPrinter2);

        thread1.start();
        thread2.start();

    }
}
