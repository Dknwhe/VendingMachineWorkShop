package se.ecutb.cai.model.Product2;

public abstract class Product {

    private String name;
    private int price;
    private int id;

    public Product(String name, int price, int id) {
        super();
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

   public abstract String use();

    public abstract String examine();
}
