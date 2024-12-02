package decorator_room;

public class ShopDecorator implements Shop{
    protected Shop decoratedShop;

    public ShopDecorator (Shop shop) {
        this.decoratedShop = shop;
    }
    public int cost() {
        return decoratedShop.cost();
    }
}
