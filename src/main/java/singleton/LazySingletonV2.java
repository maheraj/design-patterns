package singleton;

public class LazySingletonV2 {
    public static volatile LazySingletonV2 instance;

    private LazySingletonV2() {

    }

    public static synchronized LazySingletonV2 getInstance() {
        if (instance == null) {
            instance = new LazySingletonV2();
        }
        return instance;
    }
}
