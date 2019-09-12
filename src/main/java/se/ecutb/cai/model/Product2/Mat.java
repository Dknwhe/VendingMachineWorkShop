package se.ecutb.cai.model.Product2;

public class Mat extends Product {

    public int vikt;

    public Mat(String name, int price, int id, int vikt) {
        super(name, price, id);
        this.vikt = vikt;
    }

    public int getVikt() {
        return vikt;
    }

    public String examine(){
        return "Namn: " + getName() + " Pris: " + getPrice() + " Vikt: " + getVikt() + " g";
    }

    public String use(){
        return "Du har köpt Mat";
    }
}
