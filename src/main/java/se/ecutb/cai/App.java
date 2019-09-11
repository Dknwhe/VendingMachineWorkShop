package se.ecutb.cai;


import se.ecutb.cai.model.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] buy = {1, 5, 10, 20, 50, 100, 500, 1000};
        Product[] products = {new Mat("Chips", 20, 11, 150),
                new Frukt("Äpple", 5, 22, "Royal Gala"),
                new Dryck("Cola", 15, 33, 330)
        };
        int x = 0;
        boolean keepAlive = true;
        VendingMachine vm = new VendingMachineImplements(buy, products, x);
        while (keepAlive) {
            System.out.println("Hur mycket ska du sätta in? 1kr, 5kr, 10kr, 20kr, 50kr, 100kr, 500kr, 1000kr,");
            x = Integer.parseInt(scanner.nextLine());
            vm.addCurrency(x);





        }
    }
}
