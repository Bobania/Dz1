package singletone_room;

public class Singleton {
    private static  Singleton instance = new Singleton();

    public Singleton() {
    }

    public static Singleton getInstance() {

        return instance;
    }
}
