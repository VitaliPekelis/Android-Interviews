package designpatterns.singleton;

public class MySingleton2 {

    private static volatile MySingleton2 uniqInstance;

    private MySingleton2() { /* private constructor */}

    public static MySingleton2 getInstance() {
        if (uniqInstance == null) {
            synchronized (MySingleton2.class) {
                if (uniqInstance == null) {
                    uniqInstance = new MySingleton2();
                }
            }
        }

        return uniqInstance;
    }
}
