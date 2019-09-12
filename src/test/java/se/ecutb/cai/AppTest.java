package se.ecutb.cai;

import org.junit.Before;
import org.junit.Test;
import se.ecutb.cai.model.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    private int[] buy = {1, 5, 10, 20, 50, 100, 500, 1000};
    Mat chips = new Mat("Chips", 20, 11, 150);
    Frukt äpple = new Frukt("Äpple", 5, 22, "Royal Gala");
    Dryck cola = new Dryck("Cola", 15, 33, 330 );
    private Product[] products = {chips, äpple, cola};
    VendingMachine vendingMachine = new VendingMachineImplements(buy, products, 0) {
    };


    @Test
    public void existenceOfFood() {
        assertEquals("Chips", products[0].getName());

    }
    @Test
    public void examine_test(){
        assertEquals(11, products[0].getId());
    vendingMachine.getDescription(1);
    vendingMachine.getDescription(2);
    vendingMachine.getDescription(3);
    }

    @Test
    public void addCurrency_test(){
        vendingMachine.addCurrency(50);
        assertEquals(50, vendingMachine.getBalance());
    }
    @Test
    public void request_test(){
        vendingMachine.addCurrency(50);
        vendingMachine.request(1);
        assertEquals(30, vendingMachine.getBalance());
    }
    @Test
    public void endSession_test(){

        vendingMachine.addCurrency(50);
        vendingMachine.request(1);
        int växel = vendingMachine.endSession();
        assertEquals(30, växel);
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    public void getProducts_test(){
        String[] expected = {"Chips #11", "Äpple #22", "Cola #33"};
        assertArrayEquals(expected, vendingMachine.getProducts());
    }

    @Test
    public void use_test(){
        String expectedLäsk = "Du har köpt en läsk";
        String actualLäsk = cola.use();
        assertEquals(expectedLäsk, actualLäsk);
    }





}
