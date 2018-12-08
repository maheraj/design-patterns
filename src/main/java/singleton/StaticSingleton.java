package singleton;

// Eager slow down application startup
public class StaticSingleton {
    private static final StaticSingleton instance = new StaticSingleton();

    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return instance;
    }
}
