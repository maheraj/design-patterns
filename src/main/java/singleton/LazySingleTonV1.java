package singleton;

// Lazy - improve application performance over Eager
// Not thread same
public class LazySingleTonV1 {
    public static LazySingleTonV1 instance;

    private LazySingleTonV1() {

    }

    public static LazySingleTonV1 getInstance() {
        if (instance == null) {
            instance = new LazySingleTonV1();
        }
        return instance;
    }
}
