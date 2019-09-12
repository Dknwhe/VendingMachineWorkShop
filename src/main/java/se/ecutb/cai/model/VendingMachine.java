package se.ecutb.cai.model;

import se.ecutb.cai.model.Product2.Product;

public interface VendingMachine {

    void addCurrency (int amount); // Lä    gga till i insättningspoolen (moneyPool).
    Product request (int productNumber); //  Köpa en Product.
    int endSession (); //Ge tillbaka växel och nollställer insättningspoolen.
    String getDescription (int productNumber); // Se en produktbeskrivning.
    int getBalance (); // Returnerar insättningspoolen
    String [] getProducts (); // returnerar alla Produkters namn och produktnummer



}
