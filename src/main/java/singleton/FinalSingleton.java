package singleton;

import java.io.Serializable;

// Lazy - Reflection safe
// Serialization safe
public class FinalSingleton implements Serializable {
    public static volatile FinalSingleton instance;

    private FinalSingleton() {
        if (instance != null) {
            throw new RuntimeException(("Use getInstance() to create"));
        }
    }

    public static FinalSingleton getInstance() {
        if (instance == null) {
            synchronized (FinalSingleton.class) {
                if (instance == null) {
                    instance = new FinalSingleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
