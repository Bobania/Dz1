package utility_class_room;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int multiplyResult = UtilityClass.multiply(a, b);
        System.out.println(multiplyResult);
        System.out.println(UtilityClass.printHello("William"));
        System.out.println(UtilityClass.squareRes(a));
        System.out.println(UtilityClass.comparison(UtilityClass.multiply(a, b), UtilityClass.squareRes(a)));
    }
}
