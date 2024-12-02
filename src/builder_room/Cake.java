package builder_room;

public class Cake {
    private String berries;
    private String name;
    private String size;
    private String filling;
    private String base;


    public Cake(String name, String size, String filling, String base, String berries) {
        this.name = name;
        this.size = size;
        this.filling = filling;
        this.base = base;
        this.berries = berries;
    }

    public String getSize() {
        return size;
    }


    public String getBase() {
        return base;
    }
    public String getName(){
    return name;
    }

    public String getBerries() {
        return berries;
    }

    public String getFilling() {
        return filling;
    }

    @Override
    public String toString() {
        return "Название: " + name + ", Размер: " + size  + (base != null ? ", Основа: "+ base : "")
                + (filling != null ? ", Начинка: "+ filling : "") + (berries != null ? ", Ягоды: " + berries : "");
    }
}
