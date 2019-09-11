package se.ecutb.cai.model;

public interface VendingMachine {

    void addCurrency (int amount); // Lägga till i insättningspoolen (moneyPool).
    Product request (int productNumber); //  Köpa en Product.
    int endSession (); //Ge tillbaka växel och nollställer insättningspoolen.
    String getDescription (int productNumber); // Se en produktbeskrivning.
    int getBalance (); // Returnerar insättningspoolen
    String [] getProducts (); // returnerar alla Produkters namn och produktnummer



}
