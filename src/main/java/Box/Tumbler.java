package Box;

public class Tumbler {

    private static Tumbler instance = null;

    private volatile boolean tumblersState;

    public static synchronized Tumbler getInstance() {
        if (instance == null) {
            instance = new Tumbler();
        }
        return instance;
    }

    private Tumbler() {
        tumblersState = false;
    }

    public void setTumblersState(boolean tumblersState) {
        this.tumblersState = tumblersState;
    }

    public boolean isTumblersState() {
        return tumblersState;
    }
}
