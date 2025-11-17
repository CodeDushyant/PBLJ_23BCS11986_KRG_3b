public class OddEvenThreads {
    public static void main(String[] args) {
        Printer p = new Printer();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 15; i += 2)
                p.printOdd(i);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 15; i += 2)
                p.printEven(i);
        });

        t1.start();
        t2.start();
    }
}
