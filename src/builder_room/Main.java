package builder_room;

public class Main {

    public static void main(String[] args) {
    Cake napoleon = new CakeBuilder("Наполеон", "medium").setBase("Мука").setFilling("Сливочно-сахарное").build();
    Cake tiramisu = new CakeBuilder("Тирамису", "small").setFilling("Нежный крем").build();
    Cake yagodniy = new CakeBuilder("Ягодный пирог", "medium").setBase("Мука").setFilling("Желе").setBerries("Клубничка").build();
        System.out.println(napoleon);
        System.out.println(tiramisu);
        System.out.println(yagodniy);
    }

}
