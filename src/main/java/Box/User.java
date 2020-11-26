package Box;

public class User extends Thread {

    @Override
    public void run() {
        final int sleepTime = 2000;
        final int times = 5;
        Tumbler tumbler = Tumbler.getInstance();
        for (int i = 0; i < times; i++) {
            tumbler.setTumblersState(true);
            System.out.println("Пользователь включил тумблер");
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End");
    }
}
