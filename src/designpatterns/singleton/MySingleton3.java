package designpatterns.singleton;

public class MySingleton3 {

    private static MySingleton3 uniqueInstance;

    private MySingleton3() {/* private constructor */}

        public static synchronized MySingleton3 getInstance () {
            if (uniqueInstance == null) {
                uniqueInstance = new MySingleton3();
            }

            return uniqueInstance;
        }
    }
