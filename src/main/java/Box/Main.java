package Box;

public class Main {

    public static void main(String[] args) {
        Thread user = new User();
        Thread toy = new Toy();

        user.start();
        toy.start();
        try {
            user.join();
            toy.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Box is " + (Tumbler.getInstance().isTumblersState() ? "Open" : "Closed"));
    }
}
