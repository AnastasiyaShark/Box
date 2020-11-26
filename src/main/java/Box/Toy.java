package Box;

public class Toy extends Thread {

    @Override
    public void run() {
        Tumbler tumbler = Tumbler.getInstance();
        Thread thisThread = Thread.currentThread();
        while (thisThread.isAlive() && !thisThread.isInterrupted()) {
            if (tumbler.isTumblersState()) {
                tumbler.setTumblersState(false);
                System.out.println("Игрушка выключила тумблер");
            }
        }
    }
}
