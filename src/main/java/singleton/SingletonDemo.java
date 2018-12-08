package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        StaticSingleton singleton = StaticSingleton.GetInstance();
        System.out.println(singleton);

        StaticSingleton anotherSingleton = StaticSingleton.GetInstance();
        System.out.println(anotherSingleton);

    }
}
