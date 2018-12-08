package singleton;

// Lazy - double check loc, synchronized block

public class LazySingletonV3 {
    public static volatile LazySingletonV3 instance;

    private LazySingletonV3() {

    }

    public static LazySingletonV3 getInstance() {
        if (instance == null) {
            synchronized (LazySingletonV3.class) {
                if (instance == null) {
                    instance = new LazySingletonV3();
                }
            }
        }
        return instance;
    }
}
