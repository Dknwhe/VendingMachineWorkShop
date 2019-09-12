package se.ecutb.cai.model.Product2;

public class Frukt extends Product {

    private String fruktNamn;

    public Frukt(String name, int price, int id, String fruktNamn) {
        super(name, price, id);
        this.fruktNamn = fruktNamn;
    }

    public String getFruktNamn() {
        return fruktNamn;
    }

    @Override
    public String examine(){
        return "Namn: " + getName() + " Pris: " + getPrice() + " Fruktsorts: " + getFruktNamn();
    }

    public String use(){
        return "Du har köpt en frukt";
    }
}
