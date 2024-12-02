package utility_class_room;

public final class UtilityClass {
    private UtilityClass(){

    }

    public static String printHello(String name){
        return name + ", hello!";
    }

    public static int comparison(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int multiply(int a, int b) {
        return a*b;

    }

    public static int squareRes(int a) {
        return a*a;
    }


}
