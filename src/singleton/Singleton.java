package singleton;

/**
 * Created by OskarPraca on 2017-03-20.
 */
public class Singleton {


    private static Singleton instance = null;
    public String someText;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }




}
