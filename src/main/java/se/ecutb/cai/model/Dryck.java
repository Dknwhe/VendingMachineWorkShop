package se.ecutb.cai.model;

public class Dryck extends Product {

    private int volume;

    public Dryck(String name, int price, int id, int volume) {
        super(name, price, id);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String examine(){
        return "Name: " + getName() + " Price: " + getPrice() + " volume: " + getVolume() + " ml";
    }

    @Override
    public String use(){
        return "Du har köpt en läsk";
    }
}
