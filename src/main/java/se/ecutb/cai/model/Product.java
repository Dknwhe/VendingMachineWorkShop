package se.ecutb.cai.model;

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

    public Product buy(int moneyPool){
        if(getPrice() > moneyPool){
            return null;
        }
        else{
            return this;
        }
    }

    abstract String use();

    public abstract String examine();
}
