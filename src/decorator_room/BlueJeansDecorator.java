package decorator_room;

public class BlueJeansDecorator extends ShopDecorator{
    public BlueJeansDecorator(Shop decoratedShop) {
        super(decoratedShop);
    }
    public int cost() {
        setBlueColor(decoratedShop);
        return decoratedShop.cost();
    }

    private void setBlueColor (Shop decoratedShop) {
        System.out.println("Голубые джинсы");
    }

}
