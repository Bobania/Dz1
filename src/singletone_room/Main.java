package singletone_room;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println((singleton == singleton1) && (singleton1 == singleton2) && (singleton2 == singleton3));

    }

}
