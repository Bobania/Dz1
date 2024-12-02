package builder_room;

 class CakeBuilder {
     private String berries;
     private String name;
     private String size;
    private String filling;
    private String base;


    public CakeBuilder(String name, String size) {
        this.name = name;
        this.size = size;
        //this.filling = filling;
        //this.base = base;
    }



    public CakeBuilder setFilling(String filling) {
        this.filling = filling;
        return this;
    }

    public CakeBuilder setBase(String base) {
        this.base = base;
        return this;
    }

     public CakeBuilder setBerries(String berries) {
         this.berries = berries;
         return this;
     }

     public Cake build() {
        return new Cake(name, size, filling, base, berries);
    }
}
