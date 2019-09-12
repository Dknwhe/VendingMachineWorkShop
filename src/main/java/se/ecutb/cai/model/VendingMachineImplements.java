package se.ecutb.cai.model;


public class VendingMachineImplements implements VendingMachine {

    private int []  buy = { 1, 5, 10, 20, 50, 100, 500, 1000};
    private Product [] products = {new Mat("Chips", 20, 11, 150),
            new Frukt("Äpple", 5, 22, "Royal Gala"),
            new Dryck("Cola", 15, 33, 330 )
    } ;
    private int moneyPool;



    public VendingMachineImplements(int[] buy, Product[] products, int moneyPool) {
        this.buy = buy;
        this.products = products;
        this.moneyPool = moneyPool;
    }


    public void addCurrency(int amount){
        for(int i : buy){
            if(i == amount){
                moneyPool = moneyPool + amount;
            }
        }
    }
    public Product request(int choice){
        Product bought = null;
        switch(choice){
            case 1: bought = products[0];
            moneyPool = moneyPool - bought.getPrice();
                System.out.println(bought.use());
            break;
            case 2: bought = products[1];
                moneyPool = moneyPool - bought.getPrice();
                System.out.println(bought.use());
            break;
            case 3: bought = products[2];
                moneyPool = moneyPool - bought.getPrice();
                System.out.println(bought.use());
                break;
        }
        return bought;
    }

    public int endSession(){
        int växel = moneyPool;
        moneyPool = 0;
        return växel;
    }


    public String getDescription (int choice){
        Product bought;
        String description = "";

        switch (choice){
            case 1: bought = products[0];
            description = bought.examine();
                 System.out.println(description);
                break;
            case 2: bought = products[1];
            description = bought.examine();
                System.out.println(description);
                break;
            case 3: bought = products[2];
            description = bought.examine();
                System.out.println(description);
                break;
        } return description;
    }

    public int getBalance(){
        return moneyPool;
    }

    public String[] getProducts(){
        String [] get = new String[products.length];
        for (int x = 0; x < get.length; x++){
            get[x] = products[x].getName() + " #" + products[x].getId();
        }
        return get;
    }







}
