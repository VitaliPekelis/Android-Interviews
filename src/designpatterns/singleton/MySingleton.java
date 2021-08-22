package designpatterns.singleton;

public class MySingleton {
    private static final MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton () { /* private constructor */ }
}
