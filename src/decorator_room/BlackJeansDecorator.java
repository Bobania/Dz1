package decorator_room;

public class BlackJeansDecorator extends ShopDecorator{
    public BlackJeansDecorator(Shop shop) {
        super(shop);
    }

    public int cost() {
        setBlackColor(decoratedShop);
        return decoratedShop.cost() + 500;
    }
    private void setBlackColor (Shop decoratedShop) {
        System.out.println("Черные джинсы");
    }

}
