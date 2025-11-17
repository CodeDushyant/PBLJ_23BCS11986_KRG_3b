class Printer{
    boolean isOdd = false;

    synchronized void printOdd(int number) {
        while (isOdd) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Odd: " + number);
        isOdd = true;
        notify();
    }

    synchronized void printEven(int number) {
        while (!isOdd) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Even: " + number);
        isOdd = false;
        notify();
    }
}
