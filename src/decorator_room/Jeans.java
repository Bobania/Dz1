package decorator_room;

public class Jeans implements Shop{
    @Override
    public int cost() {
        System.out.println("за");
        return 2000;
    }
}
