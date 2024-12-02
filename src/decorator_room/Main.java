package decorator_room;

public class Main {
    public static void main(String[] args) {
        Shop myNewBlackJeans = new BlackJeansDecorator(new Jeans());
        Shop myNewBlueJeans= new BlueJeansDecorator(new Jeans());

        System.out.println( myNewBlackJeans.cost() + "\n" );
        System.out.println(myNewBlueJeans.cost() );
    }
}

